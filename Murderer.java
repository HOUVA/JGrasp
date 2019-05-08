/*****************************************************
* Authora: Trevor Davis and Matthew Suggars
* 
* Aquires value randomNum from class modernStoryLine
* and calls specific methods from class Dialogue.
* 
* randomNum is a randomized int value between 0-2 and 
* is initialized in the modernBeginning method in 
* modernStoryLine class.
*****************************************************/

public class Murderer {
   Dialogue myDialogue = new Dialogue();
   
   // Kitchen
   public void kitchenTrash(int murderer) {
      if(murderer == 0) {
         myDialogue.gfTrashDialogue();//Karen Dialogue
      }else if(murderer == 1) {
         myDialogue.henTrashDialogue();//Hendrickson Dialogue
      }else {
         myDialogue.carlTrashDialogue();//Carlson Dialogue
      }
   }
   
   // Dialogue for Trash notes/camera
   public String getKitchenTrash(int murderer) {
      if(murderer == 0) {
         return myDialogue.getGfTrashDialogue();
      }else if(murderer == 1) {
         return myDialogue.getHenTrashDialogue();
      }else {
        return myDialogue.getCarlTrashDialogue();
      }
   }
   
   // Dialogue for kitchen stove
   public void stove(int murderer) {
      if(murderer == 0) {
         myDialogue.gfStoveDialogue();
      }else if(murderer == 1) {
         myDialogue.henStoveDialogue();
      }else {
         myDialogue.carlStoveDialogue();
      }
   }
   
   // Dialogue for kitchen stove notes/camera
    public String getStove(int murderer) {
      if(murderer == 0) {
         return myDialogue.getGfStoveDialogue();
      }else if(murderer == 1) {
         return myDialogue.getHenStoveDialogue();
      }else {
        return myDialogue.getCarlStoveDialogue();
      }
   }
   
   // Dialogue for counter top
   public void counterTop(int murderer) {
      if(murderer == 0) {
         myDialogue.gfCounterTopDialogue();
      }else if(murderer == 1) {
         myDialogue.henCounterTopDialogue();
      }else {
         myDialogue.carlCounterTopDialogue();
      }
   }
   
   // Dialogue for the counter top notes/camera
   public String getCounterTop(int murderer) {
      if(murderer == 0) {
         return myDialogue.getGfCounterTopDialogue();
      }else if(murderer == 1) {
         return myDialogue.getHenCounterTopDialogue();
      }else {
        return myDialogue.getCarlCounterTopDialogue();
      }
   }
   
   // Dialogue for the kitchen sink
   public void kitchenSink(int murderer) {
      if(murderer == 0) {
         myDialogue.gfSinkDialogue();
      }else if(murderer == 1) {
         myDialogue.henSinkDialogue();
      }else {
         myDialogue.carlSinkDialogue();
      }
   }
   
   // Dialogue for the kitchen sink notes/camera
   public String getKitchenSink(int murderer) {
      if(murderer == 0) {
         return myDialogue.getGfSinkDialogue();
      }else if(murderer == 1) {
         return myDialogue.getHenSinkDialogue();
      }else {
        return myDialogue.getCarlSinkDialogue();
      }
   }
   
   // Bedroom
   
   // Dialogue for closet
   public void closet(int murderer) {
      if(murderer == 0) {
         myDialogue.gfClosetDialogue();
      }else if(murderer == 1) {
         myDialogue.henClosetDialogue();
      }else {
         myDialogue.carlClosetDialogue();
      }
   }
   
   // Dialogue for the closet photos
   public String getCloset(int murderer) {
      if(murderer == 0) {
         return myDialogue.getGfClosetDialogue();
      }else if(murderer == 1) {
         return myDialogue.getHenClosetDialogue();
      }else {
        return myDialogue.getCarlClosetDialogue();
      }
   }
   
   // Dialogue for the bedroom
   public void bed(int murderer) {
      if(murderer == 0) {
         myDialogue.gfBedDialogue();
      }else if(murderer == 1) {
         myDialogue.henBedDialogue();
      }else {
         myDialogue.carlBedDialogue();
      }
   }
   
   // Dialogue for the bed photos
   public String getBed(int murderer) {
      if(murderer == 0) {
         return myDialogue.getGfBedDialogue();
      }else if(murderer == 1) {
         return myDialogue.getHenBedDialogue();
      }else {
        return myDialogue.getCarlBedDialogue();
      }
   }
   
   // Dialogue for the nightstand
   public void nightstand(int murderer) {
      if(murderer == 0) {
         myDialogue.gfNightstandDialogue();
      }else if(murderer == 1) {
         myDialogue.henNightstandDialogue();
      }else {
         myDialogue.carlNightstandDialogue();
      }
   }
   
   // Dialogue for the nightstand photos
   public String getNightstand(int murderer) {
      if(murderer == 0) {
         return myDialogue.getGfNightstandDialogue();
      }else if(murderer == 1) {
         return myDialogue.getHenNightstandDialogue();
      }else {
        return myDialogue.getCarlNightstandDialogue();
      }
   }
   
   //bathroom
 
   // Dialogue for the bathroom sink
   public void bathroomSink(int murderer) {
      if(murderer == 0) {
         myDialogue.gfBathroomSink();
      }else if(murderer == 1) {
         myDialogue.henBathroomSink();
      }else {
         myDialogue.carlBathroomSink();
      }
   }
   
   // Dialogue for the nightstand photos
   public String getBathroomSink(int murderer) {
      if(murderer == 0) {
         return myDialogue.getGfBathroomSink();
      }else if(murderer == 1) {
         return myDialogue.getHenBathroomSink();
      }else {
        return myDialogue.getCarlBathroomSink();
      }
   }
   
   // Dialogue for the waste basket
   public void wasteBasket(int murderer) {
      if(murderer == 0) {
         myDialogue.gfWasteBasketDialogue();
      }else if(murderer == 1) {
         myDialogue.henWasteBasketDialogue();
      }else {
         myDialogue.carlWasteBasketDialogue();
      }
   }
   // Dialogue for the waste basket photos
   public String getWasteBasket(int murderer) {
      if(murderer == 0) {
         return myDialogue.getGfWasteBasketDialogue();
      }else if(murderer == 1) {
         return myDialogue.getHenWasteBasketDialogue();
      }else {
        return myDialogue.getCarlWasteBasketDialogue();
      }
   }
   
   // Dialogue for the shower
   public void shower(int murderer) {
      if(murderer == 0) {
         myDialogue.gfShowerDialogue();
      }else if(murderer == 1) {
         myDialogue.henShowerDialogue();
      }else {
         myDialogue.carlShowerDialogue();
      }
   }
   
   // Dialogue for the shower photos
   public String getShower(int murderer) {
      if(murderer == 0) {
         return myDialogue.getGfShowerDialogue();
      }else if(murderer == 1) {
         return myDialogue.getHenShowerDialogue();
      }else {
        return myDialogue.getCarlShowerDialogue();
      }
   }
   
   // Dialogue for the clothing basket
   public void clothingBasket(int murderer) {
      if(murderer == 0) {
         myDialogue.gfClothingBasketDialogue();
      }else if(murderer == 1) {
         myDialogue.henClothingBasketDialogue();
      }else {
         myDialogue.carlClothingBasketDialogue();
      }
   }
   
   // Dialogue for the clothing basket photos
   public String getClothingBasket(int murderer) {
      if(murderer == 0) {
         return myDialogue.getGfClothingBasketDialogue();
      }else if(murderer == 1) {
         return myDialogue.getHenClothingBasketDialogue();
      }else {
        return myDialogue.getCarlClothingBasketDialogue();
      }
   }
   
   // Living Room
   
   // Dialogue for the Coffee table
   public void coffeeTable(int murderer) {
      if(murderer == 0) {
         myDialogue.gfCoffeeTableDialogue();
      }else if(murderer == 1) {
         myDialogue.henCoffeeTableDialogue();
      }else {
         myDialogue.carlCoffeeTableDialogue();
      }
   }
   
   // Dialogue for the coffee table photos
   public String getCoffeeTable(int murderer) {
      if(murderer == 0) {
         return myDialogue.getGfCoffeeTableDialogue();
      }else if(murderer == 1) {
         return myDialogue.getHenCoffeeTableDialogue();
      }else {
        return myDialogue.getCarlCoffeeTableDialogue();
      }
   }
   
   // Dialogue for the body
   public void body(int murderer) {
      if(murderer == 0) {
         myDialogue.gfTheBodyDialogue();
      }else if(murderer == 1) {
         myDialogue.henTheBodyDialogue();
      }else {
         myDialogue.carlTheBodyDialogue();
      }
   }
   
   // Dialogue for the body photos
   public String getBody(int murderer) {
      if(murderer == 0) {
         return myDialogue.getGfBodyDialogue();
      }else if(murderer == 1) {
         return myDialogue.getHenBodyDialogue();
      }else {
        return myDialogue.getCarlBodyDialogue();
      }
   }
   
   // Dialogue for the Laptop
   public void laptop(int murderer) {
      if(murderer == 0) {
         myDialogue.gfLaptopDialogue();
      }else if(murderer == 1) {
         myDialogue.henLaptopDialogue();
      }else {
         myDialogue.carlLaptopDialogue();
      }
   }
   
   // Dialogue for the laptop photos
   public String getLaptop(int murderer) {
      if(murderer == 0) {
         return myDialogue.getGfLaptopDialogue();
      }else if(murderer == 1) {
         return myDialogue.getHenLaptopDialogue();
      }else {
        return myDialogue.getCarlLaptopDialogue();
      }
   }
   
   // Dialogue for the dining table
   public void diningTable(int murderer) {
      if(murderer == 0) {
         myDialogue.gfDiningTableDialogue();
      }else if(murderer == 1) {
         myDialogue.henDiningTableDialogue();
      }else {
         myDialogue.carlDiningTableDialogue();
      }
   }
   
   // Dialogue for the dining table photos
   public String getDiningTable(int murderer) {
      if(murderer == 0) {
         return myDialogue.getGfDiningTableDialogue();
      }else if(murderer == 1) {
         return myDialogue.getHenDiningTableDialogue();
      }else {
        return myDialogue.getCarlDiningTableDialogue();
      }
   }
   
   // Dialogue for the couch
   public void couch(int murderer) {
      if(murderer == 0) {
         myDialogue.gfCouchDialogue();
      }else if(murderer == 1) {
         myDialogue.henCouchDialogue();
      }else {
         myDialogue.carlCouchDialogue();
      }
   }
   
   // Dialogue for the couch photos
   public String getCouch(int murderer) {
      if(murderer == 0) {
         return myDialogue.getGfCouchDialogue();
      }else if(murderer == 1) {
         return myDialogue.getHenCouchDialogue();
      }else {
        return myDialogue.getCarlCouchDialogue();
      }
   }
   
   // Interrogations
   
   // Karen interrogation
   public void karen(int murderer) {
      if(murderer == 0) {
         myDialogue.karenInterDialogue();
      }else if(murderer == 1) {
         myDialogue.henKarenInterDialogue();
      }else {
         myDialogue.carlKarenInterDialogue();
      }
   }
   
   // Hendrickson interrogation
   public void hendrickson(int murderer) {
      if(murderer == 0) {
         myDialogue.henKarenInterDialogue();
      }else if(murderer == 1) {
         myDialogue.henHendricksonInterDialogue();
      }else {
         myDialogue.henCarlsonInterDialogue();
      }
   }
   
   // Carlson interrogation
   public void carlson(int murderer) {
      if(murderer == 0) {
         myDialogue.carlKarenInterDialogue();
      }else if(murderer == 1) {
         myDialogue.carlHendricksonInterDialogue();
      }else {
         myDialogue.carlCarlsonInterDialogue();
      }
   }
   
   // Ending scene
   
   // If you get it correct
   public void correctEnding(int murderer) {
      if(murderer == 0) {
         myDialogue.chooseKaren();
      }else if(murderer == 1) {
         myDialogue.chooseHendrickson();
      }else {
         myDialogue.chooseCarlson();
      }
   }
   
   // if you get it wrong
   public void wrongEnding(int murderer) {
      if(murderer == 0) {
         myDialogue.notKaren();
      }else if(murderer == 1) {
         myDialogue.notHendrickson();
      }else {
         myDialogue.notCarlson();
      }
   }
   
   /*****************************************************************
   * The following are a series of methds that get assigned to 
   * ArrayList<String>photos and ArraysList<String>notes in class
   * modernStoryLine.
   *
   * Depending on the randomized value randomNum generated in class
   * modernStoryLine, different String values are stored.
   *******************************************************************/
   
   public String kitchenNote(int murderer){
      if(murderer == 0){//0 = Karen Dialogue notes
         return "The Lidocane in the trash is the murder weapon";
      }else{// = Hendrickson and Carlson Dialogue
         return "Karen, you keep saying that I'm too good for you. I think you're wrong. I love you!";
      }
   }
      
   public String bedroomNote(int murderer){
      if(murderer == 0 || murderer == 1){//1 = Carlson Dialogue notes
         return "Just a little something to help remind you what you could have. No signature.";
      }else{//2 = Carlson Dialogue notes
         return "A journal that exlpains Karen's worries about hendrickson and Carlson. She thinks Carlson is getting aggressive";
      } 
   }
   
   public String bathroomNote(int murderer){
      if(murderer == 0){
         return "The reddish discoloration could be blood";
      }else{
         return "Nothing special in the bathroom";         
      }
   }
   
   public String livingroomNote(){//no variable required
      return "The conversations between Hendrickson and Karen could be a clue";
   }
}