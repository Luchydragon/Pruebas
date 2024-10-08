/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables;

import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Variables {

    /**
     * @param args the command line arguments
     * 
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lol = new Scanner(System.in);
        String nombre = "Lucifer";
        String nom;
        long cuenta = 666666666666666l;
        int nu1, nu2, resultado,i;
   
        System.out.println("El nombre es: " + nombre);
        System.out.println(cuenta);
       
        System.out.println("Ingresa un numero: ");
        nu1 = lol.nextInt();
       System.out.println("Ingresa otro numero: ");
        nu2 = lol.nextInt();
        resultado = nu1 + nu2;
        System.out.println("El resultado es de " + resultado);
        for(i=0;i!=resultado+1;i++){
        System.out.print(i + ",");
        }
        System.out.println("\nSi quieres descubrir el codigo secreto pon el numero del diablo");
        nu1 = lol.nextInt();
        if(nu1==66){
            System.out.println("QUE BUENO QUE INGREASA AQUI\nSomos una secta que ADORA a los gatos, te interesaria unirtenos");
            System.out.println("Claro que si adoro a los gatos = 0 //\tNo malditos locos odio a los gatos = 1");
         nu2 = lol.nextInt();
         lol.nextLine();
         if(nu2==0){
             System.out.println("Bienvenido nuevo miembro");
             System.out.println("Ingresa tu nombre: ");
             nom = lol.nextLine();
             System.out.println("Entonces " + nom + " es un gusto conocerte");
         }else{
             System.out.println("Te perdiste de una gran oportunidad");
         }
        }else{
            System.out.println("Tu te lo pierdes aburrido");
        }
        }
      
        
    }
    

/*
 for(int i = 0;i<=num;i++){
        if(num % 3 == 0){
         System.out.println("Fizz");
        }else if (num % 5 == 0 ){
         System.out.println("Buzz");
        }else if (num % 3 == 0 && num % 5 == 0){
         System.out.println("FizzBuzz");   
        }else{
            
        }
              
    }
*/