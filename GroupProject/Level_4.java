
/**
 * This level class also extends the superclass of Level. Inheriting common methods that will be
 * Used within this class. Like when choosing an option when a choice is given. Within level 4
 * The M/C discovers that they have a stalker. During the entire altercation the M/C meets the 
 * Love of their life.
 * @author (Karina Glavan)
 * @version (2023/12/03)
 */
public class Level_4 extends Level
{
   
    public static void level4(Character c)
    {
       String strFirstName = c.getFirstName() ;
       String strPosPronoun = c.posPronoun() ; 
       String strPerPronoun = c.perPronoun() ; 
        
       String strBFF = "Lillian";
       byte bytCurrentChoice;
        
       //# Level 4 Header Telling the user that level 4 will now commence 
       System.out.println(". . . . . . . . . . . . . . . . . . LEVEL 4 . . . . . . . . . . . . . . . . . .");
    
       //# Location header telling the user where we are currenlty 
       System.out.println("- - - \nTuesday, November 09, 2016,Hollywood Hills, Los Angeles, California, USA") ; 
       
       //# Paragraph 1
       System.out.println(strFirstName + " was walking down the street after getting a Strawberry Acai Lemonade Drink for Starbucks. While walking " + strPerPronoun + " was not looking and bumped into someone" ) ; 
       System.out.println("\nFor a Romantic Love interest do you prefer male or female?") ; 
       
       String[] choices1 = {"Male", "Female" } ; 
       bytCurrentChoice = displayChoices(choices1);   
       
       if(bytCurrentChoice == 1)
       {
           System.out.println("\nNow choose a love interest") ; 
           String[][] choices2 = {
               {"Melon Eusk", "Justin Beaver", "Noah Centipede", "The Paper Sheet Johnson"},
               {"-10", "10", "0", "20"}
           } ; 
           
           bytCurrentChoice = displayChoices(choices2[0]);
           c.setCurrency((short) Short.parseShort(choices2[1][bytCurrentChoice - 1]));
        
       }
       else
       {
            System.out.println("\nNow choose a love interest") ; 
            String[][] choices2 = {
                {"Africana Grande the Last Racebender", "Amy ShoeMaker", "Gumby", "Wendy Whale-yums"},
                {"20", "-10", "10", "0"}
            } ; 
            
            bytCurrentChoice = displayChoices(choices2[0]) ; 
            c.setCurrency((short) Short.parseShort(choices2[1][bytCurrentChoice - 1])) ; 
        
       }
              
       //# Paragraph 2 
       System.out.println("\nAfter bumbing into the love of their life and exchanging phone numbers and already deciding to move in togeather (Because thats how that works") ; 
       System.out.println(strFirstName + " begins getting a weird feeling that someone is following them.") ; 
       System.out.println("Ever since the music video there has been a sensation of someone lurking in the shadows.") ; 
       System.out.println("While walking home " + strPerPronoun + " heard footsteps behind them. Scared out of their mind " + strPerPronoun + " began running.") ; 
       System.out.println("While running " + strFirstName + " fell and started rolling down a hill for 5 minutes with their stalker hot on their heels.") ; 
       System.out.println("They finally stopped rolling and they were face to face with their stalker.") ; 
       
       System.out.println("\nWHAT DO YOU DO??!!") ; 
       
       String[][] choices3 = {
           {"Scream","Kiss your stalker", "Say 'What the Flip its Jeff Bezos!'", "Do nothing"},
           {"10", "-20","5", "-5"}
       } ; 
       
       bytCurrentChoice = displayChoices(choices3[0]) ; 
       c.setCurrency((short) Short.parseShort(choices3[1][bytCurrentChoice - 1])) ; 
       
       if(bytCurrentChoice == 1)
       {
            System.out.println("Plausible choice, good job. \nSince " + strFirstName + " screamed somone heard them and saved them from their stalker. Afterwards there stalker ceased to exist") ; 
       }
       else if (bytCurrentChoice == 2)
       {
            System.out.println(strFirstName + " WHAT ARE YOU DOING!! Get help. \nAfter they kissed their stalker, the stalker ran away since you reciprocated feelings. But " + strFirstName +" felt bad since the stalker ran away screaming") ; 
       }
       else if(bytCurrentChoice == 3)
       {
            System.out.println("Thanks for stating the obvious Sherlock!! \n" + strFirstName + " was accidentally live streaming and recorded the whole interaction. The police came and arrested him.") ; 
       }
       else 
       {
            System.out.println("Due to plot armour " + strFirstName + " was fine since the stalker once they started talking just dissapered \n****POOF*****SMOKE***** ") ; 
       }
       
       
       //# Setting the level to the next level to track the users progress
       c.setLevelTracker((byte)(c.getLevelTracker() + 1)) ; 
        
       returnMenu(c);
    }
    
}
