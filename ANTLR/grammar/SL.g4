grammar SL;	

// Inicio
inicio: programa? declaracion* 'inicio' sentencia* 'fin' subrutina*;

programa: 'programa' ID ';'?;

// Declaraciones iniciales

declaracion: (constantes | tipos | variables) ';'?;

constantes: 'constantes' (identificador '=' tipo_dato ';'?)+; //TODO: Esto permite que haya 2 ';' seguidos...
tipos: 'tipos' (declaracion_campo)+;
declaracion_campo: ID ':' tipo_dato ';'?;
variables: 'var' (ID (',' ID)* ':' tipo_dato '=' dato ';'?)+; //TODO: No estoy seguro que sea igual a dato

// Subrutinas

subrutina: subrutina_base ( metodo | funcion );

subrutina_base: 'subrutina' ID '(' parametros_subrutina? ')';
metodo: declaracion* 'inicio' sentencia* 'fin';
funcion: 'retorna' ID declaracion* 'inicio' sentencia* 'retorna' '(' ID ')' 'fin'; //TODO: Revisar
parametros_subrutina: 'ref'? ID ':' tipo_dato (',' 'ref'? ID ':' tipo_dato)*;

// Sentencias

sentencia: (llamadoFuncion | asignacion | estructura_control) ';'?;

llamadoFuncion: ID '(' parametros? ')';
parametros: (identificador | dato | llamadoFuncion) (',' identificador | dato | llamadoFuncion)*;

operacion_matematica: (identificador | NUM) (OP_MAT numerico)* //TODO: deberia ser numerico (OP_MAT numerico)?
            | '(' operacion_matematica ')';

asignacion: identificador '=' dato;

estructura_control: condicional | mientras | repetir_hasta | desde | eval;

condicional: 'si' '(' logico ')' '{' sentencia* '}';//TODO: revisar como va el else y elseif

mientras: 'mientras' '(' logico ')' '{' sentencia* '}';

repetir_hasta: 'repetir' sentencia* 'hasta' '(' logico ')';//TODO: revisar si no van llaves entre las sentencias

desde: 'desde' ID '=' numerico 'hasta' numerico ('paso' numerico)? '{' sentencia* '}';

eval: 'eval' '{' caso+ '}';//TODO: revisar el dafault
caso: 'caso' '(' logico ')' sentencia*;

// Definiciones extendidas

tipo_dato: ID | estructura | registro | 'numerico' | 'cadena' | 'logico';

dato: cadena | numerico | logico | estructura | registro;

identificador: ID ('.' identificador | '[' numerico ']')*;
numerico: identificador | ('+' | '-')? NUM | operacion_matematica | llamadoFuncion;
cadena: STR ('+' STR)* | llamadoFuncion;
logico: (LOG | ID | 'not' logico | llamadoFuncion | comparacion) (('and' | 'or') logico)* 
    | '(' logico ')';

estructura: ('vector' | 'matriz') '[' dim ']' tipo_dato;
dim: ('*' | numerico) (',' ('*' | numerico))*;//TODO: desde aca se puede forzar el orden de *

registro: 'registro' '{' (declaracion_campo)+ '}';

comparacion: numerico OP_COMP numerico;//TODO: Esto no deja comparar cadenas ni booleanos

// Definicion de Tokens

COMMENT:        '/*' .*? '*/'   -> skip ;
LINE_COMMENT:   '//' ~[\r\n]*   -> skip ;
WS:             [ \t\r\n]+      -> skip ;

ID: [a-zA-Z_][a-zA-Z0-9_]*;

NUM: [0-9]+(REAL | CTF)?;
REAL: '.'[0-9]+(CTF)?;
CTF: ('e' | 'E')('+' | '-')[0-9]+;

STR: '"' .*? '"' | '\'' .*? '\'';

LOG: 'SI' | 'TRUE' | 'NO' | 'FALSE';

OP_COMP: '<' | '<=' | '==' | '<>' | '>=' | '>';
OP_MAT : '+' | '-' | '*' | '/' | '%' | '^';