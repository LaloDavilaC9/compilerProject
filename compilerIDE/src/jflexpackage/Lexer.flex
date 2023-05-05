package jflexpackage;
import static jflexpackage.Tokens.*;

%%
%class Lexer
%type Tokens
Letra=[a-zA-Z_]+
Digito=[0-9]+
Identificador={Letra}({Letra}|{Digito})*
Numero= {Digito}{Digito}* (\.{Digito}{Digito}*)?
espacio=[ ,\t,\r]+
%{
    public String lexeme;
    public int Columna = 1;
    public int Linea = 1;
%}

%%
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
{lexeme=yytext(); return Reservadas;}
{espacio} {Columna += yycolumn;}
"//".* {Columna += yycolumn;}
"//".* {Columna += yycolumn;}
"=" {return Igual;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
"^" {return Potencia;}
"<" {return menorque;}
">" {return menorque;}
"<=" {return menorigualque;}
">=" {return mayorigualque;}
"==" {return igualque;}
"!=" {return diferenteque;}
";" {return semicolon;}
"(" {return iparentesis;}
")" {return dparentesis;}
"{" {return illave;}
"}" {return dllave;}
{Identificador} {return Identificador;}
{Numero} {return Numero;}
. {Columna++; return ERROR;}
