
/**
 * This class will read from the craeted file so that the saved instance variables of the 
 * Object can be used. For example if the user decides to quit the game and come back
 * Later, all their character information is saved to a file, it just needs to be read back.
 * @author (Karina Glavan)
 * @version (2023/12/04)
 */
//# Importing the entire java input output library
import java.io.* ; 

//# Importing the util class for the scanner 
import java.util.* ; 
public class ReadFile
{
    public Character FileReader()
    {
        //# Creating a variable of type String called fileName to be able to search for
        //# The file name
        String fileName ; 
        
        try
        {
            //# Declaring a variable of type character 
            Character character ; 
            
            //# Asking the user for their username and password to be able to check
            //# If the file exists and if the username and or password is correct
            System.out.println("Please enter in your username") ; 
            String un = new Scanner(System.in).nextLine() ; 
            
            System.out.println("Please enter in your password") ;
            String p = new Scanner(System.in).nextLine() ; 
            
            //# Since when writing the file its the users username.txt creating the new 
            //# Filename to be able to check for that file 
            fileName = un + ".txt" ;
            
            //# Creating a file object to check if the file exists 
            File file = new File(fileName) ; 
            
            //# If structure for if the file exists returning null if doesnt exist
            if(!file.exists())
            {
                System.out.println("Error: No file matching username") ; 
                return null; 
            }
            
            //# Creating a scanner object and connecting it to the file reader
            //# Obejcet - file reader acess the file Scanner lets us read the file
            Scanner in = new Scanner(new FileReader(fileName)) ; 
            
            //# Declaring variables to to store the infor from the file 
            in.nextLine() ; 
            String strUserName = in.nextLine() ; 
            String strPassword = in.nextLine() ; 
            String strFirstName = in.nextLine() ; 
            String strHairColour = in.nextLine() ; 
            String strPronouns = in.nextLine() ; 
            
            String strCurrency = in.nextLine() ;
            String strLevelTracker = in.nextLine() ; 
            
            //# Parsing the string values to their appropriate datatype
            short shoCurrency = Short.parseShort(strCurrency) ; 
            byte bytLevelTracker = Byte.parseByte(strLevelTracker) ; 
            
            //# Checking if the username and password are correct if not returning null
            if(un.equals(strUserName) && p.equals(strPassword))
            {
                character = new Character(strUserName, strPassword, strFirstName, strHairColour, strPronouns,shoCurrency, bytLevelTracker) ; 
                return character ; 
            }
            else
            {
                System.out.println("Username or password incorrect") ;
                in.close() ; 
                return null; 
            }
             
        }
        
        catch(FileNotFoundException e)
        {
            System.out.println("Error: Cannot open file for reading") ; 
        }
        
        catch(NoSuchElementException e)
        {
            System.out.println("Error: EOF encountered, file may be corrupt") ; 
        }
        
        catch (IOException e)
        {
            System.out.println("Error: Cannot read from file") ; 
        }
    
        return null ; 
    }
}
