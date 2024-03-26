package entity;

import java.util.Arrays;

public class Ingrediente {
    private String nombre;
    private Integer cantidad;

    public Ingrediente(String nombre, Integer cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void sacar(Integer cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
            System.out.println("Se han sacado " + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("No hay suficiente " + nombre + " en la despensa.");
        }
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
