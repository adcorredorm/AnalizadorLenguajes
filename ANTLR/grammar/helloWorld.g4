grammar helloWorld;

inicio  : 'hola' ID (',' ID)* EOF;
ID : 	[a-zA-Z]+ ;
ESP : [ \t\r\n]+ -> skip ;
