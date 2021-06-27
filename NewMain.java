/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Veronica Barreto
 */
import java.util.Scanner;

public class NewMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Por favor ingrese su nombre");

        String nombre = sc.nextLine();
        
        System.out.println("Gracias " + nombre + ", ahora ingrese su apellido");

        String apellido = sc.nextLine();

        System.out.println("Ahora ingrese su edad");

        int edad = sc.nextInt(); 

        System.out.println("Ahora ingrese su hobbie");

        String hobbie = sc.nextLine();

        System.out.println("Gracias, ahora ingrese su editor de código preferido" ); 
        
        String editor = sc.nextLine();

        System.out.println("Gracias, ahora ingrese el nombre del sistema operativo que utiliza" );
        
        String sistema = sc.nextLine();

        System.out.println("Datos ingresados: " + " Nombre: " + nombre + " Apellido: " + apellido + " Edad: " + edad + " Hobbie: " + hobbie + " Editor favorito: " + editor + " Sistema utilizado: " + sistema );
    }
}
