/**********************************************
* Authora: Trevor Davis and Matthew Suggars
* 
* Tester application for class modernStoryLine.
* 
* Collects user input and calls certain methods
* from modernStorylin using if-else statments.
************************************************/

import java.util.Scanner;
public class StoryLineMain {
   
    public static void main(String[] args) {
      System.out.printf("Welcome to the Murder Mystery game!%n%n"); 
      Menu();
   }
   
   public static void Menu() {
      Scanner input = new Scanner(System.in);
      ModernStoryLine myModernStoryLine = new ModernStoryLine();
      
      System.out.printf("Please choose an option.%n");
      System.out.printf("0- Start Game%n" +
            "1- How to play%n");
      System.out.printf("User input: ");
      int userInput = input.nextInt();
      System.out.println();
      if(userInput == 0) {
         myModernStoryLine.modernBeginning();
      }else if(userInput == 1) {
         HowToPlay();
      }else {
         System.out.printf("Invalid Respone%n");
         System.out.println();
         Menu();
      }   
   }
   
   
   //Description on how the game functions
   public static void HowToPlay() {
      System.out.println("How to play");
      System.out.printf("In this game you are the detective.%n" +
            "You arrive at the murder scene and it is up to you to %n" +
            "collect the evidence and make a decision on who you %n" +
            "think the killer is.%n" +
            "You do this by selecting the rooms you want to visit and can %n" +
            "either take or draw a picture of the evidences to review later. %n" +
            "You can view your inventory at anytime and review the notes left %n" +
            "to you about the victim. Make sure you look hard, otherwise %n" +
            "you may convict an innocent person.%n");
     System.out.println();
     Menu();
   }
      
}