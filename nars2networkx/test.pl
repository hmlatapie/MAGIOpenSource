#!/usr/bin/perl
use Data::Dumper;
use Carp;
use Time::HiRes qw(time sleep);
use Getopt::Long;

$usage = <<EOS;
$0 cmd options
	valid commands:
		t1 <filename>
* test1.txt : 10s log nars_ontov1_output_cleannars.log
* test2.txt : 10s log nars_ontov2_output_cleannars.log
* test3.txt : a few lines of clean nars based on dfre4retail seed ontology
* test4.txt : one line of log output combined with a few lines of clean nars 
* test5.txt : hybrid file with around 70 lines
* test6.txt : log file output consisting of 100 lines  
* test7.txt : log file output consisting of 10000 lines
* test8.txt : log file output consisting of 96000 lines  
* test9.txt : seed ontology in log file format
* test10.txt : log file 500 lines
* test11.txt : clean nars 100 lines
* test12.txt : clean nars 500 lines
* test13.txt : log file 10K lines with debug info removed
* test14.txt : log file 500 lines with debug info removed
* test15.txt : same as test13 only with no echo
* test16.txt : same as test13 only with no echo
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
	$filename = shift;
	$cmd = "time ./nars2networkx.py data/$filename";
	execute($cmd);
	$lines = `cat data/$filename |wc -l`;
	print "total number of input lines: $lines\n";
}
else
{
	confess $usage;
}

sub execute
{
	$cmd = shift;
	open $f, "$cmd |";
	print
		while <$f>;
}

