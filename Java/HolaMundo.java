package holamundo;

import java.util.Scanner;

/**
  * @author danielbarrios76
 */
public class HolaMundo {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String saludo = "Hola Mundo \n" +
                        "Java!!!    \n" + 
                        "Happy HackOctoberFest!!!";
        
        System.out.println(saludo);
        sc.nextLine();
        
    }
    
}
