import java.util.Scanner;

public class Craps {
  public static void main(String[] args){
     int first_roll = roll(), next_roll=0;
     int wins = 0, lose = 0;
     
     for (int i = 0; i <= 1000; i++){
       if (first_roll == 2 || first_roll == 3 || first_roll == 12){
         lose++;
       }
       else
         if (first_roll == 7 || first_roll == 11){
           wins++;
         }
       else
         do{
           next_roll = roll();
         } while (next_roll != 7 && next_roll != first_roll);
     
         if (next_roll == 7)
           lose++;
         else
           wins++;
     } // for i
     
     System.out.println("The number of wins is " + wins);
   }   // main
   
   public static int roll(){
     int roll_1 = (int)(1 + Math.random()*6);
     int roll_2 = (int)(1 + Math.random()*6);
     int sum = roll_1 + roll_2;
     //System.out.println("You rolled " + roll_1 + " + " + roll_2 + " = " + sum);
     return sum;
   } // roll  
} // class Craps
