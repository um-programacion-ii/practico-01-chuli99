package entity;

import java.util.ArrayList;
import java.util.List;

public class Receta {
    protected int tiempoCoccion;
    protected List<Ingrediente> ingredientes;
    protected String preparacion;

    public Receta(int tiempoCoccion, Ingrediente[] ingredientes, String preparacion) {
        this.tiempoCoccion = tiempoCoccion;
        this.ingredientes = new ArrayList<>();
        this.preparacion = preparacion;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }
}
