package sintactico;

import java.util.ArrayList;
import java.util.List;

public class NodoArbol {
    private String etiqueta;
    private List<NodoArbol> hijos;

    public NodoArbol(String etiqueta) {
        this.etiqueta = etiqueta;
        this.hijos = new ArrayList<>();
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void agregarHijo(NodoArbol hijo) {
        hijos.add(hijo);
    }

    public List<NodoArbol> getHijos() {
        return hijos;
    }
}
