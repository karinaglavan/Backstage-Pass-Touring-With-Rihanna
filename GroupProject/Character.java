
/**
 * This is a character class that will have instance variables relating to the user themselves
 * And the character within the game. Like for example for the user to acess their character they
 * Need to enter in their username and password. Then there will be attrubutes related to the 
 * Actual character within the game. 
 * @author (Karina Glavan)
 * @version (2023/12/01)
 */
public class Character
{
    //# Declaring private instance variables for the character class that is the users 
    //# UserName and the users Password. These will need a get method so when the user
    //# Logs in we will see if the entered value compares to what was saved. 
    private String strUserName ; 
    private String strPassword ; 
    
    //# At the end of the storyline the user will have a specific amount of money 
    //# They get money based on the choices they make throughout the game 
    private short shoCurrency ;  
    
    //# Tracking which level the user is at if they choose to quit the game after they finish
    //# A level. So that when they return to the game they dont have to restart they can go 
    //# Straight to the last level they needed to be on. 
    private byte bytLevelTracker ; 
    
    //# Declaring variables that correlate directly to the users character within the storyline
    //# Those characteristcs include the Characters First Name that will also be their stage
    //# Name within the story. Hair colour so that it can be a topic of conversation within the
    //# Game. And the characters pronouns to properly refer to them within the game 
    private String strFirstName ; 
    private String strHairColour ; 
    private String strPronouns ; 
    
    //# Coding a default constructor of the Character class that sets a default value to
    //# All of the instance variables 
    public Character()
    {
        //# Setting all String value to a default of Unknown
        
        this.strUserName = "Unknown" ;
        this.strPassword = "Unkown" ; 
        
        //# Setting the currency the character has to zero since they havent actually done 
        //# Anything 
        this.shoCurrency = 0 ; 
    
        //# Setting the default for the level tracker to 1, again due to the fact that this
        //# Default character hasnt actually done anything yet, and therefore they would 
        //# Start at the default level in this case 1 ; 
        this.bytLevelTracker = 1 ; 
        
        this.strFirstName = "Unknown" ; 
        this.strHairColour = "Unknown" ; 
        this.strPronouns = "Unknown" ; 
    }
    
    //# Coding another constructor that will set some of the values to what the user choses
    //# While some will be hard coded 
    public Character(String un, String p, String fn, String hc, String pn)
    {
        this.strUserName = un ; 
        this.strPassword = p ; 
        
        //# Default value of 10 since they joined and created an account with us
        //# They will receive 10 RiRiRupees; 
        this.shoCurrency = 10 ; 
        
        //# Setting this value to one again because when they first create their account 
        //# They havent played the game yet, so they automatically start at 1 
        this.bytLevelTracker = 1 ; 
        
        this.strFirstName = fn ; 
        this.strHairColour = hc ; 
        this.strPronouns = pn ; 
    }
    
    //# Coding another constructor for when the user comes back and has a saved file
    public Character(String un, String p, String fn, String hc, String pn, short c, byte lt)
    {
        this.strUserName = un ; 
        this.strPassword = p ; 
        
        this.strFirstName = fn ; 
        this.strHairColour = hc ; 
        this.strPronouns = pn ; 
        
        this.shoCurrency = c ; 
        this.bytLevelTracker = lt ; 
    
    }
    
    //# Coding a setter for the Currency, everytime the currency value changes 
    //# We need to adjust for that value 
    public void setCurrency(short value)
    {
        this.shoCurrency += value ; 
    }
    
    //# Coding a setter for the LevelTracker, since after they finish a level this value 
    //# Needs to change 
    public void setLevelTracker(byte currentlevel)
    {
        this.bytLevelTracker = currentlevel   ; 
    }
    
    //# Not coding any more setters besides the ones above, since we wont have the user 
    //# Change those values after they have already set them 
    
    //# Coding a getter for the users username 
    public String getUserName()
    {
        return this.strUserName ; 
    }
    
    //# Coding a getter for the users password 
    public String getPassword()
    {
        return this.strPassword ; 
    }
    
    //# Coding a getter for the characters First Name 
    public String getFirstName()
    {
        return this.strFirstName ; 
    }
    
    //# Coding a getter for the characters Hair Colour
    public String getHairColour()
    {
        return this.strHairColour ; 
    }
    
    //# Getting the perPronouns and actually creating the substring
    public String perPronoun()
    {
        String strPosPronoun ; 
        byte bytDivider ; 
        
        bytDivider = (byte)this.strPronouns.indexOf('/') ;
        strPosPronoun = this.strPronouns.substring(0,bytDivider) ; 
        
        return strPosPronoun ; 
    }
    
    //# Getting the pos pronoun and actually creating the substring
    public String posPronoun()
    {
        String strPerPronoun ; 
        byte bytDivider ; 
        
        bytDivider = (byte)this.strPronouns.indexOf('/') ;
        
        strPerPronoun = this.strPronouns.substring(bytDivider + 1) ; 
        
        return strPerPronoun ; 
    }
    
    //# Coding a getter for the currency value
    public short getCurrency()
    {
        return this.shoCurrency ; 
    }
    
    //# Coding a getter for the Level Tracker 
    public byte getLevelTracker()
    {
        return this.bytLevelTracker ; 
    }
    
    //# Coding a toString method of this class so that its easier to write to the file 
    //# The variables from the object. So that when the user leaves the values are saved
    //# For when they choose to play again
    public String toString()
    {
        return this.strUserName + "\n" + this.strPassword + "\n" + this.strFirstName + "\n" 
        + this.strHairColour + "\n"+ this.strPronouns + "\n"+ this.shoCurrency + "\n" + this.bytLevelTracker ; 

    }
}
