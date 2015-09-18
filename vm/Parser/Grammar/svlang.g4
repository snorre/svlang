grammar SVLang;

expr 
	: value
	;

value 
	: BOOL
	| NUM
	| STRING
	;


BOOL 
	: ('true' | 'false') 
	;

NUM 
	: '-'?[0-9]+ 
	;

STRING
	: '"' ~('\r' | '\n' | '"')* '"' 
	;

//ID : [a-z]+ ;             // match lower-case identifiers
//WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines