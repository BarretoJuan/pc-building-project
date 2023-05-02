/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author juan2
 */

//clase para obtener el valor de la fecha actual
import java.text.SimpleDateFormat;
import java.util.Date;
public class Fecha {
    public static String fecha;
    
    public static String getFecha() 
    {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
        fecha = formatter.format(date);
        return fecha;
    }
    

}