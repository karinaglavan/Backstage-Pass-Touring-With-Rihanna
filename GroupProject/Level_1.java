
/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Level_1 extends Level
{   
    public static void levelOne(Character c)
    {
        String strFirstName = c.getFirstName() ;
        String strPosPronoun = c.posPronoun() ; 
        String strPerPronoun = c.perPronoun() ; 
        
        String strBFF = "Lillian";
        byte bytCurrentChoice;

        //#LEVEL 1 HEADER
        System.out.println(". . . . . . . . . . . . . . . . . . LEVEL 1 . . . . . . . . . . . . . . . . . .");
        
        //#LOCATION HEADER
        System.out.println("- - -\nSunday, October 9, 2016\nLittlewood Orphanage, Paris, Texas, USA\n11:34 AM\n- - -");

        //#PARAGRAPH 1
        System.out.println("Resting on the outskirts of a small Texas town stood Littlewood Orphanage. " + strFirstName + " had grown\nup within these walls, creating close friendships over the years, especially with " + strPosPronoun + "\nbest friend and roomate, " + strBFF +".\n");

        //#PARAGRAPH 2
        System.out.println("One evening, " + strBFF + " rushed into their room with her eyes glistened with excitement. \"" + strFirstName + ", I\nfound it!\" " + strBFF +" exclaimed, waving a crumpled flyer. \"LOOK! The Fenty Robyn Singing Contest!\nYou must enter, your voice is golden!\"");

        //#POSSIBLE CHOICES FOR CHOICE POINT #1
        /**String[][] choices1 = {
        {"", "", "10"},
        {"", "", "5"},
        {"", "", "20"},
        {"", "", "15"},
        };*/

        //#TWO TYPES OF CHOICES RESULTS...ONE METHOD THAT PUTS OUT RESULTS AND ONE THAT DOESN'T
        String[][] choices1 = {
            {"Absolutely not! I can’t stand Rihanna, and I can’t sing! You’re delusional.", "Hmm...I don’t know. My voice isn’t that great.", "I’ll give it a go! I mean, what do I have to lose, my parents?", "Rihanna you say? Anything for Rihanna!"},
            {strBFF +"'s eyes softened. \"You're amazing, " + strFirstName + ". You've got an amazing voice. I'll always be here, cheering you on, no matter what.\"", strBFF + "'s eyes surveyed [M/C]. \"Come on, "+ strFirstName + ", take a chance! What do you have to lose? Your parents?\"", "\"I knew you'd agree!” exclaimed " + strBFF + ". Let's head out first thing Tuesday morning!\"", "\"Yeahhh! Rihanna is love, Rihanna is life!\""},
            {"10", "5", "20", "15"}
        };
            
        bytCurrentChoice = displayChoices(choices1[0]);
        System.out.println(choices1[1][bytCurrentChoice - 1]);
        c.setCurrency((short)Short.parseShort(choices1[2][bytCurrentChoice - 1]));
        
        //#PARAGRAPH 3
        System.out.println("\nEncouraged by " + strBFF +"'s support, " + strFirstName + " decided to take a leap of faith.");

        //#HEADER 2
        System.out.println("\n- - -\nSaturday, October 15, 2016\nBeacon Crest Hall, Houston, Texas, USA\n1:56 PM\n- - -");

        //#PARAGRAPH 4
        System.out.println(strFirstName + "’s hands trembled with anticipation. " + (strPerPronoun.substring(0, 1).toUpperCase() + strPerPronoun.substring(1, strPerPronoun.length()) + " walked up on stage, and sang..."));

        //#POSSIBLE CHOICES FOR CHOICE POINT #2
        String[][] choices2 = {
            {"Rachel Platten - Fight Song", "Mariah Carey - Fantasy", "Bruno Mars - When I was Your Man", "Rihanna - Where Have You Been"},
            {"5", "15", "10", "20"}
        };
            
        bytCurrentChoice = displayChoices(choices2[0]);
        c.setCurrency((short) Short.parseShort(choices2[1][bytCurrentChoice - 1]));

        //#PARAGRAPH 5
        System.out.println("\nThe spotlight bathed " + strFirstName + " as " + strPerPronoun + " sang " + strPosPronoun + " heart out. Rihanna, caught off guard,\nexchanged approving glances with the other judges while " + strBFF + ", cheered from the crowd.");

        
        //#SPECIFIC ENDINGS
        if (c.getCurrency() >= 20) {
            System.out.println("\n\"" + strFirstName + "!\" Rihanna said with a glistening smile, \"your voice is indeed\ngolden, and I want to help you share it with the world.\"");
        } else {
            System.out.println("\nRihanna stood up from the judges table and said, \"It was so bad, I want to\ngive you a zero, but that's not possible, so I give you a one…\nBut you give me an idea...I could turn a dog into a pop star!\"");
        }

        //#FINAL ENDING
        System.out.println("\nRihanna whispered to the tour manager, Linda. Then, Linda announced \"Congratulations!\nYou will be the opening act of the ANTI world tour!\" And just like that,\n" + strFirstName + "'s life changed, and " + strPerPronoun + " were offered a recording contract.");
    
        //# Setting the level to the next level to track the users progress
        c.setLevelTracker((byte)(c.getLevelTracker() + 1)) ; 
        
        //#RETURN TO THE MENU
        returnMenu(c);
    }
}