grammar SVLang;

expr 
	: value
	| callFunction
	| defineFunction
	| ifLine
	| codeblock
	| first
	;

value 
	: BOOL
	| NUM
	| STRING
	;

callFunction
	: '(' ID parameterList ')'
	;

parameterList
	: value*
	;

defineFunction
	: ID '=' ( value | codeblock )
	;

ifLine
	: callFunction '->' ( callFunction | value )
	;

codeblock
	: '{' EOL codeblockline* '}'
	;

codeblockline 
	: expr EOL
	;

first
	: 'first' '{' EOL firstline+ firstelse? '}'
	;

firstline
	: ifLine EOL
	;

firstelse
	: ( value | callFunction ) EOL
	;

BOOL 
	: ('true' | 'false') 
	;

NUM 
	: '-'?DIGIT+ 
	;

STRING
	: '"' ~('\r' | '\n' | '"')* '"' 
	;

ID
	: NONDIGIT ( NONDIGIT | DIGIT )*
	;

fragment
NONDIGIT
	: [a-zA-Z_]
	;

fragment
DIGIT
	: [0-9]
	;

WS
	: [ \t]+ -> skip
	;

EOL 
	: ( '\r'? '\n' | '\r' )+
	;