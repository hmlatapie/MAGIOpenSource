#!/usr/bin/perl
@rows = `cat test7.txt`;
for $row (@rows)
{
	$row =~ s/(\{[^\{]+?\})\s*$//;
	print "$row\n";
}
