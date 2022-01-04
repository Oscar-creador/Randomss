/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lenguajes_randoms;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Lenguajes_Randoms {

    
    public static int intentos = 5;
   
    public int numTecleado;
    public double numeroRandom;
    Random ran = new Random();
    
    

    public Lenguajes_Randoms() {
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int minVal = 1;
        int maxVal = 100;
        int valorUser;
        Scanner reader = new Scanner(System.in);
        
        double valor = Math.random() * (maxVal - minVal);
        
        while (intentos > 0){
            
            System.out.println("Dame el valor que piensas");
            valorUser = reader.nextInt();
            
            if(valorUser > valor ){
                System.out.println("Ingresa uno menor");
            }
            if(valorUser < valor ){
                System.out.println("Ingresa uno mayor");
            }else{
                System.out.println("Has ganado");
                break;
            }
            intentos --;
    
    }
    
    


    
        }
    }
       
    
    
    
    

