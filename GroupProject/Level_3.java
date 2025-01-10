
/**
 * This level class will extend the superclass of Level. This specifc class represnts level 3
 * Within the storyline game of this program. Within this level the user will be able to choose 
 * The set of their music video, their cinematograher, and a cameo artist. Within this level
 * The main character and Rihanna become good friends. This level just extends the storyline
 * @author (Karina Glavan)
 * @version (2023/12/03)
 */
public class Level_3 extends Level
{
    //# The main method of this class that will run all the code within level 3
    public static void level3(Character c)
    {
       String strFirstName = c.getFirstName() ;
       String strPosPronoun = c.posPronoun() ; 
       String strPerPronoun = c.perPronoun() ; 
        
       byte bytCurrentChoice;
        
       //# Level 3 Header Telling the user that level 3 will now commence 
       System.out.println(". . . . . . . . . . . . . . . . . . LEVEL 3 . . . . . . . . . . . . . . . . . .");
    
       //# Location header telling the user where we are currenlty 
       System.out.println("- - - \nSunday, October 30, 2016, ROC NATION Records, Los Angeles, California, USA, \n11:10 AM\n- - -") ; 
       
       //# Paragraph 1
       System.out.println("\nRihanna and " + strFirstName + " walked into the record studio together talking, laughing and looking absolutely fabulous. Then Rihanna said to " 
       + strFirstName + "\n'Ohh!! This is so exciting! Your first music video!' " + strFirstName + " was too nervous to say anything, " + strPerPronoun 
       + " kept looking on the ground smiling and slightly freaked out") ; 
       
       System.out.println("Rihanna countinued on saying 'Have you decided whos gonna film your music video?'") ; 
       
       System.out.println("\n") ; 
       System.out.println(strFirstName + " said 'Ummm maybe'") ;
       
       String[][] choices1 = {
           {"Joe Biden", "Anthony Mandler", "Quentin Tarantino", "Darth Vader"},
           {"-5", "20", "10", "5"}
       } ; 
       
       bytCurrentChoice = displayChoices(choices1[0]);
       c.setCurrency((short) Short.parseShort(choices1[1][bytCurrentChoice - 1]));
       
       //# Paragraph 2 
       System.out.println("\n") ; 
       System.out.println("After that decison was made Rihanna continued asking - 'Now that director is decided who's gonna be your featured artist?'") ;  
    
       String[][] choices2 = {
           {"Rihanna", "Chris Brown", "Taylor Swift", "Kanye West"},
           {"30", "-30", "10", "0"}
       } ; 
       
       bytCurrentChoice = displayChoices(choices2[0]);
       c.setCurrency((short) Short.parseShort(choices2[1][bytCurrentChoice - 1]));
       
       //# Paragraph 3
       System.out.println("\n") ; 
       System.out.println(strFirstName + " is on break from working on the music video, trying to catch their breath from all the work") ; 
       System.out.println(strPerPronoun + " got to thinking that everything is moving so fast they might need to move into an actual house") ; 
       System.out.println("- - - 30 minutes later - - -")  ; 
       System.out.println(strFirstName + " narrowed down too 4 differnt houses in Cali, with the current income and her now social status \n these locations make sense\n") ; 
       
       String[][] choices3 = {
           {"Hollywood Hills", "Vista Valley Estates", "Willow Creek Residences", "Rosewood Flats"},
           {"10","15","5","10"}
       };
       
       bytCurrentChoice = displayChoices(choices3[0]);
       c.setCurrency((short) Short.parseShort(choices3[1][bytCurrentChoice - 1]));
       
       //# Specifc Endings 
       if(c.getCurrency() >= 90)
       {
        System.out.println("\nEverything seems to be going pretty well for " + strFirstName + ". New music video, new house, new friends life seems great") ;
       }
       else
       {
        System.out.println("\nThings are going ok so far, just keep going and working hard said Rihanna to "+ strFirstName) ;  
       }
       
       //# Setting the level to the next level to track the users progress
       c.setLevelTracker((byte)(c.getLevelTracker() + 1)) ; 
        
       returnMenu(c);
    }
    
}
