grammar SVLang;

expr 
	: value
	| callFunction
	| defineFunction
	| ifLine
	| codeblock
	| first
	| functionRef
	;

value
	: ( valuesingle | valuelist )
	;

valuesingle 
	: BOOL
	| NUM
	| STRING
	| VOID
	;

valuelist
	: '[' valuesingle* ']'
	;

callFunction
	: '(' ID expr* ')'
	;

defineFunction
	: ID+ '=' ( value | codeblock | callFunction | first | ifLine )
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

functionRef
	: ID
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

VOID
	: 'void'
	;

ID
	: NONDIGIT ( NONDIGIT | DIGIT )*
	;

fragment
NONDIGIT
	: [a-zA-Z]
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