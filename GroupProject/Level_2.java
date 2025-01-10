
/**
 * Write a description of class b here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Level_2 extends Level
{
    public static void levelTwo(Character c)
    {
        String strFirstName = c.getFirstName() ;
        String strPosPronoun = c.posPronoun() ; 
        String strPerPronoun = c.perPronoun() ; 
        
        String strBFF = "Lillian";
        byte bytCurrentChoice;

        //#LEVEL 2 HEADER
        System.out.println(". . . . . . . . . . . . . . . . . . LEVEL 2 . . . . . . . . . . . . . . . . . .");
        
        //#HEADER
        System.out.println("- - -\nTuesday, October 18, 2016\nContemporary Mansion, Los Angeles, California, USA\n6:09 PM\n- - -");

        //#PARAGRAPH 1
        System.out.println(strFirstName + " found themself sitting alone in a lavish living room of a grand contemporary mansion. " + strFirstName + "\nhad just gotten the chance of a lifetime: to collaborate on his debut song with none\nother than Rihanna.");
    
        //#PARAGRAPH 2
        System.out.println("\nEntered Rihanna, sparkling in an Armani Privé ensemble. \"Hey, " + strFirstName + "! Ready to make\nmagic?\" she chirped.");
        
        String[][] choices1 = {
            {"Girl, you know it!", "Uh…no! I’m still confused as to why you chose me!", "Ready as I'll ever be!"},
            {"Who ya callin’ girl? I’m not your girl...We're tighter than that!", "Now you know damn well…You’ve gotta believe in yourself. Be fearless,\nbe confident!", "ALRIGHTTTT!"},
            {"10", "5", "15"}
        };
        
        bytCurrentChoice = displayChoices(choices1[0]);
        System.out.println(choices1[1][bytCurrentChoice - 1]);
        c.setCurrency(Byte.parseByte(choices1[2][bytCurrentChoice - 1]));
        
        //#PARAGRAPH 3
        System.out.println("\n" + strFirstName + " started into brainstorming lyrics, writing each line idea on a notepad.\n\nLine 1: \"No more fights, stop the drama,\"");
        
        String[][] line2 = {
            {"Setting things right, no more trauma,", "Buss down Tatiana.", "Let’s take a trip to Botswana."},
            {"15", "10", "5"}
        };
        
        System.out.println("\nLine 2:");
        bytCurrentChoice = displayChoices(line2[0]);
        c.setCurrency((short)Short.parseShort(line2[1][bytCurrentChoice - 1]));
        
        String[][] line3 = {
            {"Found a home in my soul.", "Never full, always gonna pull.", "No pain, no gain, just please, explain."},
            {"15", "5", "10"}
        };
        
        System.out.println("\nLine 3:");
        bytCurrentChoice = displayChoices(line3[0]);
        c.setCurrency(Byte.parseByte(line3[1][bytCurrentChoice - 1]));
        
        String[][] line4 = {
            {"Hello, please never let go,", "From darkness to light, my journey tonight.", "Never enough, chasing that good stuff."},
            {"5", "15", "10"}
        };
        
        System.out.println("\nLine 4:");
        bytCurrentChoice = displayChoices(line4[0]);
        c.setCurrency((short) Short.parseShort(line4[1][bytCurrentChoice - 1]));
        
        System.out.print("\nRihanna glanced at the notepad. ");
        
        //#SPECIFIC ENDINGS
        if (c.getCurrency() <= 60) {
            System.out.print("\"Well...I can definitely tell that this is your first song!” she exclaimed.\"");
        } else {
            System.out.print("\"Wow! If you weren’t my opening act right now, I’d ask you to write a song for me\" she exclaimed.");
        }
        
        System.out.println("\n" + strFirstName + " replied, “I call this song ‘Silver Lining’.");
        
        
        //# Setting the level to the next level to track the users progress
        c.setLevelTracker((byte)(c.getLevelTracker() + 1)) ; 
        
        returnMenu(c);
    }
}