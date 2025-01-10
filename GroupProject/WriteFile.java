
/**
 * This is a fileWritter Class that will write the entire character object to the file 
 * Saving both the users username and password, plus everything there character has
 * Which included character description, how much money they have etc. 
 * @author (Karina Glavan)
 * @version (2023/12/04)
 */
//# Importing the entire java input output library
import java.io.* ; 
public class WriteFile
{       
       //# Bringing in a character parameter to be able to call the fileName 
       //# That of the character. So multiple users can play the game
       public void FileWriter(Character c)
       {   
           //# Declaring a String fileName to set the fileName to the Character name
           String fileName ; 
           
           //# Try part of the file writter aspect 
           try
           {
                //# Creating a character instance to save to the file
                Character character ; 
                
                //# Declaring a variable of type prinwriter and calling it out
                PrintWriter out ; 
                
                //# Setting the character object to the charcter object created within
                //# The game
                character = c ; 
                
                //# Setting the file name to the characters first name .txt
                fileName = c.getUserName() + ".txt"; 
                
                //# Building the printwriter and connecting it to a filewriter
                out = new PrintWriter(new FileWriter(fileName)) ; 
            
                //# Writing to the file using the toString method in the bankaccount object
                out.println("\n" + character) ; 
                
                //# Closing the printwriter and filewriter
                out.close() ; 
           }
        
           //# Creating a catch for if the program cannot access the file or there is no
           //# Name of that file
           catch(FileNotFoundException e)
           {
                System.out.println("Error: Cannot open file for reading") ; 
           }
           
           //# Catch for if the file cannot be read, and or no read and write privlages
           catch(IOException e)
           {
                System.out.println("Error: Cannot read from file") ; 
           }
            
       }
    
}