grammar example;		

commands	: command* EOF;

command 	: conditional
			| repeat
			| printexpr 
			| VAR ID 'as' expr SMCOLON
			;

conditional : 'if' expr ROP expr 'then' command* 'endif';
repeat		: 'repeat' expr 'times' command* 'endrepeat';
printexpr	: 'print' expr SMCOLON ;

expr:	expr MULOP expr
    |	expr SUMOP expr
    |	DOUBLE
    |	PIZQ expr PDER
    | 	ID
    ;

COMMENT 		: '/*' .*? '*/' -> skip ;
LINE_COMMENT 	: '//' ~[\r\n]* -> skip ;
WS		: [ \t\r\n]+ -> skip ;
VAR		: 'var';
PIZQ	: '(' ;
PDER	: ')' ;
ROP		: ( '<' | '<=' | '>=' | '>' | '==' | '!=' ) ;
SMCOLON : ';' ;
MULOP	: ( '*' | '/' );
SUMOP	: ('+' | '-') ;
DOUBLE	: [0-9]+( | [.][0-9]+);
ID 		: [a-zA-Z][a-zA-Z0-9_]* ;