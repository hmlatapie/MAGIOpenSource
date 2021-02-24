#!/usr/bin/perl
use Data::Dumper;
use Carp;
use Time::HiRes qw(time sleep);
use Getopt::Long;

$usage = <<EOS;
$0 cmd options
	valid commands:
		t1 logfilename maxhops [minhops]

	options:
EOS

GetOptions(
	'stringparam=s' => \$options{stringparam},
	'booleanparam' => \$options{booleanparam}
	);

confess $usage
	if !@ARGV;

$command = shift;

if($command eq 't1')
{
	$logfilename = shift;
	$maxhops = shift;
	$minhops = shift;
	die $usage
		if !$maxhops;

	$logfilename =~ /^(.*?)\.log/;
	$basename = $1;
	%prior;
	%histo;
	@rows = `cat $logfilename`;
	for $row (@rows)
	{
		$row =~ /^(.*?\>\.)/;
		$row = $1;
		if($row =~ /^OUT/)
		{
			$tmp = $row;
			$tmp =~ s/\#//g;
			$tmp =~ s/(<->)|(\{--)|(--\])|(\{-\])|(=\/>)|(=\|>)|(=\\>)|(<\/>)|(<\|>)|(-->)|(==>)|(<=>)/#/g;
			$tmp =~ s/[^#]//g;
			$opcount = length($tmp);
			++$histo{$opcount};
			$maxopcount = $opcount
				if $opcount > $maxopcount;
			if( !$prior{$row} && ($opcount <= $maxhops) && ($opcount >= $minhops))
			{
				++$count;
				$prior{$row} = 1;
				push @out, $row;
			}
		}
	}
# output with line numbers
	$rownbr = 1;
	open $output, ">$basename" . "_output.log";
	$rownbr = 1;
	%bylength;
	for $row (@out)
	{
		$len = length($row);
		print $output "$rownbr: $row\n";
		++$rownbr;
	}
# output clean nars 
	$rownbr = 1;
	$output_cleannars = $basename . "_output_cleannars.log";
	open $output, ">$output_cleannars";
	$rownbr = 1;
	%bylength;
	for $row (@out)
	{
		$row =~ s/^.*?OUT: //;
		print $output "$row\n";
		++$rownbr;
	}
	for $opcount (sort {$a <=> $b}  keys %histo)
	{
      $count = $histo{$opcount};	
		print "$opcount: $count\n";
	}
	print "count: $count maxopcount: $maxopcount\n";
	`./nars2networkx.py $output_cleannars`;
	print `mv test.graphml $basename.graphml`;
}
else
{
	confess $usage;
}

