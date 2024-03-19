import entity.Ingrediente;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("Pimiento rojo",4));
        ingredientes.add(new Ingrediente("Pollo",1));
        ingredientes.add(new Ingrediente("Queso crema",5));
        ingredientes.add(new Ingrediente("Papa",7));


    for (Ingrediente ingrediente : ingredientes) {
        System.out.println("Datos:");
        System.out.println(ingrediente);
        }
    }
}