package entity;

import java.util.ArrayList;
import java.util.List;

public class Despensa {
    private List<Ingrediente> ingredientes;

    public Despensa() {
        this.ingredientes = new ArrayList<>();
    }

    public void addIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public void getIngrediente(String nombre, Integer cantidad) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getNombre().equals(nombre)) {
                ingrediente.sacar(cantidad);
                return;
            }
        }
        System.out.println("No se encontró el ingrediente en la despensa.");
    }

    @Override
    public String toString() {
        return "Despensa{" +
                "ingredientes=" + ingredientes +
                '}';
    }
}
