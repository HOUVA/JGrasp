/********************************************
* Authors: Trevor Davis and Matthew Suggars
*
* The Modern storyline class
*  
*********************************************/

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;


public class ModernStoryLine {

   //classes implemented from same root folder
   Dialogue myDialogue = new Dialogue();
   Murderer myMurderer = new Murderer();
   
   //ArrayList variables collected from Dialogue class
   private ArrayList<String>photos = new ArrayList<String>();
   private ArrayList<String>notes = new ArrayList<String>();
   private int randomNum; // chooses a random number to choose a murderer
   private int choice;
   private int cameraRoll = 10;//variable only allows user to collect 10 values in photos array 

   public void modernBeginning() {
      //beginning dialogue 
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
      randomNum = rand.nextInt(3);
      myDialogue.modernDialogueBeginning();
      mainSpaceMenu(notes, photos, choice);//transition to menu

   }
   public void mainSpaceMenu(ArrayList<String> notes,  ArrayList<String>photos, int choice){
      Scanner input = new Scanner(System.in);
      int menuChoice = 0;      
      System.out.println("Where would you like to investigate?");
      System.out.println("0: Kitchen        1: Bedroom\n" + 
                         "2: Living Room       3: Bathroom\n" + 
                         "4: Look at notes     5: Look at photos\n" + 
                         "6: Call chief\n");
      menuChoice = input.nextInt(); 
          
      //switch statement calling methods using variable menuChoice
      switch(menuChoice){
         case 0:
            kitchenMenu();
            break;
         case 1:
            bedroomMenu();
            break;
         case 2: 
            livingroomMenu();
            break;
         case 3: 
            bathroomMenu();
            break;
         case 4:
             for(String el: notes){
               System.out.println(el + "\n");
             }
             break;
         case 5:
             for(String el: photos){
               System.out.println(el + "\n");
             }
             break;
         case 6: 
            policeStationMenu();
            break;
         default:
            System.out.println("invalid response");
            break;           
      }             
}
   
   public void kitchenMenu(){
      Scanner input = new Scanner(System.in);
      System.out.println("Where would you like to explore?");
      System.out.println("0: Open the Trash        1: Check the Stove\n" + 
                       "2: Check the Counter Top   3: Check Sink\n" + 
                       "4: Collect note            5: Return to Living Room\n");
      this.choice = input.nextInt();
      kitchen(notes, photos, choice, randomNum);//transition to menu
   }
   
   public void kitchen(ArrayList<String> notes, ArrayList<String> photos, int choice,int randomNum){
      Scanner input = new Scanner(System.in);
      switch(choice){
         case 0:
            myMurderer.kitchenTrash(this.randomNum);
            System.out.println("Would you like to take a picture? (y/n): " );
            char answ = input.next().charAt(0);
            
            if(answ == 'y' && this.cameraRoll > 0){//testing whether value of cameraRoll is greater than 0
               photos.add(myMurderer.getKitchenTrash(this.randomNum)); 
               this.cameraRoll -=1;  
            }else if(answ == 'y' && this.cameraRoll <= 0){//conditional statement for no cameraRoll
               System.out.println("You are out of film!\n");
            }
            kitchenMenu();
            break;
        case 1:
            myMurderer.stove(this.randomNum);
            System.out.println("Would you like to take a picture? (y/n)");
            answ = input.next().charAt(0);
            
            if(answ == 'y' && this.cameraRoll > 0){
               photos.add(myMurderer.getStove(this.randomNum)); 
               this.cameraRoll -=1;  
            }else if(answ == 'y' && this.cameraRoll <= 0){
               System.out.println("You are out of film!\n");
            }
            kitchenMenu();//transition to menu
            break;
        case 2:
            myMurderer.counterTop(this.randomNum);
            System.out.println("Would you like to take a picture? (y/n)");
            answ = input.next().charAt(0);
            
            if(answ == 'y' && this.cameraRoll > 0){
               photos.add(myMurderer.getCounterTop(this.randomNum)); 
               this.cameraRoll -=1;  
            }else if(answ == 'y' && this.cameraRoll <= 0){
               System.out.println("You are out of film!\n");
            }
            kitchenMenu();
            break;
        case 3:
            myMurderer.kitchenSink(this.randomNum);
            System.out.println("Would you like to take a picture? (y/n)");
            answ = input.next().charAt(0);
            if(answ == 'y' && this.cameraRoll > 0){
               photos.add(myMurderer.getKitchenSink(this.randomNum)); 
               this.cameraRoll -=1;  
            }else if(answ == 'y' && this.cameraRoll <= 0){
               System.out.println("You are out of film!\n");
            }
            kitchenMenu();
            break;
        case 4:
            notes.add(myMurderer.kitchenNote(this.randomNum));
            System.out.println("note collected!");
            kitchenMenu();
            break;
        case 5: 
            mainSpaceMenu(notes, photos, choice);
            break;       
      }
   }
   
   public void bedroomMenu(){
      Scanner input = new Scanner(System.in);
      System.out.println("Where would you like to explore?");
      System.out.println("0: Open the closet        1: Check the bed\n" + 
                       "2: Open the nightstand    3: Collect note\n" + 
                       "4: Return to Living Room\n");
      this.choice = input.nextInt();
      bedroom();//transition to menu
   }
   
   public void bedroom(){
      Scanner input = new Scanner(System.in);
      switch(choice){
         case 0:
            myMurderer.closet(this.randomNum);
            System.out.println("Would you like to take a picture? (y/n)");
            char answ = input.next().charAt(0);
            
            if(answ == 'y' && this.cameraRoll > 0){
               photos.add(myMurderer.getCloset(this.randomNum)); 
               this.cameraRoll -=1;  
            }else if(answ == 'y' && this.cameraRoll <= 0){
               System.out.println("You are out of film!\n");
            }
            bedroomMenu();
            break;
        case 1:
            myMurderer.bed(this.randomNum);
            System.out.println("Would you like to take a picture? (y/n)");
            answ = input.next().charAt(0);
            
            if(answ == 'y' && this.cameraRoll > 0){
               photos.add(myMurderer.getBed(this.randomNum)); 
               this.cameraRoll -=1;  
            }else if(answ == 'y' && this.cameraRoll <= 0){
               System.out.println("You are out of film!\n");
            }
            bedroomMenu();
            break;
        case 2:
            myMurderer.nightstand(this.randomNum);
            System.out.print("Would you like to take a picture? (y/n)");
            answ = input.next().charAt(0);
            
            if(answ == 'y' && this.cameraRoll > 0){
               photos.add(myMurderer.getNightstand(this.randomNum)); 
               this.cameraRoll -=1;  
            }else if(answ == 'y' && this.cameraRoll <= 0){
               System.out.println("You are out of film!\n");
            }
            bedroomMenu();
            break;
        case 3:
            notes.add(myMurderer.bedroomNote(this.randomNum));
            System.out.println("note collected!");
            bedroomMenu();
            break;
        case 4: 
            mainSpaceMenu(notes, photos, choice);
            break;       
       }
   }
   
   public void bathroomMenu(){
      Scanner input = new Scanner(System.in);
      System.out.print("Where would you like to explore?\n");
      System.out.print("0: Check the Sink        1: Check the Waste Basket\n" + 
                       "2: Open the shower       3: Check Clothing Basket\n" + 
                       "4: Collect note          5: Return to Living Room\n");
      this.choice = input.nextInt();
      bathroom();
   }
   
   public void bathroom(){
      Scanner input = new Scanner(System.in);
      switch(choice){
         case 0:
            myMurderer.bathroomSink(this.randomNum);
            System.out.print("Would you like to take a picture? (y/n)");
            char answ = input.next().charAt(0);
            
            if(answ == 'y' && this.cameraRoll > 0){
               photos.add(myMurderer.getBathroomSink(this.randomNum)); 
               this.cameraRoll -=1;  
            }else if(answ == 'y' && this.cameraRoll <= 0){
               System.out.println("You are out of film!\n");
            }
            bathroomMenu();
            break;
        case 1:
            myMurderer.wasteBasket(this.randomNum);
            System.out.print("Would you like to take a picture? (y/n)");
            answ = input.next().charAt(0);
            
            if(answ == 'y' && this.cameraRoll > 0){
               photos.add(myMurderer.getWasteBasket(this.randomNum));  
               this.cameraRoll -=1;  
            }else if(answ == 'y' && this.cameraRoll <= 0){
               System.out.println("You are out of film!\n");
            }
            bathroomMenu();
            break;
        case 2:
            myMurderer.shower(this.randomNum);
            System.out.print("Would you like to take a picture? (y/n)");
            answ = input.next().charAt(0);
            
            if(answ == 'y' && this.cameraRoll > 0){
               photos.add(myMurderer.getShower(this.randomNum)); 
               this.cameraRoll -=1;  
            }else if(answ == 'y' && this.cameraRoll <= 0){
               System.out.println("You are out of film!\n");
            }
            bathroomMenu();
            break;
        case 3:
            myMurderer.clothingBasket(this.randomNum);
            System.out.println("Would yo like to take a picture? (y/n)");
            answ = input.next().charAt(0);
            if(answ == 'y' && this.cameraRoll > 0){
               photos.add(myMurderer.getClothingBasket(this.randomNum)); 
               this.cameraRoll -=1;  
            }else if(answ == 'y' && this.cameraRoll <= 0){
               System.out.println("You are out of film!\n");
            }
            bathroomMenu();
            break;
        case 4:
            notes.add(myMurderer.bathroomNote(this.randomNum));
            System.out.println("note collected!");
            bathroomMenu();
            break;
        case 5: 
            mainSpaceMenu(notes, photos, choice);
            break; 
      }     
   }   
      
   public void livingroomMenu(){
      Scanner input = new Scanner(System.in);
      System.out.println("Where would you like to explore?");
      System.out.println("0: The coffee table       1: Check the body\n" + 
                       "2: Check the Laptop         3: Check Dining room\n" + 
                       "4: Check Couch             5: Collect note\n" +
                       "6: Return to Menu\n");
      this.choice = input.nextInt();
      livingroom(notes, photos, choice);
   }
   
   public void livingroom(ArrayList<String> notes, ArrayList<String> photos, int choice){
      Scanner input = new Scanner(System.in);
      switch(choice){
         case 0:
            myMurderer.coffeeTable(this.randomNum);
            System.out.println("Would you like to take a picture? (y/n): " );
            char answ = input.next().charAt(0);
            
            if(answ == 'y' && this.cameraRoll > 0){
               photos.add(myMurderer.getCoffeeTable(this.randomNum)); 
               this.cameraRoll -=1;  
            }else if(answ == 'y' && this.cameraRoll <= 0){
               System.out.println("You are out of film!\n");
            }
            livingroomMenu();
            break;
        case 1:
            myMurderer.body(this.randomNum);
            System.out.println("Would you like to take a picture? (y/n)");
            answ = input.next().charAt(0);
            
            if(answ == 'y' && this.cameraRoll > 0){
               photos.add(myMurderer.getBody(this.randomNum)); 
               this.cameraRoll -=1;  
            }else if(answ == 'y' && this.cameraRoll <= 0){
               System.out.println("You are out of film!\n");
            }
            livingroomMenu();
            break;
        case 2:
            myMurderer.laptop(this.randomNum);
            System.out.println("Would you like to take a picture? (y/n)");
            answ = input.next().charAt(0);
            
            if(answ == 'y' && this.cameraRoll > 0){
               photos.add(myMurderer.getLaptop(this.randomNum)); 
               this.cameraRoll -=1;  
            }else if(answ == 'y' && this.cameraRoll <= 0){
               System.out.println("You are out of film!\n");
            }
            livingroomMenu();
            break;
        case 3:
            myMurderer.diningTable(this.randomNum);
            System.out.println("Would you like to take a picture? (y/n)");
            answ = input.next().charAt(0);
            
            if(answ == 'y' && this.cameraRoll > 0){
               photos.add(myMurderer.getDiningTable(this.randomNum)); 
               this.cameraRoll -=1;  
            }else if(answ == 'y' && this.cameraRoll <= 0){
               System.out.println("You are out of film!\n");
            }
            livingroomMenu();
            break;
        case 4:
            myMurderer.couch(this.randomNum);
            System.out.println("Would you like to take a picture? (y/n)");
            answ = input.next().charAt(0);
            
            if(answ == 'y' && this.cameraRoll > 0){
               photos.add(myMurderer.getCouch(this.randomNum)); 
               this.cameraRoll -=1;
               System.out.println("not ");  
            }else if(answ == 'y' && this.cameraRoll <= 0){
               System.out.println("You are out of film!\n");
            }
            livingroomMenu();
            break;
        case 5:
            notes.add(myMurderer.livingroomNote());
            System.out.println("note collected!");
            livingroomMenu();
            break;
        case 6: 
            mainSpaceMenu(notes, photos, choice);
            break;       
      }
   }
      
   public void policeStationMenu(){
      Scanner input = new Scanner(System.in);
      myDialogue.stationDialogue();
      System.out.println("What would you like to do?");
      System.out.println("0: Check notes       1: Check photos\n" + 
                       "2: Interrogate suspect\n" + 
                       "3: Choose Killer\n");
      this.choice = input.nextInt();
      policeStation(choice);
   }
   
   public void policeStation(int choice){
      switch(choice){
         case 0:
            for(String el: notes){//prints all values of notes array
               System.out.println(el + "\n");
            }
            policeStationMenu();
            break;
         case 1: 
            for(String el: photos){//prints all values of photos array
               System.out.println(el + "\n");
            }
            policeStationMenu();
            break;
         case 2:
            interrogationMenu();
            break;
         case 3: 
            ending();//transition to final dialogue
            break;
      }
   }
   
   public void interrogationMenu(){
      Scanner input = new Scanner(System.in);
      System.out.println("Who would you like to Interrogate?");
      System.out.println("0: Karen        1: Hendrickson\n" + 
                         "2: Carlson      3: Return to Police Station"); 
      this.choice = input.nextInt();
      interrogation();   
   }
   
   public void interrogation(){
      switch(choice){
         case 0: 
            myMurderer.karen(this.randomNum);//Karen interrogation dialogue 
            interrogationMenu();
            break;
         case 1:
            myMurderer.hendrickson(this.randomNum);//Hendrickson interrogation dialogue 
            interrogationMenu();
            break;
         case 2:
            myMurderer.carlson(this.randomNum);//Carlson interrogation dialogue 
            interrogationMenu();
            break;
         case 3:
            policeStationMenu();            
      }
   }
   
   public void ending(){
      Scanner input = new Scanner(System.in);
      System.out.println("Who do you think is the killer?\n" + 
                         "0: Karen      1: Hendrickson\n" + 
                         "2: Carlson");
      int decision = input.nextInt();
      if(decision == randomNum) {//conditional statment determining if user input was correct
         myMurderer.correctEnding(decision);
      }else {
         myMurderer.wrongEnding(this.randomNum);//uses Murderer class implemented in root folder
      }
      
      //ending credits
      System.out.println();
      System.out.println("Thank you for playing! This game was created by Trevor Davis and Matthew Suggars.\n"+
            "If you want to praise us for our efforts then please feel free to do so. I won't mind.");
   } 
}