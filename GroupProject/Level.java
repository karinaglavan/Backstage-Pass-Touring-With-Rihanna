/**
 * Description: The Level class contains the main logic of all of the levels, minigames, and menus. 
 * This logic includes showing all the options for the multiple choice and validates the input of the user.
 * Author: Irene Runsewe
 * Date started: December 1, 2023
 * Date complete: 
 */

//# Import the Scanner class from the java.util library
import java.util.Scanner;
public class Level
{
    /**
     * Description of Method: The main menu method is the first set of options the user sees once they run
     * the program. The user can either choose to play the main storyline, or go to the minigames sub-menu.
     * Author(s): Irene Runsewe
     * Date: December 2, 2023
     */
    public static void mainMenu(Character c)
    {
        //#--VARIABLES
        byte bytCurrentChoice; //#Holds the number that the user inputs after it has been validated
        String[] mainOptions = {"PLAY", "MINIGAMES", "EXIT"}; //#Options the user has in the main menu

        //#--MENU HEADER
        //#ASCII version of the title of the game, "Backstage Pass: Touring With Rihanna"
        System.out.println(" ____    _    ____ _  ______ _____  _    ____ _____   ____   _    ____ ____    \n | __ )  / \\  / ___| |/ / ___|_   _|/ \\  / ___| ____| |  _ \\ / \\  / ___/ ___|_ \n |  _ \\ / _ \\| |   | ' /\\___ \\ | | / _ \\| |  _|  _|   | |_) / _ \\ \\___ \\___ (_)\n | |_) / ___ \\ |___| . \\ ___) || |/ ___ \\ |_| | |___  |  __/ ___ \\ ___) |__) | \n |____/_/   \\_\\____|_|\\_\\____/ |_/_/   \\_\\____|_____| |_| /_/   \\_\\____/____(_)\n  _____ ___  _   _ ____  ___ _   _  ____  __        _____ _____ _   _          \n |_   _/ _ \\| | | |  _ \\|_ _| \\ | |/ ___| \\ \\      / /_ _|_   _| | | |         \n   | || | | | | | | |_) || ||  \\| | |  _   \\ \\ /\\ / / | |  | | | |_| |  _____  \n   | || |_| | |_| |  _ < | || |\\  | |_| |   \\ V  V /  | |  | | |  _  | |_____| \n   |_| \\___/ \\___/|_| \\_\\___|_| \\_|\\____|    \\_/\\_/  |___| |_| |_| |_|         \n  ____  ___ _   _    _    _   _ _   _    _                                     \n |  _ \\|_ _| | | |  / \\  | \\ | | \\ | |  / \\                                    \n | |_) || || |_| | / _ \\ |  \\| |  \\| | / _ \\    _____ _____ _____ _____ _____  \n |  _ < | ||  _  |/ ___ \\| |\\  | |\\  |/ ___ \\  |_____|_____|_____|_____|_____| \n |_| \\_\\___|_| |_/_/   \\_\\_| \\_|_| \\_/_/   \\_\\                                 \n");

        //#--CHOICES
        //#Calls the displayChoices method to validate the user's input, and returns a byte between 1 and 2
        bytCurrentChoice = displayChoices(mainOptions);

        //#What happens next depending on what number the user inputs
        if (bytCurrentChoice == 1)
        {
            //# Using a switch statemnet to chek which level the user is at
            byte bytLevel = c.getLevelTracker() ; 
            
            switch(bytLevel)
            {
                case 1:
                    Level_1.levelOne(c) ; 
                    break ; 
                
                case 2:
                    Level_2.levelTwo(c) ; 
                    break ; 
                    
                case 3: 
                    Level_3.level3(c) ; 
                    break ; 
                
                case 4: 
                    Level_4.level4(c) ;  
                    break ; 
                    
                case 5: 
                    Level_5.levelFive(c) ;
                    break ;
                    
                case 6:
                    Level_6.levelSix(c) ;
                    break ;
                    
                default:
                    mainMenu(c) ; 
                    break ; 
            }
            
        } else if (bytCurrentChoice == 2) {
            minigamesMenu(c); //#If the user chooses to play minigames, go to the minigames menu 
        } else if (bytCurrentChoice == 3) {
            System.out.println("Have a good day!");
            return;
        }
    }

    /**
     * Description of Method: The minigames menu method shows the different options of minigames that the 
     * user can play. The user can either choose to play song trivia, what album are you, or finish the lyrics.
     * Author(s): Irene Runsewe
     * Date: December 2, 2023
     */
    public static void minigamesMenu(Character c )
    {
        //#--VARIABLES
        String[] minigamesList = {"Song Trivia", "Finish the Lyrics", "Exit"}; //#Options the user will be given in the minigames menu
        byte bytCurrentChoice = displayChoices(minigamesList); //#Calls the displayChoices method to validate the user's input, and returns a byte between 1 and 3

        //#--CHOICES
        //#What happens next depending on what number the user inputs
        if (bytCurrentChoice == 1)
        {
            Minigames.songTrivia(c); //#If the user chooses to play "Song Trivia", show the song trivia game
        } else if (bytCurrentChoice == 2) {
            Minigames.guessTheLyrics(c) ; 
        } else if (bytCurrentChoice == 3) {
            mainMenu(c) ; 
        }
    } 

    /**
     * Description of Method: The return to menu method gives the user the option to go to the next level or
     * return to the main menu. This method is necessary because after the final choice of a level, there needs
     * to be a way for the program to know that the user is done the level.
     * Author(s): Irene Runsewe
     * Date: December 2, 2023
     */
    public static void returnMenu(Character c)
    {
        //#--VARIABLES
        byte bytCurrentChoice; //#Holds the number that the user inputs after it has been validated
        WriteFile writeFile = new WriteFile() ; 
        String[] confirmation = {"Return to main menu", "Continue"}; //#Options to return to main menu or continue to the next level
        
        //#Shows how much RiRiRupees the user has earned at the end of the level
        System.out.println("\nRiRiRupees: " + c.getCurrency());

        //#Calls the displayChoices method to validate the user's input, and returns a byte between 1 and 2
        bytCurrentChoice = displayChoices(confirmation);

        writeFile.FileWriter(c) ; 
        
        //#--CHOICES
        //#What happens next depending on what number the user inputs
        if (bytCurrentChoice == 1)
        {
            //# Saving the info for when the user quit
            
            mainMenu(c); //#If the user chooses 1, go back to the main menu
        } else if(bytCurrentChoice == 2) {
            
            //# Using a switch statemnet to chek which level the user is at
            byte bytLevel = c.getLevelTracker() ; 
            switch(bytLevel)
            {
                case 2:
                    Level_2.levelTwo(c) ; 
                    break ; 
                    
                case 3: 
                    Level_3.level3(c) ; 
                    break ; 
                
                case 4: 
                    Level_4.level4(c) ;  
                    break ; 
                    
                case 5: 
                    Level_5.levelFive(c) ; 
                    break ;
                    
                case 6:
                    Level_6.levelSix(c) ; 
                    break ; 
                    
                default : 
                    mainMenu(c) ;  
                    break ; 
            }
            
        }
    }

    /**
     * Description of Method: The display choices method takes in a 1D array and shows all the possible choices
     * the user can choose, depending on the number of choices available. 
     * Author(s): Irene Runsewe
     * Date: December 1, 2023
     */
    public static byte displayChoices(String[] choices)
    {
        //#--VARIABLES
        byte bytUserChoice;

        //#Loop through and print all of the choices in order
        for (byte bytCurrentChoice = 0; bytCurrentChoice < choices.length; bytCurrentChoice++)
        {
            System.out.println(": ̗̀➛ " + (bytCurrentChoice + 1) + ": " + choices[bytCurrentChoice]); 
        }

        //#Consistently check to see if the input is valid
        while (true)
        {
            try
            {
                System.out.print("\nYour choice: "); //#Have a text message that the user can put their answer beside
                bytUserChoice = new Scanner(System.in).nextByte(); //#Get input of type byte

                if (bytUserChoice > choices.length || bytUserChoice < 1) {
                    //#If the number is still a byte but just not in the range of the choices given, show an error message
                    System.out.println("You must enter an integer between 1 and " + choices.length + "!");
                } else {
                    //#Stop checking to see if the answer is valid, because now it is.
                    break;
                }
            } catch (Exception e) { 
                //#If any exception is thrown. For example, if a string or decimal is entered, an exception will occur because these are not bytes.
                System.out.println("Please enter a small integer!");
            }
        }

        //#Return the number that the user chose if it's a valid choice option
        return bytUserChoice;
    }
}