/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author juan2
 */
public class Variables {
    //declaracion de variables public static que podran ser modificadas sin necesidad de instanciar objetos
    public static String nombreCpu;
    public static String nombreGpu; 
    public static String nombrePsu;
    public static String nombreRam; 
    public static String nombreCase;
    public static String nombreMother; 
    public static String nombreDisco;
    
    public static double precioCpu; 
    public static double precioGpu;
    public static double precioPsu; 
    public static double precioRam;
    public static double precioCase; 
    public static double precioMother;
    public static double precioDisco;  
    
    public static double puntuacionCpu;
    public static double puntuacionGpu;
    public static double puntuacionPsu;
    public static double puntuacionRam;
    public static double puntuacionCase;
    public static double puntuacionMother;
    public static double puntuacionDisco;
    
    public static double precioTotal;
    public static double puntuacionTotal;
    public static double puntuacionRedondeada;
    public static double precioConMontaje;
    
    
    public static boolean montaje;
    
    public static String gamaPC;
    
    public static String nombreCliente;
    public static String apellidoCliente;
    public static String direccionCliente;
    public static String cedulaCliente;
    public static String correoCliente;
    public static String tipoCedula;
    
    //metodo de reinicio de valores
    public static void setCero() {
    
    precioCpu =0;
    precioGpu =0;
    precioPsu =0;
    precioMother =0;
    precioRam =0;
    precioCase=0;
    precioDisco=0;
    
    puntuacionCpu =0;
    puntuacionGpu =0;
    puntuacionPsu =0;
    puntuacionMother =0;
    puntuacionRam =0;
    puntuacionCase=0;
    puntuacionDisco=0;
    
    nombreCpu="";
    nombreGpu="";
    nombrePsu="";
    nombreRam="";
    nombreDisco="";
    nombreMother="";
    nombreCase="";
    }  
}
