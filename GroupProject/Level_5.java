
/**
 * Write a description of class Level_5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Level_5 extends Level
{
    public static void levelFive(Character c){
        String strFirstName = c.getFirstName();
        String strPosPronoun = c.posPronoun(); 
        String strPerPronoun = c.perPronoun();
        byte bytJudgement = 0;

        String strBFF = "Lillian";
        byte bytCurrentChoice;

        // Level 5 Header
        System.out.println(". . . . . . . . . . . . . . . . . . LEVEL 5 . . . . . . . . . . . . . . . . . .");

        // Location Header
        System.out.println("- - -\nTuesday, November 29, 2016\nLiberty Square Court Hall, Houston, Texas, USA\n9:25 AM\n- - -");

        // Paragraph 1
        System.out.println(strFirstName + "felt a bit panicked. Two weeks ago, Buff Jakezos sent " + strFirstName + " a cease and desist letter, and now they're going to court.\nIt is the day of the court proceedings, " + strFirstName + "sitting in the plaintiff's chair. They would be defending themself.");
        System.out.println("The beginning of the proceedings go by, and it was now time for Buff Jakezos to provide his statements.");
        System.out.println("\"" + strFirstName + " is responsible for stealing my lyrics under copyright law, and on a completely unrelated note, the culprit of my boating accident on October 18th!\" He yelled.\n\"Please refrain from yelling in the court, Mr. Jakezos...\" The Judge responded. \"Anyways, Mx " + strFirstName + ", what say you to these accusations?");
        
        // First choice
        String[][] choices1 = {
                {"The boating accident... absolute bogus!", "That date... I couldn't have been there!", "Well, about the lyrics... Jakezos doesn't even make music!"},
                {("\"What about it is 'bogus', Mx " + strFirstName + "? It is a definite fact that I was involved in the accident.\" Jakezos scoffs."), "\"Hmmm... it does indeed say here that several people, including Rihanna, claim you were with them on the day of the accident...\" The judge stated. \"Well done.\"", "\"Yes I do!\" Jakezos says, offended. \"I make the GREATEST hits!\""},
                {"5", "15", "10"}
            };
        bytCurrentChoice = displayChoices(choices1[0]);
        System.out.println(choices1[1][bytCurrentChoice - 1]);
        c.setCurrency(Byte.parseByte(choices1[2][bytCurrentChoice - 1]));
        bytJudgement += (Byte.parseByte(choices1[2][bytCurrentChoice - 1]));

        // Paragraph 2
        System.out.println("\"Well... what more of the copyright??\" Buff Jakezos says, pointing at you.");
        
        // Second choice
        String[][] choices2 = {
                {"You may make music... but you don't have those lyrics in a song of yours!", "You may make music... but you stole MY lyrics!", "You may make music... but you don't OWN the lyrics!"},
                {"\"Yes I do...\" Jakezos sighs. \"Just what are you trying to pull?\"", "\"Wh-What?? No way... I'd never!!\" Jakezos says nervously.", "\"Under copyright law, he does. He owns the song, and if his accusations hold true,\nyou have stolen all of the lyrics from that song.\" The judge states."},
                {"10", "15", "5"}
            };
        bytCurrentChoice = displayChoices(choices2[0]);
        System.out.println(choices2[1][bytCurrentChoice - 1]);
        c.setCurrency(Byte.parseByte(choices2[2][bytCurrentChoice - 1]));
        bytJudgement += (Byte.parseByte(choices2[2][bytCurrentChoice - 1]));

        // Paragraph 3
        System.out.println("After a back and forth that lasted hours, the proceedings finally come to an end.\n\"I, Chief Justice of this court, find the plaintiff... ");
        if(bytJudgement == 30){
            System.out.print("not responsible for damages. Additionally, Mr. Jakezos will need to pay Mx. " + strFirstName + " to compensate for this trial.\"");
            c.setCurrency((short)20);
            bytJudgement += 20;
        }
        else{
            System.out.print("not responsible for damages. We have gained information regarding Mx. " + strFirstName + "'s whereabouts, and also, information on the song in question.\nJakezos, in fact, stole lyrics from Mx. " + strFirstName + " and will be paying for the copyright.\"");
            c.setCurrency((short)10);
            bytJudgement += 10;
        }
        System.out.println("Some time passes, and " + strFirstName + " meets up with Rihanna.");
        
        // Specific Endings
        if (bytJudgement <= 30) {
            System.out.print("\"I saw it all unfold... how did you even win that case?\" she sounded surprised.");
        } else {
            System.out.print("\"Woah... you did real good back there! Saw the case unfold myself. Seems like makin song lyrics and singin isn't the only thing\nyou're adept at!\" she exclaimed.");
        }
        
        System.out.println("\n" + strFirstName + " replied, \"Now that it's over, let's celebrate, Rihanna!\"");
        
        //Increase level
        c.setLevelTracker((byte)(c.getLevelTracker() + 1));
        returnMenu(c);
    }
}
