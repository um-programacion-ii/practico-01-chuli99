package services;
import entity.*;
import java.util.Arrays;
public class CocinaService {
    public static void prepararReceta(Chef chef, Receta receta, Ingrediente[] despensa) {
        boolean tieneIngredientes = true;

        for (long ingrediente : receta.getIngredientes()) {
            boolean encontrado = false;
            for (Ingrediente despensaIngrediente : despensa) {
                if (despensaIngrediente.getNombre().equals(ingrediente.getNombre())) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("El chef " + chef.getNombre() + " no tiene suficientes ingredientes para preparar la receta.");
                tieneIngredientes = false;
                break;
            }
        }

        if (tieneIngredientes) {
            System.out.println("El chef " + chef.getNombre() + " está preparando la receta:");
            System.out.println("Tiempo de cocción: " + receta.getTiempoCoccion() + " minutos");
            System.out.println("Ingredientes: " + Arrays.toString(receta.getIngredientes()));
            System.out.println("Preparación: " + receta.getPreparacion());

            for (long ingrediente : receta.getIngredientes()) {
                for (Ingrediente despensaIngrediente : despensa) {
                    if (despensaIngrediente.getNombre().equals(ingrediente.getNombre())) {
                        System.out.println("Queda en la despensa: " + despensaIngrediente.getNombre());
                        break;
                    }
                }
            }
        }
    }
}
