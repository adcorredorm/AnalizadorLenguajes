grammar SL;	

// Inicio
inicio: programa? declaracion* Tk_inicio sentencia* Tk_fin subrutina* EOF;

programa: Tk_programa ID Tk_pyc?;

// Declaraciones iniciales

declaracion: (constantes | tipos | variables) Tk_pyc?;

constantes: Tk_const declaracion_constante+;
declaracion_constante: identificador Tk_asignacion dato Tk_pyc?;

tipos: Tk_tipos declaracion_campo+;
declaracion_campo: ID Tk_dospuntos tipo_dato Tk_pyc?;

variables: Tk_var declaracion_variable+;
declaracion_variable: ID (Tk_coma ID)* Tk_dospuntos tipo_dato (Tk_asignacion dato)? Tk_pyc?;

// Subrutinas

subrutina: subrutina_base ( metodo | funcion );

subrutina_base: Tk_subrutina ID Tk_par_izq parametros_subrutina? Tk_par_der;
parametros_subrutina: Tk_ref? ID Tk_dospuntos tipo_dato (Tk_coma Tk_ref? ID Tk_dospuntos tipo_dato)*;

metodo: declaracion*
        Tk_inicio
            sentencia+
        Tk_fin;

funcion:Tk_retorna (tipo_dato | ID)
        declaracion*
        Tk_inicio
            sentencia+
            Tk_retorna Tk_par_izq dato Tk_par_der
        Tk_fin;

// Sentencias

sentencia: (llamadoFuncion | asignacion | estructura_control) Tk_pyc?;

llamadoFuncion: ID Tk_par_izq parametros? Tk_par_der;
parametros: dato (Tk_coma dato)*;

asignacion: identificador Tk_asignacion dato;

estructura_control: condicional | mientras | repetir_hasta | desde | eval;

condicional: Tk_if Tk_par_izq logico Tk_par_der
                Tk_llave_izq
                    sentencia+
                    sino_si*
                    sino?
                Tk_llave_der;

sino_si: Tk_elseif Tk_if Tk_par_izq logico Tk_par_der
            sentencia+;

sino: Tk_elseif
            sentencia+;

mientras: Tk_mientras Tk_par_izq logico Tk_par_der
            Tk_llave_izq
                sentencia+
            Tk_llave_der;

repetir_hasta: Tk_repetir
                sentencia+
               Tk_hasta Tk_par_izq logico Tk_par_der;

desde: Tk_desde ID Tk_asignacion numerico Tk_hasta numerico (Tk_paso numerico)?
        Tk_llave_izq
            sentencia+
        Tk_llave_der;

eval: Tk_eval Tk_llave_izq
        caso+
        caso_default?
      Tk_llave_der;

caso: Tk_caso Tk_par_izq logico Tk_par_der
        sentencia+;

caso_default: Tk_elseif
        sentencia+;

// Definiciones extendidas

tipo_dato: Tk_numericoRW | Tk_cadenaRW | Tk_cadenaRW | ID | estructura | registro;

dato: cadena | numerico | logico | estructura | registro | llamadoFuncion | identificador;

identificador: ID (Tk_punto identificador | Tk_corchete_izq numerico Tk_corchete_der)*;

numerico: (Tk_suma | Tk_resta)? NUM | identificador | llamadoFuncion
        |numerico OP_MAT numerico | Tk_par_izq numerico Tk_par_der;

cadena: STR | identificador | llamadoFuncion | cadena Tk_suma cadena;

logico: Tk_logico | identificador | llamadoFuncion
        | comparacion | Tk_negación logico
        | logico (Tk_conjunción | Tk_disyunción) logico | Tk_par_izq logico Tk_par_der;

estructura: (Tk_vector | Tk_matriz) Tk_corchete_izq dim Tk_corchete_der tipo_dato;
dim: (Tk_asterísco | numerico) (Tk_coma (Tk_asterísco | numerico))*;

registro: Tk_registro Tk_llave_izq (declaracion_campo)+ Tk_llave_der;

comparacion: numerico OP_COMP numerico | cadena OP_IDEN cadena;

// Definicion de Tokens

COMMENT:        '/*' .*? '*/'   -> skip ;
LINE_COMMENT:   '//' ~[\r\n]*   -> skip ;
WS:             [ \t\r\n]+      -> skip ;

NUM: [0-9]+(REAL | CTF)?;
REAL: '.'[0-9]+(CTF)?;
CTF: ('e' | 'E')('+' | '-')[0-9]+;

STR: '"' .*? '"' | '\'' .*? '\'';

OP_COMP: Tk_menor | Tk_menor_o_igual | Tk_mayor_o_igual | Tk_mayor | OP_IDEN;
OP_IDEN: Tk_igual_que | Tk_distinto_de;

OP_MAT : Tk_suma | Tk_resta | Tk_asterísco | Tk_división | Tk_módulo | Tk_potencia;

Tk_logico: 'TRUE' | 'FALSE' | 'SI' | 'NO';
Tk_if: 'si';
Tk_elseif: 'sino';
Tk_conjunción: 'and';
Tk_disyunción: 'or';
Tk_negación: 'not';
Tk_matriz: 'matriz';
Tk_vector: 'vector';
Tk_suma: '+';
Tk_resta: '-';
Tk_asterísco: '*';
Tk_división: '/';
Tk_módulo: '%';
Tk_potencia: '^';
Tk_asignacion: '=';
Tk_menor: '<';
Tk_mayor: '>';
Tk_menor_o_igual: '<=';
Tk_mayor_o_igual: '>=';
Tk_igual_que: '==';
Tk_distinto_de: '<>';
Tk_punto: '.';
Tk_coma: ',';
Tk_pyc: ';';
Tk_dospuntos: ':';
Tk_par_izq: '(';
Tk_par_der: ')';
Tk_llave_izq: '{';
Tk_llave_der: '}';
Tk_corchete_izq: '[';
Tk_corchete_der: ']';
Tk_var: 'var' | 'variables';
Tk_const: 'const' | 'constantes';
Tk_tipos: 'tipos';
Tk_registro: 'registro';
Tk_cadenaRW: 'cadena';
Tk_logicoRW: 'logico';
Tk_numericoRW: 'numerico';
Tk_caso: 'caso';
Tk_eval: 'eval';
Tk_desde: 'desde';
Tk_hasta: 'hasta';
Tk_paso: 'paso';
Tk_mientras: 'mientras';
Tk_repetir: 'repetir';
Tk_inicio: 'inicio';
Tk_fin: 'fin';
Tk_subrutina: 'subrutina';
Tk_retorna: 'retorna';
Tk_ref: 'ref';
Tk_programa: 'programa';

ID: [a-zA-ZñÑ_][a-zA-Z0-9ñÑ_]*;