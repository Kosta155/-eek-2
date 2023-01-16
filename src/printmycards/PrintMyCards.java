/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printmycards;

/**
 *
 * @author kosti
 */
public class PrintMyCards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyCards[] deck = new MyCards[52];
        
        //populate the array
       for(int i=0;i<=51;i++)
       {
       deck[i] = new MyCards();
       }
       //defining the card number and name
       for(int i=0; i<13;i++)
       {
       deck[i].setName("Diamonds");
       deck[i].setNumber(i+1);
       }
       for(int i=13; i<26;i++)
       {
       deck[i].setName("Heart");
       deck[i].setNumber(i+1-13);
       }
       for(int i=26; i<39;i++)
       {
       deck[i].setName("Spade");
       deck[i].setNumber(i+1-26);
       }
       for(int i=39; i<52;i++)
       {
       deck[i].setName("Clubs");
       deck[i].setNumber(i+1-39);
       }
       
       //printing my Deck
       for(int i=0;i<52;i++)
       {
          
       System.out.println(deck[i].getName() + " , " +deck[i].getNumber());
           if(deck[i].getNumber()==13)
           {System.out.println();}
       }
       
    }
    
}
