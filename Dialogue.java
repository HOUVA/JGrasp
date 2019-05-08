/**********************************************
* Authors: Trevor Davis and Matthew Suggars
* 
* A series of print statements and String 
* variables that get assigned to certain 
* ArrayList<String> variables in modernStoryLine.
*
* Different methods are called depending of the 
* value of randomNum generated in modernBeginning
* method in moderStoryLine class. 
************************************************/
import java.util.Scanner;
public class Dialogue {

   //only field required in class
   private String userName;
   
   public void modernDialogueBeginning() {
      Scanner input = new Scanner(System.in);
      System.out.printf("Please enter your name: ");
      this.userName = input.nextLine();
      System.out.println();
      System.out.printf("RING RING. RING RING. RING Ri-%n" + 
            "\"This is %s, detective's unit\".%n" +
            "A deep voice answers on the other side of the phone." +
            "\"This is police Chief Bryant. There's been a death. A Young boy who%n" +
            "looks to be around twenty or so. The neighbors said they heard something%n" +
            "like a gunshot and called us to investigate. Looks like a suicide, but%n" + 
            "protocol tells us to call you anyway and have you double check. I'll send%n" + 
            "you the address.\"%n" +
            "\"Thank you.\"%n" +
            "You put the phone down and get ready to leave. It had been raining pretty%n" +
            "hard for the past two days, lots of dark clouds, which could account for a%n" +
            "bout of depression and thus an increased risk of suicide. On your way to%n" +
            "the small apartments you pass the University of Arizona and eventually%n" +
            "turn onto the last road. You see two cop cars and an ambulance parked outside%n" +
            "a small modest white house.%n%n" +
            "Chief Bryant is waiting outside the house for you and beckons you inside.%n" +
            "\"%s thanks for coming.\"%n" + 
            "You shake his hand and Chief Bryant leads you inside. You immediately take in%n" +
            "your surroundings.%n" +
            "The front door lead directly into the front room. The body lay right in the%n" +
            "middle, blood splattering the floor and wall. To your left you see the door%n" +
            "leading to the bathroom and another door leading to what looks like the master%n" +
            "bedroom. Straight ahead is the living room, a tv on the left wall, a small%n" +
            "coffee table in the middle of the room, and a couch to the right of the coffee%n" +
            "table. A sliding glass door lay beyond the living room that leads to a patio.%n" +
            "To the right of the couch is the kitchen, no walls separating it. The dining%n" +
            "room sat on the right side of the small home, with a dining table and four chairs%n" +
            "surrounding it. You notice that all the blinds are closed." +
            "\"Anything else you can tell me Chief?\" You ask.%n" + 
            "The chief takes out a notebook and hands it over to you.%n" +
            "\"This is everything we collected on the victim. We'll call%n" +
            "you if we find anything else.\"%n" +
            "\"Thank you Chief\".%n" +
            "\"Let us know if you find anything %s. We'll await your call\".%n" +
            "The Chief nods to you then leaves the home, closing the door behind you.%n%n",userName,userName,userName);       
   
   }
   
   //Beginning Dialogue
   public void gfChiefNotes() {
      System.out.printf("Victims name: Epson Holden%n" +
            "Age: 22%n" +
            "Occupation: Warehouse worker%n" +
            "Schooling: 2 years in general studies, 1 year in medical studies,%n" +
            "1 year in environmental studies%n" +
            "Roommates: Carlson Allen, Jonathan Reynold, Eric Michaels, and Tanner Lucks.%n" + 
            "Known relationships:  Karen Gallethos%n" +
            "Father: Henry Holden%n" +
            "Occupation: Medical Doctor%n" +
            "Mother: Kelsey Holden%n" +
            "Occupation: None%n" +
            "Sister: Hannah Holden%n" +
            "Age: 19%n" +
            "Occupation: Missionary%n" +
            "Brother: Tyler Holden%n" +
            "Age: 17%n" +
            "Occupation: None%n" +
            "Gathered info:%n" +
            "\"We asked around and found that our victim was a generally well liked person.%n" +
            "His roommate Carlson Allen mentioned that the victim had a rough relationship%n" + 
            "with his father and that him talking to his father was almost the only time he%n" +
            "ever saw him upset. He also stated that Epson seemed happier when he got his%n" +
            "girlfriend karen, and was in the process of moving in with her indefinitely.%n" +
            "His other roommates said roughly the same thing as Carlson and stated that Carlson%n" +
            "was his closest friend. They stated that the victim was at first closed off to going%n" +
            "out and having fun, preferring to study and focus his time on school and work. It was%n" +
            "Carlson who got him out of that 'funk' and got him a better job and got him out of the%n" +
            "apartment and off the school grounds to have a little fun.%n" +
            "We called his girlfriend, Karen, and she was a mess when we told her what had happened.%n" +
            "She is working at the local church, Church Of The True Christ. She stated that Epson was%n" +
            "the most kind person that she had ever met and that she often felt like she didn't deserve%n" +
            "him. She also stated that he didn't like his job as a warehouse worker, but that his previous%n" +
            "job made her feel uncomfortable. When asked what his previous job was she stated that all she%n" +
            "knew of it was that he was asked to drop packages off to locations all over and that he never%n" +
            "knew what was in those packages. Seeing a laptop we asked if she knew what the password was.%n" +
            "She stated that it was: \"Remember to L0v3!23\". I advised her to rest at the nearest family's%n" +
            "home for the night and to keep her phone with her if we have more questions.%n" +
            "The victim's family was, of course, in hysterics when we called about the victim. His father%n" +
            "denied that they fought all the time and that his son was only a little hard headed and ignorant%n" +
            "about how the world was and it made him upset at times. He stated that his son went above what he%n" +
            "could manage and didn't know how to handle it.%n" +
            "The victim's mother stated that she couldn't imagine anyone who would want him dead because he%n" +
            "was always the nicest boy. She stated that his father and him didn't always see eye to eye, but they%n" +
            "did love each other.%n" +
            "We called the victim's sister and she was distraught. She stated that he had been losing his faith%n" +
            "and that she had contacted the local church about this. She had thought that if he could regain his%n" +
            "faith then maybe he would start being happy again. When asked if she thought the victim was happy or%n" +
            "depressed she answered that he was both. He was saddened by the corruption of the world around him, %n" +
            "but loved people. She stated that all he was was 'a little lost'.%n" + 
            "The victim's youngest brother stated that he always looked up to his older brother. He stated that his%n" +
            "sister told him that she was trying everything she could do to bring him back to what he was before. He%n" +
            "had hoped that something would happen to allow him to get past this time. He also stated that he blames%n" +
            "the school and the corrupted business men who work for the devil, but know not.%n" +
            "We have not been able to make contact with the victim's previous employer, but we do have some good%n" +
            "leads as to where to go.%n", userName, userName, userName);
   
   }
   
   public void headToStationDialogue(){
      System.out.printf("After searching the small home you call up Chief Bryant and tell him that it's been a murder, not a suicide.%n" + 
                        "You tell him that you're on you're way and to collect three suspects to interrogate: Karen, Hendrickson, and Carlson.");
   }
   
   /********************************************************
   * The following methods are for the Karen story line 
   * which is generated from randomNum
   ********************************************************/
   public String getGfCoffeeTableDialogue(){
      return "On the coffee table lay one mug partly full of what looks like water%n";
   } 
   
   public void gfCoffeeTableDialogue() {
      System.out.printf("On the coffee table lay one mug partly full of what looks like water%n" +
            "and two books: The Sixth Extinction by Elizabeth Kolbert and Environmental studies:%n" +
            "From Crisis to Cure by R. Rajagopalan. Inside these books were highlights for his classes.%n" +
            "Between one of the pages in \"The Sixth Extinction\" was a small note. It states:%n" + 
            "\"Epson, thank you for working so hard! I love you more than I love anything else!%n" + 
            "Forever yours, Karen.\"" +
            "It looked like Epson was using this as his book mark.%n");
   }
   
   public String getGfBodyDialogue(){
      return "The victim lay on his back. His eyes are closed and his face looks calm.%n";
   }
   
   public void gfTheBodyDialogue() {
      System.out.printf("The victim lay on his back. His eyes are closed and his face looks calm.%n" +
            "The gunshot wound looks like it entered through the right temple, and out the left.%n" +
            "Blood is splattered across the carpet and up the wall. His shirt and pants are pulled%n" +
            "up in the back a bit, showing a bit of skin on the victim's side and on his ankles. %n" +
            "There appears to be no bruising. The gun is a low budget weapon. A small, .380 caliber,Cobra handgun.%n" +
            "It rests in the victim's open palm, the empty shell lying closer to the victim's head.%n");
   }
   
   public String getGfCouchDialogue(){
      return "The couch has two back pillows on each side, though one is laying flat on one of the cushions";
   }
   
   public void gfCouchDialogue() {
      System.out.printf("The couch has two back pillows on each side, though one is laying flat on one of%n" +
            "the cushions, the other propped up against one of the arms of the couch. You find a slim fitted%n" +
            "shirt hanging over the furthest arm of the couch, half hidden behind the one of the back pillows.%n" +
            "It looks to be female.%n");
   }
   
   public String getGfLaptopDialogue(){
      return"It opens up to an essay that is titled: \"A Possible Upcoming Extinction\"";
   }
   
   public void gfLaptopDialogue() {
      System.out.printf("Using the password given to you by the Chief you are able to log onto the victim's laptop.%n" +
         "It opens up to an essay that is titled: \"A Possible Upcoming Extinction\". Opening the victim's documents%n" +
         "you find various files associated with school and photos of Karen and the victim in different social %n" +
         "places, though a theme seemed to be religious in nature.%n" +
         "Next you open up his email and find that he had some correspondence with his old employer. His employer%n" +
         "was asking if he was happy where he was at or if he needed a bit of cash. You didn't see a response so you%n" +
         "look into the saved draft folders and find a response that states:%n" +
         "\"Dear Mr.Hendrickson,%n" +
         "Thank you so much for looking in. I personally would love to have a bit of cash, but I love my girlfriend%n" +
         "and respect her request to get out of that job. She is, and I don't blame her, uncomfortable with me%n" +
         "participating in a job that leaves what I'm delivering a mystery. I'm pretty sure I know that whatever was%n" +
         "in those packages is not quite legal. I'm not angry or mad, I just want you to know that we have a good %n" +
         "suspicion of what is in those and I just can't be affiliated with it anymore. I won't tell anyone because%n" +
         "you have been so good to me, but if this job with working at the warehouse doesn't work then I'll definitely%n" +
         "give you a call. How is-\"%n" +
         "The email ended.%n" +
         "You also find a list of emails from the victim's sister. All of which give him encouragement to participate%n" +
         "more at church and to be nicer with their father. One particular email says that she has been in contact with%n" +
         "his roommate Carlson. She states in the email that they have been chatting and that he seems like he truly wants%n" +
         "to help him see that he has no reason to be angry at the world or their father.%n");
   }
   
   public String getGfDiningTableDialogue(){
      return "The table is empty except for the vase on the table full of roses.%n";
   }
   
   public void gfDiningTableDialogue() {
      System.out.printf("The table is empty except for the vase on the table full of roses.%n" +
            "A note hangs from the lip of the vase that reads:%n" +
            "\"Karen, you keep saying that I'm too good for you. I think you're wrong.%n" + 
            "I think out of everything I've been through, you are the reason I keep going and my%n" +
            "motivation to be better. I love you!\"%n");
   }
   
   public String getGfTrashDialogue(){
      return "Looking in the trash you find that it's full of unused paper towels.%n";
   }
      
   public void gfTrashDialogue(){
      System.out.printf("Looking in the trash you find that it's full of unused paper towels.%n" +
             "After putting on some gloves and searching down the trash you find a large, empty,%n" +  
             "multi-use vial of lidocaine. You know that lidocaine is a short acting numbing agent%n" + 
             "that doctors use to numb an area so their patients don't feel pain. However, you can't find a syringe or needle.%n");  
   }
   
   public String getGfCounterTopDialogue(){
      return "You find a cell phone that turns out to be the victim's. His texts consisted mostly of him and Karen.";
   }
   
   public void gfCounterTopDialogue(){
      System.out.printf("You find a cell phone that turns out to be the victim's. The victim, conveniently, didn't have%n" + 
              "a password on his phone and you were able to look through his texts and calls. You find that the victim did%n" +
              "have multiple calls from his father and that they were quite lengthy. For the phone calls for that day, you see%n" +
              "three missed calls from his father and one from the roommate Carlson. It looks like he ignored every call that came%n" +
              "in the today.%n");
      System.out.println();
   	
      System.out.printf("His texts consisted mostly of him and Karen talking with occasional texts from his father, sister, roommate,%n" + 
              "and someone named Hendrickson. Hendrickson kept asking if the victim would meet with him and that he was willing to offer more money.%n" +
              "The texts were extremely vague. The texts between his roommate consisted of his roommate telling him that he doesn't know how lucky he is%n" +
              "and that all his anger toward his father is causing issues between his family and that it needs to stop. His sister was begging for him to%n" +
              "just ignore his father and to welcome God in more. With both the victim's sister and roommate's texts, the victim replied that he was trying%n" +
              "to be better and that he would continue to try and smile, but that his father needed to learn humility and he wasn't going to let him win.%n"); 
      System.out.println();
      
      System.out.printf("The browser history on the victim's phone moved between music, youtube, church sites, homes, and websites dealing with good jobs and%n" +
                        "how to get them.%n");
      System.out.println(); 
   
   }
   
   public String getGfStoveDialogue(){
      return "You felt a little bit of heat from the stove when you stuck your hand in. Other than that it was very clean.";
   }
   
   public void gfStoveDialogue(){
      System.out.printf("You felt a little bit of heat from the stove when you stuck your hand in. Other than that it was very clean.%n");
   }
   
   public String getGfSinkDialogue(){
      return "A small casserole dish lay in the sink. Water covered the dish and two bowls. It looked like they were placed there to keep soft."; 
   }
   
   public void gfSinkDialogue(){
      System.out.printf("A small casserole dish lay in the sink. Water covered the dish and two bowls. It looked like they were placed there to keep soft.%n"); 
   }
   
   public String getGfShowerDialogue(){
      return "The shower has one blue towel hanging on the rail of the shower. There are female and male shampoo and body wash bottles.";
   }
   
   public void gfShowerDialogue(){
      System.out.printf("The shower has one blue towel hanging on the rail of the shower. There are female and male shampoo and body wash bottles.%n" +
                        "When you look at the shower drain you find that there is a slight reddish discoloration to the water stuck in the crevice between%n" + 
                        "the metal drain and porcelain tub.%n");
   }
   
   public String getGfWasteBasketDialogue(){
      return "The waste basket is completely empty. Not even a bag is in it.";
   }
   
   public void gfWasteBasketDialogue(){
      System.out.printf("The waste basket is completely empty. Not even a bag is in it.%n");
   }
   
   public String getGfBathroomSink(){
      return "The sink is immaculately clean.";
   }
   
   public void gfBathroomSink(){
      System.out.printf("The sink is immaculately clean.");
   }
   
   public String getGfClothingBasketDialogue(){
      return "As you comb through the clothing you find a mix between what looks like clothes.";
   }
   
   public void gfClothingBasketDialogue(){
      System.out.printf("As you comb through the clothing you find a mix between what looks like the%n" +
                        "victim's and Karen's clothes. Nothing else.%n"); 
   }
   
   public String getGfClosetDialogue(){
      return "The closet is full of what you'd ordinarily find, clothes, shoes, and some storage.";
   }
   
   public void gfClosetDialogue(){
      System.out.printf("The closet is full of what you'd ordinarily find, clothes, shoes, and some storage%n" +
                         "boxes. You find a small storage box behind one of the other ones with some cash in it and%n" +
                         "a letter stating: Just a little something to help remind you what you could have. No signature.%n"); 
   }
   
   public String getGfBedDialogue(){
      return "The bed looks disheveled, the blanket half on the floor leading to the living room. Underneath it you find a small box with letters."; 
   }
   
   public void gfBedDialogue(){
      System.out.printf("The bed looks disheveled, the blanket half on the floor leading to the living room. Underneath it you find%n" +
                         "a small box with letters. Some of the letters are from the victim's sister saying how she thinks that the victim%n" +
                         "should listen to his roommate and that he seems very passionate about helping their family stick together.%n");
   }
   
   public String getGfNightstandDialogue(){
      return "There are some books that lay on the top of the night stand.";
   }
   
   public void gfNightstandDialogue(){
      System.out.printf("There are some books that lay on the top of the night stand. The titles are: A Journey Through the Body,%n" +
                        "the American Medical Journal, and The study of Anesthetics. Inside the first drawer you find a stack of notes and papers,%n" +
                        "what look like love letters from the victim to his girlfriend. You also find a small card with a doctors appointment for Karen three days ago.%n%n"); 
	   System.out.printf("The second drawer consisted of deeply religious texts including the Bible, Making the hard decisions, and The Next Life: Blessings and freedom.%n" +
                        "You also find a pamphlet with the times of The Church of the True Christ, being from seven am to seven pm, with various times when sermons start.%n" +
                        "You also find a small box labeled: My Journal. The box is empty however.%n");
   }
   
   public void stationDialogue(){
      System.out.printf("When you arrive at the police station a little later Chief Bryant comes running over to you.%n" +
	                     "Hello %s.%n We collected them as you wished and placed them in separate interrogation rooms.%n", userName); 
   }
   
   public void karenInterDialogue(){
      System.out.printf("You: Where were you today?%n" +
		                  "Karen: I was at the church all day. Today is my day of worship.%n" + 
		                  "You: How long have you and Epson known each other?%n" +   
                        "Karen: Two years. We met at church%n" +
                        "You: Did Epson seem upset about anything?%n" +
		                  "Karen: He was usually upset at his father if anything. But that's not his fault!%n" +
                        "His father expected too much of him. Epson did the best he could in everything he could. It's just not fair that everything was against him.%n%n" +
		                  "You: Did Epson have any enemies?%n" +
		                  "Karen: Of course he did. His father was one. His previous employer was extremely shady and seemed to really want Epson back. He kept%n" +
                        "sending him money incentives and notes. He was actually getting a little pushy about it and Epson went and bought a small gun because%n" +
                        "he was scared. His roommate, Carlson, also seemed to be getting agitated anytime Epson talked to his father. That's one of the reasons we%n" +
                        "decided to buy a small home. My parents gave us a loan so we could pay for the down payment, though Epson hated the idea borrowing money from my parents.%n" +
                        "But Carlson's reactions scared me and I convinced Epson to leave.%n%n" +
		                  "You: Did you two ever fight?%n" + 
                        "Karen: No! We never fought! You have to understand, Epson was the nicest and most genuine person I've ever met! He was so earnest and kind.%n" +
                        "I learned so much from him and I consider myself a very well versed person in morals and scriptures. He was born in a time when evil abounds and%n" +
                        "the good are the ones who suffer the most. That's why he was having such a hard time. Because he was so good. He's happier now, I know it.%n" +
                        "He's in a place that is more aligned with how his soul is. I'm devastated he's gone and i'll miss him. But even you have to admit that for someone%n" +
                        "who is as good as this man was, he didn't deserve the hand he was dealt.%n%n" +
		                  "You: Thank you for your time.%n" +
		                  "Karen: Please, %s.. When you do find the person who did this, don't be too hard on them. I'm sure Epson wouldn't want it.%n", userName);
   }
   
   public void hendricksonInterDialogue(){
      System.out.printf("You: Hello Mr.Hendrickson. You're a hard man to track down. Why is that?%n" +
		                  "Hendrickson: You've got it all wrong sir. You assume that because I'm hard to track down that I have something to hide and are thus suspicious when that is simply not true.%n" +
                        "I am just a man who likes my privacy and privacy is not a crime.%n%n" +
		                  "You: Where were you today?%n" +
		                  "Hendrickson: I was doing business on the other side of town. I'm in the delivery business, but I'm very picky about my clients.%n" +
		                  "You: That's a little shady.%n" +
		                  "Hendrickson: Are we here to talk about my business? If so, I'm afraid we're at an end of discussion and you are holding me against my will.%n" +
		                  "You: Another time then. Tell me, Why have you been trying to contact Epson?" +
		                  "Hendrickson: That boy was a natural with people. My clients loved him because of how personable he was. Truly a wonderful boy. Unfortunately his girlfriend didn't like me and%n" +
                        "forced him to change jobs. You see, I happen to know about poor Epson's financial struggle and I was the only one who helped him. His girlfriend steered him into financial disaster,%n" +
                        "forcing that young boy into a job he hated and that didn't pay him well. I was only trying to help him. I even offered him a raise. You see good sir, I am not the bad guy here. I'm the good guy.%n%n" +
		                  "You: Can you explain why he bought a gun? I have good evidence that it was because he was afraid of someone.%n" +
		                  "Hendrickson: My good sir, I have no idea why he would have bought a gun. I was very professional in how I handled myself with that boy." +
		                  "You: Do you know anyone who would have wanted him killed?%n" +
		                  "Hendrickson: As far as I'm aware, he didn't have any enemies.%n" +
		                  "You: Thank you for your time.%n" +
		                  "Hendrickson: If it's any consolation, I really liked Epson. He was a good lad. I really did want to see him succeed and having him killed is the last thing I'd have wanted%n");
   }
   
   public void carlsonInterDialogue(){
      System.out.printf("You: How close were you with Epson?%n" +
		                  "Carlson: I would say we were almost brothers. He was like family to me. I still can't believe he's gone.%n" +
		                  "You: You were in contact with his sister, Hannah?%n" +
		                  "Carlson: I am. You could say we are actually a couple. Though distance separates us, I feel connected to her through God and through our similarities.%n" +
		                  "You: I've also heard you had confronted Epson about his family. This is true?%n" +
		                  "Carlson: It is. I do have a bit of an anger issue. But I'm working on it. Hannah has really helped me. It's just that my father had anger issues and I'm afraid that I inherited the sin.%n" +
                        "I've never touched Epson if that's what this is about. I've talked to him because the way he talks to his father isn't right. I didn't have a father who loved me and I think it's very short%n" +
                        "sighted to say those kinds of things to one who does. It also hurt Hannah and the rest of the family when they yelled at each other. I was trying to protect the whole family and keep them together.%n%n" +
		                  "You: This anger problem, have you ever lost control before?%n" +
		                  "Carlson: ... Yes sir. I was actually put in jail a few years ago because of it. But I'm better now! I haven't blacked out like that since I was eighteen. Hannah and God have really helped me see the right path.%n" +
                        "I swear I haven't touched anyone.%n%n" +
                        "You: Who do you think would want Epson dead?%n" + 
                        "Carlson: No one sir. I can't think of a single person. Epson was very kind. He was very focused on his school work at first, and I mean the kind of focus where you don't stop studying or worrying about tests.%n" +
                        "That can drive a person to insanity. So I helped get him back out. I loved the man. We became close after that and that how I got involved with his family. I swear that if I find out who did this,%n" +
                        "then I may have another one of my black out moments.%n%n" + 
                        "You: Thank you for your time.%n" +
                        "Carlson: %s. You've got to find the person who did this. They don't deserve to get away with this. Epson was a good man.%n", userName);
   }
   
   public void chooseKaren(){
      Scanner input = new Scanner(System.in);
      System.out.printf("Karen burst into tears.%n" + 
	                     "Karen: He was too good for this world. He was too kind. If angels still roamed the earth then he would have been one. The devil focused on him because of his goodness. It wasn't fair. He needed to be in the other world.%n" +
                        "She took a couple of breaths in between her tears, but it seemed liked now that she was talking she couldn't stop. I read that loved ones are the ones who have to make the hardest decisions and I knew that this is what I had to do.%n" +
                        "For him. It was all for him. I gave him the best last day that I could and that night I, I, I sent him to a better place. He's happy now. I know it. When I see him again he'll forgive me. He will.%n%n" +
	                     "You: How did you do it?%n" +
	                     "Karen: I called Hendrickson,between sobs. He gave me something that would help my Epson be numb and happy. I then went to my doctors appointment and snuck into his cupboards and took some lidocaine, a syringe, and a needle.%n" +
                        "I've been reading up on numbing agents. Last night I spiked his drink and after he fell into a dreamy state, I injected the entire bottle of lidocaine into his veins to stop his heart. Painless. He smiled the whole time.%n%n" +
	                     "You: Why did you shoot him?%n" +
	                     "Karen was silent for moment and then bowed her head and started crying again.%n" +
	                     "Karen: I was going to kill myself, but I couldn't. I wasn't ready for that. I still have lots to learn about being good here. I decided to try and make it look like a suicide and dragged him to the living room and that's where I did it.%n" +
                        "I got scared and left right after. I threw away the syringe and needle in the garbage and tried to wash the blood that was on my hands in the bathtub. I then grabbed my towel and the bathroom garbage and left to the church.%n" +
                        "I hid in the back until church started and stayed there. Praying.%n%n" +
	                     "You take a deep breath out and stand up, nodding to the officers outside the door. They come in and grab Karen to escort her out. Karen pauses next to you, head hanging low.%n" + 
	                     "Karen: I know I did wrong, she whispered. Do you think he will forgive me?%n");
      System.out.println("What do you think (y/n)");
      char answ = input.next().charAt(0);
      
      if(answ == 'y'){
		   System.out.printf("Karen smiled weakly, tears streaming down her face.%n" +
			                  "Karen: Thank you %s.%n" +
			                  "You watch as the officers escort her out of the room.%n", userName);
      }else{
		   System.out.printf("Karen's whole body slumped in the grip of the officers and she began weeping.%n" +
			                  "Karen: I'm sorry Epson, I'm sorry. I'm so sorry.%n" +
			                  "You hear Karen repeat this over and over until she is escorted out of the room.%n");
      }

   }
      
            
   public void notKaren() {
      System.out.printf("A week after you made the arrest for Epson Holden you get a call and to your surprise, it's to the same house.%n" +
            "When you arrive you find Karen's body on the floor, blood splatting the wall behind her. Chief Bryant walks up to you and hands you a letter.%n" +
            "\"This was found by the victim. It's adressed to you.\" he says.%n" +
            "Confused, you open the letter and read:%n" +
            "\" Dear %s,%n" +
            "I have been living in torment for the last week. I thought I could handle it, but I can't. I can't live without him and so I've decided%n" +
            "to join him. It was me that sent Epson to where he belongs. He deserves to be with God and his fellow kind and I do not regret that. I do%n" +
            "regret that it took me this long to realize that I was suppose to go with him. Together. I wanted to apologize for making you go through%n" +
            "the whole investigation only to be wrong in the end. Please accept my apologies. At last I can be free. May God be with you all.\"%n" +
            "You look up at the Chief, your eyes wide. His expression seemed dark, his eyes boring into you.%n" +
            "\"You were wrong %s.\"",userName, userName);
   }
   
   /********************************************************
   * The following methods are for the Hendrickson story line 
   * which is generated from randomNum
   ********************************************************/
   
   public String getHenCoffeeTableDialogue(){
      return "One mug on the table, one underneath. One of the books had some blood on it. The carpet had reddish discolored%n" +
           "splotches";
   } 
   
   public void henCoffeeTableDialogue() {
      System.out.printf("On the coffee table lay one mug, partly full of some kind of drink, possibly wine.%n" + 
            "There are two books, The: The Sixth Extinction by Elizabeth Kolbert and Environmental studies: %n" + 
            "From Crisis to Cure by R. Rajagopalan. One of the books had what looked like a spot of blood on one %n" + 
            "of its edges.%n" + 
		      "You also notice another mug underneath the table, lying on it's side, with what looked looked more wine%n" + 
            "staining the carpet. You also notice a few splotches of discolored carpet, reddish in hue, leading from the%n" + 
            "table to the victim's bedroom.%n");
   }
   
   public String getHenBodyDialogue() {
      return String.format("The victim is lying on his stomach, the gunshot entering the right side of the head and exiting through the left.%n" +
             "There's a gash on the right side of his head.");
   }
   
   public void henTheBodyDialogue() {
      System.out.printf("The victim is lying on his stomach, his right arm arching above his head while the left arm lay next to%n" + 
            "his body.. The gunshot looked like it entered through the right side of his head and exited through the left side. %n" + 
            "Just above the right temple you see another gash that looks separate from the gunshot wound. There was a cone of blood%n" + 
            "streaking the carpet from the body. The gun a small .380 caliber Cobra handgun, lay in the boy's grasp. A single shell %n" + 
            "lay next to it.%n");
   }
   
   public String getHenCouchDialogue(){
      return String.format( "Cell phone was found under the couch. There are multiple texts with Karen and Hendrickson.%n" +
            "Hendrickson offers him more money to come back to work. There's a message from his Carlson that%n" +
            "tells Epson to be kinder to his father.");
   }
   
   public void henCouchDialogue() {
      System.out.printf("The couch has two back pillows on each side, though one is laying flat on one of the cushions, the other%n" + 
            "propped up against one of the arms of the couch. You find a slim fitted shirt hanging over the furthest arm of the%n" + 
            "couch, half hidden behind the one of the back pillows. It looks to be female. You then notice a shiny object poking%n" + 
            "from beneath the couch. You find a cell phone that turns out to be the victim's. The victim, conveniently, didn't have%n" + 
            "a password on his phone and you were able to look through his texts and calls.%n" + 
		      "His texts consisted mostly of him and Karen talking with occasional texts from his father, sister, roommate, and someone%n" + 
            "named Hendrickson. Hendrickson kept asking if the victim would meet with him and that he was willing to offer more money. %n" + 
            "The texts were extremely vague. The texts between his roommate consisted of his roommate telling him that he doesn't know%n" + 
            "how lucky he is and that all his anger toward his father is causing issues between his family and that it needs to stop.%n" + 
            "His sister was begging for him to just ignore his father and to welcome God in more. With both the victim's sister and %n" + 
            "roommate's texts, the victim replied that he was trying to be better and that he would continue to try and smile, but that%n" + 
            "his father needed to learn humility and he wasn't going to let him win.%n" +
 	         "The browser history on the victim's phone moved between music, youtube, church sites, homes, and websites dealing with%n" + 
            "good jobs and how to get them.%n");
   }
   
   public String getHenLaptopDialogue(){
      return "You find an email with his previous employer who offers him more money if he comes back to work for him%n" +
            "which drafts a letter to refuse the offer. There are also emails from the victims sister telling him to have%n" +
            "have faith and listen to his roommate";
   }
   
   public void henLaptopDialogue() {
      System.out.printf("Using the password given to you by the Chief you are able to log onto the victim's laptop. It opens up to an%n" + 
            "essay that is titled: \"A Possible Upcoming Extinction\". Opening the victim's documents you find various files associated%n" + 
            "with school	and photos of Karen and the victim in different social places, though a theme seemed to be religious in nature.%n" +  
            "Next you open up his email and find that he had some correspondence with his old employer. His employer was asking if he%n" + 
            "was happy where he was at or if he needed a bit of cash. He also had said that he'd like to talk if the victim could spare%n" + 
            "a moment. You didn't see a response so you look into the saved draft folders and find a response that states:%n" + 
            "\"Dear Mr.Hendrickson,%n" + 
            "Thank you so much for looking in. I personally would love to have a bit of cash, but I love my girlfriend and respect her%n" + 
            "request to get out of that job. She is, and I don't blame her, uncomfortable with me participating in a job that leaves what%n" + 
            "I'm delivering a mystery. I'm pretty sure I know that whatever was in those packages is not quite legal. I'm not angry or %n" + 
            "mad, I just want you to know that we have a good suspicion of what is in those and I just can't be affiliated with it anymore.%n" + 
            "I won't tell anyone because you have been so good to me, but if this job with working at the warehouse doesn't work then I'll %n" + 
            "definitely give you a call. How is\"%n" + 
            "The email ended.%n" + 

            "You also find a list of emails from the victim's sister. All of which give him encouragement to participate more at church%n" + 
            "and to be nicer with their father. One particular email says that she has been in contact with his roommate Carlson. She %n" + 
            "states in the email that they have been chatting and that he seems like he truly wants to help him see that he has no reason%n" + 
            "to be angry at the world or their father.%n");
   }
   
   public String getHenDiningTableDialogue(){
      return null;
   }
   
   public void henDiningTableDialogue() {
      System.out.printf("The table is empty except for the vase on the table full of roses. A note hangs from the lip of the vase that reads:%n" +
            "\"Karen, you keep saying that I'm too good for you. I think you're wrong. I think out of everything I've been through, you are %n" +
            "the reason I keep going and my motivation to be better. I love you!\"%n");
   }
   
   public String getHenTrashDialogue(){
      return "Theres a bottle of used bleach and a rag that also smells strongly of bleach.";
   }
      
   public void henTrashDialogue() {
      System.out.printf("Looking in the trash you find an empty bleach bottle, the smell being very strong. You also find a damp rag that%n" + 
           "also smells like bleach.%n");  
   }
   
   public String getHenCounterTopDialogue() {
      return "A casserole dish with only a quarter of potato casserole left sat next to a stack of paper plates and cups.";
   }
   
   public void henCounterTopDialogue() {
      System.out.printf("A casserole dish with only a quarter of potato casserole left sat next to a stack of paper plates and cups.%n"); 
   }
   
   public String getHenStoveDialogue(){
      return "You felt a little bit of heat from the stove when you stuck your hand in. Other than that it was very clean.";
   }
   
   public void henStoveDialogue(){
      System.out.printf("You felt a little bit of heat from the stove when you stuck your hand in. Other than that it was very clean.%n");
   }
   
   public String getHenSinkDialogue(){
      return "A bowl lay in the sink, laying on its side. The smell of bleach was strong here."; 
   }
   
   public void henSinkDialogue(){
      System.out.printf("A bowl lay in the sink, laying on its side. The smell of bleach was strong here.%n"); 
   }
   
   public String getHenShowerDialogue(){
      return "The shower has both a blue and pink towel hanging on the rail of the shower. There are female%n" +
            "and male shampoo and body wash bottles.";
   }
   
   public void henShowerDialogue(){
      System.out.printf("The shower has both a blue and pink towel hanging on the rail of the shower. There are female%n" +
            "and male shampoo and body wash bottles.%n");
   }
   
   public String getHenWasteBasketDialogue(){
      return "The waste basket is full of a tissues and pieces of trash.";
   }
   
   public void henWasteBasketDialogue(){
      System.out.printf("The waste basket is full of a tissues and pieces of trash.%n");
   }
   
   public String getHenBathroomSink(){
      return "The sink is immaculately clean.";
   }
   
   public void henBathroomSink(){
      System.out.printf("The sink is immaculately clean.%n");
   }
   
   public String getHenClothingBasketDialogue(){
      return "There's a mix between what looks like the victim's and Karen's clothes. Nothing else.";
   }
   
   public void henClothingBasketDialogue(){
      System.out.printf("As you comb through the clothing you find a mix between what looks like the victim's and%n" +
            "Karen's clothes. Nothing else.%n"); 
   }
   
   public String getHenClosetDialogue(){
      return null;
   }
   
   public void henClosetDialogue(){
      System.out.printf("The closet is full of what you'd ordinarily find, clothes, shoes, and some storage boxes.%n" + 
            "You find a small storage box behind one of the other ones with some cash in it and a letter stating:%n" + 
            "\"Just a little something to help remind you what you could have\". No signature.%n" + 
            "You also notice that there is a hole just on the side of the wall near the door that could have been a bullet hole.%n"); 
   }
   
   public String getHenBedDialogue(){
      return "The bed looks made and neat. Underneath it you find a small box with letters."; 
   }
   
   public void henBedDialogue(){
      System.out.println("The bed looks made and neat. Underneath it you find a small box with letters. Some of the letters are%n" +
            "from the victim's sister saying how she thinks that the victim should listen to his roommate and that he seems very%n" +
            "passionate about helping their family stick together.%n");
   }
   
   public String getHenNightstandDialogue(){
      return "There is a lamp laying on it's side on the carpet next to the nightstand.";
   }
   
   public void henNightstandDialogue(){
      System.out.printf("There is a lamp laying on it's side on the carpet next to the nightstand. Inside the first drawer you%n" +
      "find a stack of notes and papers, what look like love letters from the victim to his girlfriend. You also find a small%n" +
      "card with a doctors appointment for Karen three days ago.%n" +
	   "The second drawer consisted of deeply religious texts including the \"Bible\", \"Making the hard decisions\", and%n" +
      "\"The Next Life: Blessings and freedom\". You also find a pamphlet with the times of \"The Church of the True Christ\"%n" +
      ", being from seven am to seven pm, with various times when sermons start. You also find a small box labeled:%n" +
      "\"My Journal\". Inside is a journal from the victim's girlfriend. As you flip through it you find most of them about%n" +
      "her feelings for Epson and how she's worried that he's stressed about his job. She mentions that his old boss, %n" +
      "Hendrickson, has been very persistent with trying to get Epson to come back and that she thinks that's why he bought a%n" +
      "gun, though she's not completely sure. She wrote that it may have been because his old roommate was getting a bit heated%n" +
      "with him lately and she knows that he has a dark past.%n"); 
   }
   
   public void henKarenInterDialogue(){
      System.out.printf("You: \"Where were you today?\"%n" +
		      "Karen: \"I was at the church all day. Today is my day of worship.\"%n" + 
		      "You: \"How long have you and Epson known each other?\"%n" +
		      "Karen: \"Two years. We met at church\"%n" +
		      "You: \"Did Epson seem upset about anything?\"%n" +
		      "Karen: \"He was usually upset at his father if anything. But that's not his fault! His father expected too much of%n" +
            "him. Epson did the best he could in everything he could. It's just not fair that everything was against him.\"%n" +
		      "You: \"Did Epson have any enemies?\"%n" +
		      "Karen: \"Of course he did. His father was one. His previous employer was extremely shady and seemed to really%n" +
            "want Epson back. He kept sending him money incentives and notes. He was actually getting a little pushy about it.%n" +
            "Epson also said to me that he felt like someone had been following him lately and went and bought a small gun because%n" +
            "it freaked him out. He thought that maybe a client from his old job or someone might be tailing him. His roommate, Carlson,%n" +
            "also seemed to be getting agitated anytime Epson talked to his father. That's one of the reasons we decided to buy a small%n" +
            "home. My parents gave us a loan so we could pay for the down payment, though Epson hated the idea borrowing money from my%n" +
            "parents. But Carlson's reactions scared me and I convinced Epson to leave.\"%n" +
		      "You: \"Did you two ever fight?\"%n" + 
		      "Karen: \"No! We never fought! You have to understand, Epson was the nicest and most genuine person I've ever met!%n" +
            "He was so earnest and kind. I learned so much from him and I consider myself a very well versed person in morals %n" +
            "and scriptures. He was just unfortunate to get caught up in things like his old job. If only he didn't buy that gun.%n" +
            "Maybe he'd still be here with us.\"%n" +
		      "You: \"Thank you for your time.\"%n" +
		      "Karen: \"Please, %s.. When you do find the person who did this, get justice for my Epson.%n", userName);
   }
   
   public void henHendricksonInterDialogue(){
      System.out.printf("You: \"Hello Mr.Hendrickson. You're a hard man to track down. Why is that?\"%n" +
		      "Hendrickson: \"You've got it all wrong sir. You assume that because I'm hard to track down that I have something%n" +
            "to hide and are thus suspicious when that is simply not true. I am just a man who likes my privacy and privacy is not a crime.\"%n" +
		      "You: \"Where were you today?\"%n" +
		      "Hendrickson: \"I was doing business on the other side of town. I'm in the delivery business, but I'm very picky about my clients.\"%n" +
		      "You: \"That's a little shady\".%n" +
		      "Hendrickson: \"Are we here to talk about my business? If so, I'm afraid we're at an end of discussion and you are holding%n" +
            "me against my will.\"%n" +
		      "You: \"Another time then. Tell me, Why have you been trying to contact Epson?\"%n" +
		      "Hendrickson: \"That boy was a natural with people. My clients loved him because of how personable he was.%n" + 
            "Everyone has their secrets though. Epson wasn't the good guy everyone thought he was. He'd stab his friend in%n" +
            "the back if the opportunity came, but I had to admit that he was the best with hiding it. He even fooled me.%n" +
            "Unfortunately his girlfriend didn't like me and and forced him to change jobs, which I think started it all.%n" +
            "You see, I happen to know about poor Epson's financial struggle and I was the only one who helped him. His%n" + 
            "girlfriend steered him into financial disaster, forcing that young boy into a job he hated and that didn't%n" +
            "pay him well. I was only trying to help him. It's too bad that something like this happened. If you ask me I%n" +
            "think his girlfriend was a bit of an overzealous religious freak and made him depressed. I'd shoot myself if %n" +
            "I had someone like that in my life. You see good sir, I am not the bad guy here. I'm the good guy.\"%n" +
		      "You: \"Can you explain why he bought a gun? I have good evidence that it was because he was afraid of someone.\"%n" +
		      "Hendrickson: \"My good sir, I have no idea why he would have bought a gun. I didn't even know he had one. No,%n" +
            "that kid wouldn't even know how to handle one.\"%n" +
		      "You: \"Do you know anyone who would have wanted him killed?\"%n" +
		      "Hendrickson: \"As far as I'm aware, his enemies consisted of his father and his own idiocy. I offered him a large%n" +
            "sum of money and he turned it down to please his woman. I say, it was down right foolish and I think he's been%n" +
            "regretting that ever since if you ask me. No sir, that girl ruined him.\"%n" +
		      "You: \"Thank you for your time.\"%n" +
		      "Hendrickson: \"If it's any constellation, I really liked Epson. He was a good lad. I really did want to see him succeed%n" +
            "and his death is a sad mistake.\"%n");
   }
   
   public void henCarlsonInterDialogue(){
      System.out.printf("You: \"How close were you with Epson?\"%n" +
		      "Carlson: \"I would say we were almost brothers. He was like family to me. I still can't believe he's gone.\"%n" +
		      "You: \"You were in contact with his sister, Hannah?\"%n" +
		      "Carlson: \"I am. You could say we are actually a couple. Though distance separates us, I feel connected to her%n" +
            "through God and through our similarities.\"%n" +
		      "You: \"I've also heard you had confronted Epson about his family. This is true?\"%n" +
		      "Carlson: \"It is. I do have a bit of an anger issue. But I'm working on it. Hannah has really helped me. It's just%n" +
            "that my father had anger issues and I'm afraid that I inherited the sin. I've never touched Epson if that's what this%n" +
            "is about. I've talked to him because the way he talks to his father isn't right. I didn't have a father who loved me %n" +
            "and I think it's very short sighted to say those kinds of things to one who does. It also hurt Hannah and the rest of%n" +
            "the family when they yelled at each other. I was trying to protect the whole family and keep them together.\"%n" +
		      "You: \"This anger problem. Have you ever lost control before?\"%n" +
		      "Carlson: \"... Yes sir. I was actually put in jail a few years ago because of it. But I'm better now! I haven't blacked%n" +
            "out like that since I was eighteen. Hannah and God have really helped me see the right path. I swear I haven't touched anyone.\"%n" +
            "You: \"Who do you think would want Epson dead?\"%n" + 
            "Carlson: \"No one sir. I can't think of a single person. Epson was very kind. He was very focused on his school work at%n" +
            "first, and I mean the kind of focus where you don't stop studying or worrying about tests. That can drive a person to insanity.%n" +
            "So I helped get him back out. I loved the man. We became close after that and that how I got involved with his family.%n" +
            "I swear that if I find out who did this, then I may have another one of my black out moments.\"%n" + 
            "You: \"Thank you for your time.\"%n" +
            "Carlson: \"%s. You've got to find the person who did this. They don't deserve to get away with this.%n" +
            "Epson was a good man.%n", userName);
   }
   
   public void chooseHendrickson(){
      System.out.printf("Hendrickson screwed his face up in anger.%n" +
	         "\"That boy would have ruined everything! He was selfish! After everything I did for him and was willing to do%n" +
            "for him he then goes to refuse me when I wanted his help. I went to his house to talk to him, to convince him,%n" +
            "and you know what he did? He pulled out his phone to call the police! Just because I had him watched! I was worried%n" +
            "about him. I wanted to make sure my associate was successful and because of this, he betrayed me. He didn't deserve my%n" +
            "help. He didn't deserve any of it. That just goes to show you that even the nice ones will betray you in the end. What%n" +
            "else do you want from me? Or can I just be escorted away? I'd rather not sit here anymore.\"%n" +
	         "You stand up and nod to the officers outside the door. They come in and take Hendrickson by his arms and lead him out of the room.%n");
    }
    
    public void notHendrickson() {
      System.out.printf("A package arrives on your desk a month after the Epson Holden case. There's a letter attached to the top. It reads:%n" +
            "\"Dear %s, %n" +
            "I want to thank you for being dim witted. I killed young Epson because of what he knew about me. I shall do the same for %n" +
            "Carlson and Epson's radiculous girlfriend in due time, but the point is I can't let you off either with the suspicions that have%n" +
            "grown around me. Sorry about this. Not your fault really. Tell Epson he's an idiot for me.%n" +
            "Hendrickson.\"%n" +
            "You suddenly realize there's a ticking noise coming from the package. You quickly spring to your feet when suddenly you hear a loud%n" +
            "\"BOOM\". You feel an incredible amount of heat searing your body, your ears ringing, and then everyting hoes black.%n",userName);
    }
   
   /********************************************************
   * The following methods are for the Carlson story line 
   * which is generated from randomNum
   ********************************************************/
   
   public String getCarlCoffeeTableDialogue(){
      return "There are two mugs and two books on te coffee table. Between one of them is a love note from Karen.";
   } 
   
   public void carlCoffeeTableDialogue() {
      System.out.printf("On the coffee table lay two mugs, one half full of what looked like water, and two books:%n" + 
            "\"The Sixth Extinction by Elizabeth Kolbert\" and \"Environmental studies: From Crisis to Cure by R. Rajagopalan.\"%n" +
            "Inside these books were highlights for his classes. Between one of the pages in \"The Sixth Extinction\" was a small%n" +
            "note. It states:%n" +
            "\"Epson, thank you for working so hard! I love you more than I love anything else!%n" + 
            "Forever yours, Karen.\"%n" +
	         "It looked like Epson was using this as his book mark.%n");
   }
   
   public String getCarlBodyDialogue(){
      return "The victim lays on his back, feet toward the couch. The gunshot wound enters through the front of the head%n" +
            "He got a call from his roommate and father on the same day. Karen left a voice mail that Carlson wanted to know%n" +
            "what time she was leaving for church. She sounded troubled. There were texts from someone named Hendrickson as well%n" +
            "who was offering him more money after speaking with the victim";
   }
   
   public void carlTheBodyDialogue() {
      System.out.printf("The victim lay on his back in the middle of the living room, his feet toward the couch. %n" +
            "The gunshot wound looks like it entered through the front of the head, and out the back. Blood is pooled%n" +
            "behind his head, but not across the carpet. There appears to be no bruising. The gun is a low budget weapon.%n" +
            "A small, .380 caliber,Cobra handgun. It rests in the victim's open palm, the empty shell lying closer to the%n" +
            "victim's head.%n" +
	         "In his pockets You find his cell phone.The victim, conveniently, didn't have a password on his phone and you%n" +
            "were able to look through his texts and calls. You find that the victim did have multiple calls from his father%n" +
            "and that they were quite lengthy. For the phone calls for that day, you see that he got a call from his roommate%n" +
            "and his father. There was a voicemail from Karen stating that Carlson texted her and wanted to know what time she%n" +
            "was going to go to church and that it sounded like he was troubled. She asked if Epson would call him and see if%n" +
            "he was okay.%n" +
		      "His texts consisted mostly of him and Karen talking with occasional texts from his father, sister, roommate, and %n" +
            "someone named Hendrickson. Hendrickson kept asking if the victim would meet with him and that he was willing to %n" +
            "offer more money. The texts were extremely vague. The texts between his roommate consisted of his roommate telling%n" +
            "him that he doesn't know how lucky he is and that all his anger toward his father is causing issues between his %n" +
            "family and that it needs to stop. His sister was begging for him to just ignore his father and to welcome God in more.%n" +
            "With both the victim's sister and roommate's texts, the victim replied that he was getting a little tired of them%n" +
            "telling him to just trust God when that doesn't actually help his situation. He told them that his father needed %n" +
            "to learn humility and he wasn't going to let him win.%n" +
 	         "The browser history on the victim's phone moved between music, youtube, church sites, homes, and websites dealing %n" +
            "with good jobs and how to get them.%n");
   }
   
   public String getCarlCouchDialogue(){
      return String.format("Blood is present on the furthest side of the couch. It also looks like blood had been on the walls and someone%n" +
            "tried to rub it off. There is also blood on under the cusion");
   }
   
   public void carlCouchDialogue() {
      System.out.printf("The couch had drops of red on the furthest side. The wall behind the couch looks a bit reddish, as if%n" +
            "someone had tried to get blood off the wall. After further inspection you find blood between the cushions and a%n" +
            "stain of red on the arm of the couch.%n");
   }
   
   public String getCarlLaptopDialogue(){
      return String.format("There is a response to Hendrickson declining the offer of coming back to work for him. There are also emails%n" +
            "from Carlson explaining that Epson needs to stop hurting his family and that he doesn't understand what %n" +
            "it means to have a non supportive father.");
   }
   
   public void carlLaptopDialogue() {
      System.out.printf("Using the password given to you by the Chief you are able to log onto the victim's laptop. It opens up to an%n" +
            "essay that is titled: \"A Possible Upcoming Extinction\". Opening the victim's documents you find various files associated%n" +
            "with school and photos of Karen and the victim in different social places, though a theme seemed to be religious in nature.%n" + 
            "Next you open up his email and find that he had some correspondence with his old employer. His employer was asking if he was%n" +
            "happy where he was at or if he needed a bit of cash. You didn't see a response so you look into the saved draft folders and %n" +
            "find a response that states:%n" +
            "\"Dear Mr.Hendrickson,%n" +
            "Thank you so much for looking in. I personally would love to have a bit of cash, but I love my girlfriend and respect her %n" +
            "request to get out of that job. She is, and I don't blame her, uncomfortable with me participating in a job that leaves %n" +
            "what I'm delivering a mystery. I'm pretty sure I know that whatever was in those packages is not quite legal. I'm not angry%n" +
            "or mad, I just want you to know that we have a good suspicion of what is in those and I just can't be affiliated with it %n" +
            "anymore. I won't tell anyone because you have been so good to me, but if this job with working at the warehouse doesn't work %n" +
            "then I'll definitely give you a call. How is\"%n" +
            "The email ended.%n" +
            "You also find a list of emails from Carlson. Each email consisted of telling the victim to stop arguing with his father %n" +
            "because it hurts the rest of his family, especially Hannah. He goes on to explain that his life growing up was difficult,%n" +
            "his father going into blind rages and beating his family. He uses this as an example of what a bad father really is and%n" +
            "that he's being really ungrateful to think the same way about his.%n");
   }
   
   public String getCarlDiningTableDialogue(){
      return "The table is empty except for the vase on the table full of roses.%n";
   }
   
   public void carlDiningTableDialogue() {
      System.out.printf("The table is empty except for the vase on the table full of roses.%n" +
            "A note hangs from the lip of the vase that reads:%n" +
            "\"Karen, you keep saying that I'm too good for you. I think you're wrong.%n" + 
            "I think out of everything I've been through, you are the reason I keep going and my%n" +
            "motivation to be better. I love you!\"%n");
   }
   
   public String getCarlTrashDialogue(){
      return "The trash is empty, not even a liner in the bin.";
   }
      
   public void carlTrashDialogue(){
      System.out.printf("The trash is empty, not even a liner in the bin.%n");  
   }
   
   public String getCarlCounterTopDialogue(){
      return "A casserole dish with only a quarter of potato casserole left sat next to a stack of paper plates and cups.";
   }
   
   public void carlCounterTopDialogue(){
      System.out.printf ("A casserole dish with only a quarter of potato casserole left sat next to a stack of paper plates and cups.%n");
         
   }
   
   public String getCarlStoveDialogue(){
      return "You felt a little bit of heat from the stove when you stuck your hand in. Other than that it was very clean.";
   }
   
   public void carlStoveDialogue(){
      System.out.printf("You felt a little bit of heat from the stove when you stuck your hand in. Other than that it was very clean.%n");
   }
   
   public String getCarlSinkDialogue(){
      return "The sink was spotless. Looked just recently cleaned."; 
   }
   
   public void carlSinkDialogue(){
      System.out.printf("The sink was spotless. Looked just recently cleaned.%n"); 
   }
   
   public String getCarlShowerDialogue(){
      return String.format("The shower has both a blue and pink towel hanging on the rail of the shower. There are female and male shampoo and body%n" +
      "wash bottles.%n");
   }
   
   public void carlShowerDialogue(){
      System.out.printf("The shower has both a blue and pink towel hanging on the rail of the shower. There are female and male shampoo and%n" +
            "body wash bottles.%n");
   }
   
   public String getCarlWasteBasketDialogue(){
      return "The waste basket is full of a tissues and pieces of trash.";
   }
   
   public void carlWasteBasketDialogue(){
      System.out.printf("The waste basket is full of a tissues and pieces of trash.%n");
   }
   
   public String getCarlBathroomSink(){
      return "The sink is immaculately clean.";
   }
   
   public void carlBathroomSink(){
      System.out.printf("The sink is immaculately clean.");
   }
   
   public String getCarlClothingBasketDialogue(){
      return "As you comb through the clothing you find a mix between what looks like clothes.";
   }
   
   public void carlClothingBasketDialogue(){
      System.out.printf("As you comb through the clothing you find a mix between what looks like the%n" +
                        "victim's and Karen's clothes. Nothing else.%n"); 
   }
   
   public String getCarlClosetDialogue(){
      return "The closet is full of what you'd ordinarily find, clothes, shoes, and some storage.";
   }
   
   public void carlClosetDialogue(){
      System.out.printf("The closet is full of what you'd ordinarily find, clothes, shoes, and some storage%n" +
                         "boxes.%n"); 
   }
   
   public String getCarlBedDialogue(){
      return "Letters stating that the victim should listen to his roommate and help keep the family together were found under the bed"; 
   }
   
   public void carlBedDialogue(){
      System.out.printf("The bed looks made and neat. Underneath it you find a small box with letters. Some of the letters are from%n" +
            "the victim's sister saying how she thinks that the victim should listen to his roommate and that he seems very passionate%n" +
            "about helping their family stick together.%n");
   }
   
   public String getCarlNightstandDialogue(){
      return "A journal that exlpains Karen's worries about hendrickson and Carlson. She thinks Carlson is getting aggressive and%n" +
            "Hendrickson is getting pushy";
   }
   
   public void carlNightstandDialogue(){
      System.out.printf("There is a lamp sitting on top. Inside the first drawer you find a stack of notes and papers, what look like love%n" +
            "letters from the victim to his girlfriend. You also find a small card with a doctors appointment for Karen three days ago.%n" +
	         "The second drawer consisted of deeply religious texts including the \"Bible\", \"How to trust in God\", and %n" +
            "\"The Worth Of Your Family\". You also find a pamphlet with the times of \"The Church of the True Christ\", being from seven%n" +
            "am to seven pm, with various times when sermons start.  You also find a small box labeled: \"My Journal\". %n" +
            "Inside is a journal from the victim's girlfriend. As you flip through it you find most of them about her feelings for Epson and%n" +
            "how she's worried that he's stressed about his job. She mentions that his old boss, Hendrickson, has been very persistent%n" +
            "with trying to get Epson to come back and that she thinks that's why he bought a gun, though she's not completely sure.%n" +
            "She wrote that it may have been because his old roommate was getting a bit heated with him lately and she knows that he has%n" +
            "a dark past. Just last week he was yelling at Epson because Epson had made his sister cry, though Karen writes that Epson's %n" +
            "sister is a bit emotional and doesn't see what's going on.%n");
   }
      
   
   //Interrogation methods for interrogation method
   public void carlKarenInterDialogue(){
      System.out.printf("You: Where were you today?%n" +
		                  "Karen: I was at the church all day. Today is my day of worship.%n" + 
		                  "You: How long have you and Epson known each other?%n" +   
                        "Karen: Two years. We met at church%n" +
                        "You: Did Epson seem upset about anything?%n" +
		                  "Karen: He was usually upset at his father if anything. But that's not his fault!%n" +
                        "His father expected too much of him. Epson did the best he could in everything he could.%n%n" +
		                  "You: Did Epson have any enemies?%n" +
		                  "Karen: Of course he did. His father was one. His previous employer was extremely shady and seemed to really want Epson back. He kept%n" +
                        "sending him money incentives and notes. He was actually getting a little pushy about it and Epson went and bought a small gun because%n" +
                        "he was scared. His roommate, Carlson, also seemed to be getting agitated anytime Epson talked to his father. When I saw how heated %n" +
                        "the yelling become afraid for Epson's safety. That's one of the reasons we decided to buy a small home. My parents gave us a loan%n"+ 
                        "so we could pay for the down payment, though Epson hated the idea borrowing money from my parents.%n" +
                        "But Carlson's reactions scared me and I convinced Epson to leave.%n" +
		                  "You: Did you two ever fight?%n" + 
                        "Karen: No! We never fought! You have to understand, Epson was the nicest and most genuine person I've ever met! He was so earnest and kind.%n" +
                        "I learned so much from him and I consider myself a very well versed person in morals and scriptures. His fighting only seemed to be with%n" +
                        "people who pestered him about things too much.%n" +
		                  "You: Thank you for your time.%n" +
		                  "Karen: Please, %s.. Is it my fault he commited suicide? Was I not a good enough person for him?%n" +
                        "You: It wasn't suicide. I believe Epson was murdered.%n" +
		                  "Karen: Murdered?! No! Who? I don't understand why someone would do that!%n" +
		                  "You: Thank you for your time. Please wait with the officers until we talk again.%n", userName);
   }
   
   public void carlHendricksonInterDialogue(){
      System.out.printf("You: Hello Mr.Hendrickson. You're a hard man to track down. Why is that?%n" +
		                  "Hendrickson: You've got it all wrong sir. You assume that because I'm hard to track down that I have something to hide and are thus suspicious when that is simply not true.%n" +
                        "I am just a man who likes my privacy and privacy is not a crime.%n%n" +
		                  "You: Where were you today?%n" +
		                  "Hendrickson: I was doing business on the other side of town. I'm in the delivery business, but I'm very picky about my clients.%n" +
		                  "You: That's a little shady.%n" +
		                  "Hendrickson: Are we here to talk about my business? If so, I'm afraid we're at an end of discussion and you are holding me against my will.%n" +
		                  "You: Another time then. Tell me, Why have you been trying to contact Epson?" +
		                  "Hendrickson: That boy was a natural with people. My clients loved him because of how personable he was. Truly a wonderful boy. Unfortunately his girlfriend didn't like me and%n" +
                        "forced him to change jobs. You see, I happen to know about poor Epson's financial struggle and I was the only one who helped him. His girlfriend steered him into financial disaster,%n" +
                        "forcing that young boy into a job he hated and that didn't pay him well. I was only trying to help him. I even offered him a raise. You see good sir, I am not the bad guy here. I'm the good guy.%n%n" +
		                  "You: Can you explain why he bought a gun? I have good evidence that it was because he was afraid of someone.%n" +
		                  "Hendrickson: My good sir, I have no idea why he would have bought a gun. I was very professional in how I handled myself with that boy.Though His roommate was getting%n" +
                        "a little aggressive if you ask me.%n" +
		                  "You: Do you know anyone who would have wanted him killed?%n" +
		                  "Hendrickson: Killed? Are you saying he was murdered? As far as I'm aware, he didn't have any enemies.%n" +
		                  "You: Thank you for your time.%n" +
		                  "Hendrickson: If it's any consolation, I really liked Epson. He was a good lad. I really did want to see him succeed and having him killed is the last thing I'd have wanted%n");
   }
   
   public void carlCarlsonInterDialogue(){
      System.out.printf("You: How close were you with Epson?%n" +
		                  "Carlson: I would say we were almost brothers. He was like family to me. I still can't believe he's gone.%n" +
		                  "You: You were in contact with his sister, Hannah?%n" +
		                  "Carlson: I am. You could say we are actually a couple. Though distance separates us, I feel connected to her through God and through our similarities.%n" +
		                  "You: I've also heard you had confronted Epson about his family. This is true?%n" +
		                  "Carlson: It is. I do have a bit of an anger issue. But I'm working on it. Hannah has really helped me. It's just that my father had anger issues and I'm afraid that I inherited the sin.%n" +
                        "I've never touched Epson if that's what this is about. I've talked to him because the way he talks to his father isn't right. I didn't have a father who loved me and I think it's very short%n" +
                        "sighted to say those kinds of things to one who does. It also hurt Hannah and the rest of the family when they yelled at each other. I was trying to protect the whole family and keep them together.%n%n" +
		                  "You: This anger problem, have you ever lost control before?%n" +
		                  "Carlson: ... Yes sir. I was actually put in jail a few years ago because of it. But I'm better now! I haven't blacked out like that since I was eighteen. Hannah and God have really helped me see the right path.%n" +
                        "I swear I haven't touched anyone. I wouldn't do anything that would jeopardize my relationship with Hannah.%n%n" +
                        "You: Who do you think would want Epson dead?%n" + 
                        "Carlson: I'd look at his boss Hendrickson. I know Epson bought a gun because of him and he must have shot him. He must have been angry when Epson refused to come back. If I run into%n" +
                        "him I'll beat the man myself. He tore my family apart because of his greed.%n%n" + 
                        "You: Thank you for your time.%n" +
                        "Carlson: %s. Please bring his and my family peace%n", userName);
   }
   
   
   //ending dialogue for all possible values of randomNum
   public void chooseCarlson(){
      Scanner input = new Scanner(System.in);
      System.out.printf("Carlson was blank for a moment before he slammed his fists on the table.%n" +
            "\"Me? You think it's me?\" Carlson yelled. \"He was my brother!\" After another moment Carlson put his head in his hands and started weeping.%n" + 
            "\"I lost everything didn't I. I lost my best friend, I've lost my soul, and I've lost Hannah.\"%n" +
            "\"Why did you do it?\" You ask.%n" +
            "\"I didn't mean to. I was just so furious that his arguments with his father made Hannah upset. Hannah, she is so wonderful. She's everything to me.%n" +
            "I hurt when she hurt. I tried to help her out by getting the family together, to get Epson to calm down. I waited until Karen was gone so I could have a%n" +
            "heart to heart with him. He showed me the gun he bought and we just started talking. When I brought it around his father he told me that I didn't understand.%n" +
            "So I tried to talk to him about Hannah and he became angry. He thinks Hannah has been bugging him a lot and that just having faith isn't going to solve his problems.\"%n" +
            "Carlson took a deep breath and closed his eyes.%n" +
            "\"That's when I blacked out. I got so angry that he'd talk about Hannah that way. I must have grabbed the gun and shot him because all I remember is holding %n" +
            "the gun and Epson dead in front of me. I didn't want Hannah to leave me and so I staged a suicide as best as I could.\"%n" +
            "You nod to the officers outside the door and they come in and take Carlson by the arms to lead him out.%n" + 
            "Carlson stops next to you.%n" +
            "\"I don't think I can meet with the family. Can you tell them I'm sorry for me?\"%n");
      System.out.println("What do you think (y/n)");
      char answ = input.next().charAt(0);
      
      if(answ == 'y'){
		   System.out.printf("\"Thank you %s\". \"I truly am sorry.\"%n" +
		         "You watch as the officers escort Carlson out of room.%n", userName);
      }else{
		   System.out.printf("Carlson scowls and eyes you for a moment before deflating.%n" +
		        "\"I guess I deserve that don't I.\"%n" +
		        "You watch as the officers escort Carlson out of room%n");
      }
      
      }
      
      public void notCarlson() {
         System.out.printf("You receive a large letter on your desk. It's from Carlson. You remember that name and realize that it's one of the suspects%n" +
               "from the Epson Holden case a year and a half ago. You open the letter and read: %n" +
               "\"Dear %s,%n" +
               "I consider this your fault. If you had done your job properly then you would have arrested me like you were supposed to. I tried to make%n" +
               "it with the Holden family and keep that I was the one who actually killed Epson a secret. I couldn't do it. I eventually told Hannah and %n" +
               "she went into a fury. Then she told her whole family and they all came down on me and were yelling at me. I had one of my rage moments again." +
               "When I came to all of them were dead. I've decided to take my life as well, now that there isn't anything for me here anymore. I just wanted%n" +
               "let you to know before you find out by the news. Just wanted to make your job a little easier. Who knows, maybe I just saved another %n"+
               "innocent person.%n" +
               "Signed, Carlson.%n", userName);
   }
}
