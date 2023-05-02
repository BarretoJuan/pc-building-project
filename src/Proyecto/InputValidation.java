/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

//clase para validar el input del correo electronico mediante regex y para confirmar el input de una cedula valida
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author juan2
 */
public class InputValidation {
    
    public static boolean EmailValidation(String email){
        
        //regex a evaluar
     Pattern pattern = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
           
     //se evalua si el input coincide con el regex
           Matcher matcher = pattern.matcher(email);
           System.out.println("El correo ingresado " + email + " es " + (matcher.matches() ? "valido" : "invalido"));
           return matcher.matches();
           
    }

    public static boolean CedulaValidation (String cedula) {
    
        try{
        int numCedula = Integer.parseInt(cedula);
        } catch (Exception e) {
            System.out.println("Ingrese un numero de cedula valido");
            return false;
        }
        System.out.println("Cedula valida");
        return true;
       
    }
   

}

