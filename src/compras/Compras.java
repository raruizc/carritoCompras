/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compras;

import java.util.ArrayList;
import java.lang.*;
import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Compras {

    ArrayList<Articulo> articulos;    
    
    public Compras(){
        articulos = new ArrayList();
    }
    
    public void agregarArticulos(Articulo a){
        articulos.add(a);
    }
    
    
    
    public void Descuento(double subtotal){
        if(subtotal > 150000 && subtotal <= 300000){
            double descuento = Math.ceil(subtotal * 0.10);
            double total = Math.ceil(subtotal -descuento);
            System.out.println("Total: $"+(int)total);
            System.out.println("En esta compra tu descuento fue $"+(int)descuento);
            System.out.println("Gracias por tu compra");
        }
        else if(subtotal > 300000 && subtotal <= 700000){
            double descuento = Math.floor(subtotal * 0.15);
            double total =Math.ceil(subtotal -descuento);
            System.out.println("Total: $"+(int)total);
            System.out.println("En esta compra tu descuento fue $"+(int)descuento);
            System.out.println("Gracias por tu compra");
        }
        else if(subtotal > 700000){
            double descuento = Math.ceil(subtotal * 0.20);
            double total = Math.ceil(subtotal - descuento);
            System.out.println("Total: $"+(int)total);
            System.out.println("En esta compra tu descuento fue $"+(int)descuento);
            System.out.println("Gracias por tu compra");
        }
        else{
            double descuento = 0;
            double total = Math.ceil(subtotal -descuento);
            System.out.println("Total: $"+(int)total);
            System.out.println("En esta compra tu descuento fue $"+(int)descuento);
            System.out.println("Gracias por tu compra");
        }
    }
    
    public void procesarComandos(){
        String[] comando;
        Scanner sc = new Scanner(System.in);
        double subtotal = 0; 
        boolean verdad =true;
        while(verdad == true){
            comando = sc.nextLine().split("&");
            if(comando[0].equals("1")){
                agregarArticulos(new Articulo(comando[1], Integer.parseInt(comando[2]), Double.parseDouble(comando[3])));                
            }
            if(comando[0].equals("2")){
                String cedula = comando[1];
                System.out.println("Centro Comercial Unaleño\n" +"Compra más y Gasta Menos\n"+ "NIT: 899.999.063\n" 
                        + "Cliente: " + cedula + "\nArt Cant Precio");                
                for(int i=0; i < articulos.size(); i++){
                    System.out.println(articulos.get(i).obtenerNombre() + " x" + articulos.get(i).obtenerCantidad() + " $" 
                            + articulos.get(i).obtenerCantidad()*articulos.get(i).obtenerPrecio());
                    subtotal += (articulos.get(i).obtenerCantidad()*articulos.get(i).obtenerPrecio());
                }
                Descuento(subtotal);
                subtotal = 0;
                articulos.clear();
                System.out.println("---");
            }
            if(comando[0].equals("3")){
                verdad = false;
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        Compras tirilla = new Compras();
        tirilla.procesarComandos();
    }
    
}
