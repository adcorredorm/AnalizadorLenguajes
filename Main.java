public class Main{

	class LEXEMA{
	double LEXEMA;
	}

	boolean tk;
	String lt;
	double llt;
	double up;

	double val_num;
	boolean val_time;

	class INFO_PAL_RESERV{
	boolean INFO_PAL_RESERV;
	}
	class pal{
	String pal;
	}
	class lex{
	boolean lex;
	}

	boolean pal_reserv;

	final double S_CONST_NUM = 0;
	final double S_NOMBRE_VAR = 2;
	final double S_MENOS = 100;
	final double S_MAS = 101;
	final double S_MULT = 102;
	final double S_DIV = 103;
	final double S_PARENT_I = 110;
	final double S_PARENT_D = 111;
	final double S_LLAVE_I = 112;
	final double S_LLAVE_D = 113;
	final double S_MENOR = 120;
	final double S_MENOR_IGUAL = 121;
	final double S_MAYOR = 122;
	final double S_MAYOR_IGUAL = 123;
	final double S_IGUAL = 124;
	final double S_DISTINTO = 125;
	final double S_ASIGNACION = 130;
	final double S_COMA = 131;
	final double S_PUNTO_Y_COMA = 132;
	final double R_VAR = 200;
	final double R_INICIO = 201;
	final double R_FIN = 202;
	final double R_IF = 203;
	final double R_ELSE = 204;
	final double R_WHILE = 205;
	final double R_READ = 220;
	final double R_PRINT = 221;
	final double S_EOF = -1;
	final double S_NADA = -2;
	final double S_ERROR = -3;

	final double MAX_SIMBOLOS = 300;

	class TTipo{
	double TTipo;
	}

	final double t_NUM = 1024;
	final double t_TIME = 1025;

	class INFO_SIMB{
	boolean INFO_SIMB;
	}
	class nombre{
	String nombre;
	}
	class tipo{
	boolean tipo;
	}
	class dir{
	double dir;
	}
	class val_inicial{
	double val_inicial;
	}

	boolean tabs;
	double cs;

	final double MAX_CODIGO = 300;
	final double TOT_INSTRUCCIONES = 21;

	class INSTRUCCION{
	double INSTRUCCION;
	}
	class INFO_CODIGO{
	boolean INFO_CODIGO;
	}
	class inst{
	boolean inst;
	}
	class op{
	double op;
	}
	class INFO_INSTR{
	boolean INFO_INSTR;
	}
	class nombre{
	String nombre;
	}
	class usa_op{
	boolean usa_op;
	}

	boolean codigo;
	double tot_inst;
	boolean info_instr;

	final double CX_CMP_MENOR = 1;
	final double CX_CMP_MAYOR = 2;
	final double CX_CMP_MENOR_IGUAL = 3;
	final double CX_CMP_MAYOR_IGUAL = 4;
	final double CX_CMP_IGUAL = 5;
	final double CX_CMP_DISTINTO = 6;
	final double CX_MAT_SUMAR = 7;
	final double CX_MAT_RESTAR = 8;
	final double CX_MAT_MULT = 9;
	final double CX_MAT_DIV = 10;
	final double CX_MAT_CAMB_SIGNO = 11;
	final double CX_APILAR_CONST = 12;
	final double CX_APILAR_VALOR_VAR = 13;
	final double CX_IVAR = 14;
	final double CX_APILAR_DIR = 15;
	final double CX_ASIGNAR = 16;
	final double CX_SALTAR = 17;
	final double CX_SALTAR_SI_FALSO = 18;
	final double CX_LEER = 19;
	final double CX_IMPRIMIR = 20;
	final double CX_PARAR = 21;

	final double MAX_MEMORIA = 500;

	class ELEM_PILA{
	double ELEM_PILA;
	}

	boolean pila;
	double tp;

	double cant_error;
	boolean mostrar_inst;

	final String SE_ESPERA = "Se espera ";

	public static void main(String[] args){
		cant_error = 0;

		inicializar_pal_reserv();
		inicializar_scanner();
		inicializar_tabs();
		inicializar_codigo();
		if(pudo_abrirse_fuente()){		pudo_abrirse_fuente();		sgte_lex();
		analizar_fuente();
		if(cant_error==0){		==		if(mostrar_inst){		imprimir_codigo();
		}else{		inicializar_interprete();
		set_stdin("");
		ejecutar();
		}
		}
		}
	}

	public static nomb_fuente pudo_abrirse_fuente(){
	}

	public static void inicializar_pal_reserv(){
		pal_reserv = {{"var",;

















	}

	public static void inicializar_scanner(){
		lt = "";

		llt = 0;

		up = 1;

		set_ifs('\n');
	}

	public static void leer_sgte_linea(){
		if(noteof()){		eof();		leer(lt);
		llt = strlen(lt);
		strlen(lt);
		up = 0;

		}else{		llt = -1;

		}
	}

	public static r es_letra(){
	}

	public static r es_digito(){
	}

	public static k es_palabra_reserv(){
	}

	public static void leer_identif(){
		double pos_i;
		String c;
		boolean ipr;

		pos_i = up;

		do{
		inc(up);
		c = substr(lt,up,1);
		substr(lt,up,1);
		es_letra(c);		es_digito(c);		));

		dec(up);
		subcad = substr(lt,pos_i,(up-pos_i)+1);
		substr(lt,pos_i,(up-pos_i)+1);
		if(es_palabra_reserv(subcad,ipr)){		es_palabra_reserv(subcad,ipr);		tk = ipr.lex;

		}else{		tk = S_NOMBRE_VAR;

		}
	}

	public static String leer_constante_entera(){
		double pos_i;
		String c;

		pos_i = up;

		do{
		inc(up);
		c = substr(lt,up,1);
		substr(lt,up,1);
		es_digito(c);		));

		dec(up);
		substr(lt,pos_i,(up-pos_i)+1);	}

	public static void leer_constante_numerica(){
		String num_cad;

		tk = S_NADA;

		num_cad = leer_constante_entera();
		leer_constante_entera();
		if(substr(lt,up+1,1)=='.'){		==		substr(lt,up+1,1);		inc(up,2);
		if(es_digito(substr(lt,up,1))){		es_digito(substr(lt,up,1));		substr(lt,up,1);		num_cad = ;



		leer_constante_entera();
		}else{		tk = S_ERROR;

		}
		}
		val_num = val(num_cad);
		val(num_cad);
		if(tk==S_NADA){		==		tk = S_CONST_NUM;

		}
	}

	public static void sgte_lex(){
		String c;

		tk = S_NADA;

		subcad = "";

		while(tk==S_NADA){		==		if(up>=llt){		>=		leer_sgte_linea();
		if(llt==-1){		==		tk = S_EOF;

		}
		}
		if(tk<>S_EOF){		<>		inc(up);
		c = substr(lt,up,1);
		substr(lt,up,1);
if(c==''){		==}


		}


		}
		es_letra(c);
		leer_identif();
		es_digito(c);
		leer_constante_numerica();


		tk = ;





		if(lt[up+1]=='-'){		==		up = llt+1;

		}else{		tk = S_MENOS;

		}


		tk = ;





		tk = ;





		tk = ;





		tk = ;





		tk = ;





		tk = ;





		tk = ;





		tk = ;





		if(lt[up+1]=='='){		==		tk = S_MENOR_IGUAL;

		inc(up);
		}else{		tk = S_MENOR;

		}


		if(lt[up+1]=='='){		==		tk = S_MAYOR_IGUAL;

		inc(up);
		}else{		tk = S_MAYOR;

		}


		if(lt[up+1]=='='){		==		tk = S_IGUAL;

		inc(up);
		}else{		tk = S_ASIGNACION;

		}


		if(lt[up+1]=='='){		==		tk = S_DISTINTO;

		inc(up);
		}else{		tk = S_ERROR;

		}
		tk = S_ERROR;

		subcad = ;



	}

}
