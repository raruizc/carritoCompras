/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compras;

/**
 *
 * @author Ricardo
 */
public class Articulo {
    public String nombre;
    public int cantidad;
    public double precio;
    
    public Articulo(String nombre, int cantidad, double precio){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerCantidad(){
        return cantidad;
    }
    public double obtenerPrecio(){
        return precio;
    }
    /*
    @Override 
    public String toString() {
        return nombre + "\t" + precio + "\t" + cantidad;
    }*/
    /*public static void main(String[] args) {
        Articulo[] articulos = new Articulo[100];
        Articulo miArticulo = new Articulo("Chocolatina", 3, 300);
        articulos[0] = miArticulo;
        System.out.println(articulos[0].obtenerNombre());
    }*/
    
}
