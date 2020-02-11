 //@author carles pascual fernandez 04/02/2020
package projectgit;

import java.util.Scanner;
import java.util.Random;

 
public class ProjectGit {

    static Scanner keyboard = new Scanner(System.in);

    
    public static void main(String[] args) {
      
       String letters;
        
        System.out.println("Pls give me your dni number");   
        
        int number = keyboard.nextInt();

        char letter= DNIletter(number);
       
       System.out.println(number+""+letter);
        
   
        
    }
    
    // funcion recibe dni +  devuelve letra
    
    private static char DNIletter(int number){
     
        int rest = number%23;
        String letter="TRWAGMYFPDXBNJZSQVHLCKE";
        return letter.charAt(rest);
        
    } 
}
