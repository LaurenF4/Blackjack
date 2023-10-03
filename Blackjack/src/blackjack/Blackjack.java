
package blackjack;

import java.util.Scanner;

/**
 * Author: Lauren
 * Date: 19/09/23
 */
public class Blackjack {

    public static int getRandomNumber(){
        return(int)(Math.random()*10 + 1);
    }
    public static int calcTotal(int card1, int card2){
        return(card1+card2);
    }
    public static boolean getResult(int total, int house){
        if (total>house && total<=21)
            return(true);
        else return (false);                    
    }
    public static boolean busted(int total){
        if (total> 21)
            return(true); 
        else return(false);
    }
    public static void main(String[] args) {
    
    Scanner Keyboard = new Scanner(System.in);
    String choice ;
    int house = 18 ;
    int card1 = getRandomNumber() ;
    int card2 = getRandomNumber() ;
    int newCard = getRandomNumber() ;
    int total ;

        System.out.println("You have drawn " + card1 + " and " + card2);
        System.out.println("Would you like to draw another card? (y/n)");
        choice=Keyboard.nextLine();
       
    while (choice.equalsIgnoreCase("y")){
        int card3 = getRandomNumber() ;
        
        
    }
        
    }    
}
