grammar SL;	

// Inicio
inicio: programa? declaracion* 'inicio' sentencia* 'fin' subrutina*;

programa: 'programa' ID ';'?;

// Declaraciones iniciales

declaracion: (constantes | tipos | variables) ';'?;

constantes: 'constantes' (identificador '=' tipo_dato ';'?)+; //TODO: Esto permite que haya 2 ';' seguidos...
tipos: 'tipos' (ID ':' tipo_dato ';'?)+;
variables: 'var' (ID (',' ID)* ':' tipo_dato '=' dato ';'?)+; //TODO: No estoy seguro que sea igual a dato

// Subrutinas

subrutina: ;//TODO

// Sentencias

sentencia: ;//TODO

operacionMatematica: ;//TODO
llamadoFuncion: ;//TODO

// Definiciones extendidas

tipo_dato: ID | estructura | registro | 'numerico' | 'cadena' | 'logico';

dato: cadena | numerico | logico | estructura | registro;

identificador: ID ('.' identificador | '[' numerico ']')*;
numerico: identificador | ('+' | '-')? NUM | operacionMatematica | llamadoFuncion;
cadena: STR ('+' STR)* | llamadoFuncion;
logico: (LOG | ID | 'not' logico | llamadoFuncion | comparacion) (('and' | 'or') logico)? 
    | '(' logico ')';

estructura: ('vector' | 'matriz') '[' dim ']' tipo_dato;
dim: ('*' | numerico) (',' ('*' | numerico))*;//TODO: desde aca se puede forzar el orden de *

registro: ;//TODO

comparacion: ;//TODO

// Definicion de Tokens

COMMENT:        '/*' .*? '*/'   -> skip ;
LINE_COMMENT:   '//' ~[\r\n]*   -> skip ;
WS:             [ \t\r\n]+      -> skip ;

ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUM: [0-9]+; //
STR: '"' .*? '"'; //
LOG: 'SI' | 'TRUE' | 'NO' | 'FALSE';