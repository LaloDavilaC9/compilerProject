
package jflexpackage;

import java.io.File;

public class Temporal {
    public static void main(String[] args) {
        String ruta = "D:/Lalo/Tareas/UNIVERSIDAD/Octavo Semestre/Compiladores/Primer Parcial/IDE/compilerProject/compilerIDE/src/jflexpackage/Lexer.flex";
        generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
