
/**
 * This is the main class where the user logs in or signs up. And where the character object
 * Instance in created, from there the rest of the code happens outside of this main class
 * The program essetially runs here and then splits off into the other classes
 * @author (Teagan Leflar )
 * @version (2023/12/04)
 */
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //# Declaring a bytChoice variable that will be used to check if the user wants to 
        //# Log in or sign in
        byte bytCurrentChoice;
        
        //# Declaring file read and file writer classes / objects
        WriteFile writeFile = new WriteFile(); 
        ReadFile readFile = new ReadFile() ; 
        
        //# Using an array that store only yes or no for the users decsions of if they 
        //# Already have an account with us 
        String[] saveOrNah = {"YES","NO"};
        
        //# Create new character or login with old one
        System.out.print("Do you have a previous save file you would like to log into?\n");
       
        //# Setting the byte variable by calling a method within the level class for 
        //# Choosing an option
        bytCurrentChoice = Level.displayChoices(saveOrNah);
        
        //# Coding a decision structure for if the user wants to sign in or create a new
        //# Account
        if(bytCurrentChoice == 1)
        {
            //# Checking to see if when reading the file it returned null or a character
            //# If null program ends, if returns a character countinues program
            Character mainCharacter = readFile.FileReader() ; 
            if(mainCharacter !=null)
            {
              Level.mainMenu(mainCharacter);
            }
            else
            {
                System.out.println("Please restart program and try again") ; 
            }
        }
        
        else
        {
            //# Character creation stuff; First name, pronouns, hair colour,
            //# then a username and password to log in with
            String strNewFirstName;
            String strNewPronouns;
            String strNewHairColour;
            String strNewUsername;
            String strNewPassword;
            
            System.out.print("Well then... welcome to Backstage Pass: Touring with Rihanna!\nPlease follow these steps for creating your very own character.\n");
            
            System.out.println("\nWhat will your character's name be?\n");
            strNewFirstName = new Scanner(System.in).nextLine();
            
            System.out.println("\nWonderful, what a pleasure it is to meet " + strNewFirstName + "! What pronouns will this character go by? Please make sure to type it in the following format: ___/___\n");
            strNewPronouns = new Scanner(System.in).nextLine();
            
            System.out.println("\nOne more feature to go! What will the colour of your character's hair be?\n");
            strNewHairColour = new Scanner(System.in).nextLine();
            
            System.out.println("\nTruly astounding! Before you go off and play, though, you must create a username and password so you can\nlog in again at any time.\n");
            System.out.println("Enter a username: \n");
            strNewUsername = new Scanner(System.in).nextLine();
            
            System.out.println("\nNow please enter a password: \n");
            strNewPassword = new Scanner(System.in).nextLine();
            
            System.out.println("\nGreat! Thank you, now please enjoy...\n\n");
            
            Character mainCharacter = new Character(strNewUsername, strNewPassword, strNewFirstName, strNewHairColour, strNewPronouns);
            
            //# Writing the character info to the file
            writeFile.FileWriter(mainCharacter) ; 
            
            //# Actually starting the game from within the level class
            Level.mainMenu(mainCharacter);
        }
    }
}