grammar Narsese;

narsese : (statement (.)+? NewLine)*;

statement
// nars output log
   : NarsLogEntryPrefix '<' '{' WORD '}' COPULA coreterm '>' (SentenceType tense?)? freqConf?  # statement1
   | NarsLogEntryPrefix '<' '(' '*' ',' coreterm ',' coreterm ')' COPULA coreterm '>' SentenceType tense? freqConf?  # statement1b
   | NarsLogEntryPrefix '<' statement COPULA statement '>' SentenceType tense? freqConf?   # statement2
   | NarsLogEntryPrefix compoundTermOpMulti SentenceType (tense)? freqConf?  # statement3
   | 'ECHO' ':' #statement4
// raw narsese
   | '<' statement COPULA statement '>'   # statement5
   | term # statement6
   ;

coreterm
   : WORD
   | '{' WORD '}'
   | '[' WORD ']'
   ;

freqConf
   : '%' FLOAT ';' FLOAT '%';

term : WORD
   | Variable 
   | compoundTerm
   | CYCLES
   | '_'
   | Believe 
   | Wonder
   ;

extensionalSet
   : '{' term ( ',' term )* '}'
   ;

compoundTerm
   : extensionalSet                                   # ctextensionalSet
   | '[' term ']'                                     # intensionalSet
   | compoundTermOpMulti                              # compoundTerm1
   | '(' Believe ',' statement (',' statement)* ')'   # compoundTerm2
   ;

compoundTermOpMulti
   : '(' opMulti ',' statement (',' statement)* ')'
   ;

tense : FutureEvent | PresentEvent | PastEvent;

opMulti
   : '&&'
   | '*'
   | '||'
   | '&|'
   | '&/'
   | '|'
   | '&'
   | '/'
   | '--'
   | '\\'
   | '-'
   | '~'
   ;

SentenceType : '.' | '?' | '!' | '@';

NarsLogEntryPrefix
   : 'OUT' ':'
   | 'EXE' ':'
   | 'IN' ':'
   | 'Answer' ':'
   ;

Believe : '^believe';
Wonder : '^wonder';

Variable : '$' (WORD|DIGIT)
   | '#' (WORD|DIGIT)
   | '?' (WORD|DIGIT)
   ;

COPULA : '-->'
   | '<->'
   | '{--'
   | '--]'
   | '{-]'
   | '==>'
   | '=/>'
   | '=|>'
   | '=\\>'
   | '<=>'
   | '</>'
   | '<|>'
   ;

FutureEvent : ':/:';
PresentEvent : ':|:';
PastEvent : ':\\:';

CYCLES : '+' DIGIT;
FLOAT : '.'? DIGIT+ '.'? DIGIT+;
DIGIT : ('0'..'9')+
   ;

WORD
   : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'-'|'_')*
   ;

NewLine : '\r\n'|'\n' ;

WS : [ \t]+ -> skip ;

LineComment
   : '//' ~ [\r\n]* -> skip
   ;

BlockComment
   : '/*' .*? '*/' -> skip
   ;


