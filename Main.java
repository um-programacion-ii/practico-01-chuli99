import entity.Chef;
import entity.Ingrediente;
import entity.Receta;
import services.CocinaService;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ingrediente pollo = new Ingrediente("Pollo",4);
        Ingrediente papa = new Ingrediente("Papa",20);
        Ingrediente vino = new Ingrediente("Vino",4);
        Ingrediente cebolla = new Ingrediente("Cebolla",6);
        Ingrediente queso = new Ingrediente("Queso",3);

        Ingrediente[] despensa = {pollo,papa,vino,cebolla,queso};

        Chef chef = new Chef("Gordon Ramsay", 3);

        Receta polloAlDisco = new Receta(15, new Ingrediente[]{pollo,papa,vino,cebolla,queso}, "Freir el pollo, agregar verduras y vino");

        CocinaService.prepararReceta(chef, polloAlDisco, despensa);

        Receta ensaladaCesar = new Receta(0, new Ingrediente[]{new Ingrediente("Lechuga"), new Ingrediente("Pollo"), new Ingrediente("Pan"), new Ingrediente("Salsa César")}, "Cortar la lechuga, agregar pollo a la parrilla, añadir trozos de pan tostado y salsa César.");

        CocinaService.prepararReceta(chef, ensaladaCesar, despensa);
    }
}
}