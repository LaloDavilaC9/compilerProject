package jflexpackage;
import static jflexpackage.Tokens.*;

%%
%class Lexer
%type Tokens
%line
%column

/*Expresiones regulares*/

Letra=[a-zA-Z_]+
Digito=[0-9]+
Identificador={Letra}({Letra}|{Digito})*
Numero={Digito}{Digito}*(\.{Digito}{Digito}*)?
espacio=[ ,\t,\r,\n]+

%{
    public String lexema;
    public int columna = 1;
    public int linea = 1;

%}

%%

/*Palabras reservadas*/
program |
bool |
float |
int |
if |
else |
fi |
do |
until |
while |
read |
write |
not |
and |
or 
{lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Reservadas;}
{espacio} {/* ignore */}
"//".* {/* ignore */}

/*Símbolos especiales*/
"=" {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Igual;}
"+" {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Suma;}
"-" {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Resta;}
"*" {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Multiplicacion;}
"/" { lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Division;}
"^" {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Potencia;}
"<" {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Menorque;}
">" {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Mayorque;}
"<=" {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Menorigualque;}
">=" {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Mayorigualque;}
"==" {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Igualque;}
"!=" {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Diferenteque;}
";" {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Semicolon;}
"," {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Coma;}
"(" {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Iparentesis;}
")" {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Dparentesis;}
"{" {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Illave;}
"}" {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Dllave;}

/*Tokens*/
{Identificador} {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Identificador;}
{Numero} {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return Numero;}
. {lexema=yytext(); columna=yycolumn+1; linea=yyline+1; return ERROR;}
