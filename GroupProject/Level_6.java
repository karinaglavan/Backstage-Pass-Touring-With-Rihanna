/**
 * Write a description of class Level_6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Level_6 extends Level
{
    public static void levelSix(Character c){
        String strFirstName = c.getFirstName() ;
        String strPosPronoun = c.posPronoun() ; 
        String strPerPronoun = c.perPronoun() ; 

        String strBFF = "Lillian";
        byte bytCurrentChoice;

        // Level 6 header
        System.out.println(". . . . . . . . . . . . . . . . . . LEVEL 6 . . . . . . . . . . . . . . . . . .");

        // Location header
        System.out.println("- - -\nSunday, February 12, 2023\nState Farm Stadium, Glendale, Arizona, USA\n7:45 PM\n- - -");

        // Paragraph 1
        System.out.println("It's been years since " + strFirstName + " and Rihanna first met. Ever since then,\nthey've been working and performing together.");

        //The FINALE!
        String[][] theEnd = {
            {"Take over the world via soundwave brainwashing", "Take over Melon Eusk's organization, and then the world", "Relinquish in your status and become a kind celebrity", "Become \"too awesome\" and win a Nobel Peace Prize"},
            {"Become a part-time golf club employee", "Lose all of your money", "Tsunami wreaks havoc upon you", "Nah, we escape back in time!"}
        };
        if(c.getCurrency() >= 175){
            System.out.println("The day of the Superbowl and the time of their show is upon them.\nEverything starts off without a hitch, and it all goes perfectly.");
            System.out.println("You now have a choice. You have gained enough power through the RiRiRupees. How will your character use this newfound strength?");
            bytCurrentChoice = displayChoices(theEnd[0]);
            if(bytCurrentChoice == 1){
                System.out.println("\nYou proceed to manipulate the soundwaves released by Rihanna's songs to brainwash\nall people on the planet. The world is now your stage, and all are your audience.");
            }
            else if(bytCurrentChoice == 2){
                System.out.println("\nOnce the show is over, with the power from the RiRiRupees, the most powerful currency, you take over\nMelon Eusk's empire and all of his organizations, and take over the world from there.");
            }
            else if(bytCurrentChoice == 3){
                System.out.println("\nYou decide to hide your power, and only use it for good, becoming a kind celebrity who lives the dream.");
            }
            else{
                System.out.println("\nYou become so awesome and loved that you bring peace to all around you and win a Nobel Peace Prize.");
            }
        }
        else{
            System.out.println("The day of the Superbowl and the time of their show is upon them.\nYour performance was so bad that five minutes in, you were kicked out. What little reputation you had was soiled.");
            System.out.println("You now have a choice. You did not gain enough RiRiRupees, and thus, you must choose your character's cruel fate.");
            bytCurrentChoice = displayChoices(theEnd[1]);
            if(bytCurrentChoice == 1){
                System.out.println("\nYou decide to leave the world of stardom and abandon all social media\nnow that your career is gone. You become a part time golf employee.");
            }
            else if(bytCurrentChoice == 2){
                System.out.println("\nYou lose all of your money and don't do a thing about it. You are now in poverty.");
            }
            else if(bytCurrentChoice == 3){
                System.out.println("\nA Tsunami, somehow, begins to overtake the Superbowl.\nEveryone escapes safely, but the glory of sports has been tarnished this year.");
            }
            else{
                System.out.println("\nYou escape back in time through a time capsule, but it is now December 2014 and you are stuck in a loop forever at a retail job. \"All I Want for Christmas is You\" begins to play...");
            }
        }
        
        // End of game :]
        System.out.println("\nThis is you and your character's end. Thank you for playing Backstage Pass: Touring with Rihanna!\nWe hope to see you again, picking some different options next time around!");
        
        c.setLevelTracker((byte)(c.getLevelTracker() + 1));
        mainMenu(c);
    }
}