/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchdaysofweek;

/*import java.util.Scanner;

class SwitchDaysOfWeek {
    
    enum name {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday,Sunday}
    
    public static void main (String [] args){
       name Day;
       char reply;
       
       Scanner keyboard = new Scanner (System.in);
       System.out.print("What day of the week is it? Please choose between 1 - 7.");
       reply = keyboard.findWithinHorizon(".",0).charAt(0);
       
       if ((reply == 1)) {
           System.out.println (Day = name.Monday);
          
       } else if (reply == 2) {
           System.out.println (Day = name.Tuesday);
          
       } else if (reply == 3) {
           System.out.println (Day = name.Wednesday);
          
       } else if (reply == 4) {
           System.out.println (Day = name.Thursday);
          
       } else if (reply == 5) {
           System.out.println (Day = name.Friday);
          
       } else if (reply == 6) {
           System.out.println (Day = name.Saturday);
          
       } else if (reply == 7) {
           System.out.println (Day = name.Sunday);
          
       } 
       keyboard.close();
    }
}*/

import java.util.Scanner;
class SwitchDaysOfWeek{
    public static void main (String [] args){
        //String day;
        char reply;
        
        Scanner s = new Scanner(System.in);
        System.out.println ("What day of the week is it? Answer 1 - 7");
        reply = s.findWithinHorizon(".",0).charAt(0);
        
        switch (reply) {
            
            case 1:
                System.out.println("Monday");
            
            case 2:
                System.out.println("Tuesday");
            
            case 3:
                System.out.println("Wednesday");
            
            case 4:
                System.out.println("Thursday");
             
            case 5:
                System.out.println("Friday");
            
            case 6:
                System.out.println("Saturday");
                
            case 7:
                System.out.println("Sunday");
            
            default:
                System.out.println("Incorrect entry.");
        }
        s.close();
    }
}