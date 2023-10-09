/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintactico;

import java.util.Arrays;
import java.util.HashMap;
import jflexpackage.IDE;



class SymbolNode{
    public String type;
    public Object value;

    SymbolNode(String _type, Object _value){
        type = _type;
        value = _value;
    }
}



public final class SymTable{

    public static HashMap<String, SymbolNode> symbolTable = new HashMap<String, SymbolNode>();
    
    public static int tempCount = 0;
    

    public static void AddTemporalIndex(SymbolNode temp){
        String id = "temp_" + tempCount;
        AddIndex(id, temp.type);
        UpdateIndex(id, temp);
        tempCount++;
    }
    public static boolean AddIndex(String id, String type){
        if(symbolTable.containsKey(id)){
            //arrojar error de ID ya existente
            return false;
        }

        symbolTable.put(id, new SymbolNode(type, null));
        return true;
    }

    public static boolean RemoveIndex(String id){
        if(symbolTable.containsKey(id)){
            symbolTable.remove(id);
            return true;
        }else{
            //arrojar error de ID no existente
            return false;
        }
    }

    public static SymbolNode GetIndex(String id){
        if(symbolTable.containsKey(id)) return symbolTable.get(id);
        else{
            IDE.errores += "ERROR: Var no existe \n";            
        }
        return new SymbolNode("",null);
    }

    public static boolean UpdateIndex(String id, SymbolNode tempVar){
        if(symbolTable.containsKey(id)){
            symbolTable.get(id).value = tempVar.value;
            return true;
        }else{
            //arrojar error de ID no existente
            return false;
        }
    }

    public static boolean Contains(String id){
        return symbolTable.containsKey(id);
    }

    public static void ClearSymbolTable(){
        symbolTable.clear();
    }
    
    public static String[][] getSymbolTable(){
        // Obtener el número de elementos en la tabla de símbolos
        int filas_num = symbolTable.size();
        
        // Crear una matriz
        String[][] tabla = new String[filas_num][3];
        
        int i = 0;
        for (HashMap.Entry<String, SymbolNode> entry : symbolTable.entrySet()) {
            String llave = entry.getKey();
            SymbolNode valor = entry.getValue();
            tabla[i][0]= "" + llave;
            tabla[i][1]= "" + valor.type;
            tabla[i][2]= "" + valor.value;
            i++;
        }
        return tabla;
        
    }

}