
//#Import the entire java.util and java.lang libraries
import java.util.*;
import java.lang.*;

public class Minigames
{
    /**
     * Description: This is one of the side minigames unrelated to the main storyline. It should be treated as
     * an extra or bonus to the main game. Overall, the user must guess the Rihanna song correctly based on the lyrics. 
     * Author: Irene
     * Date: December 1, 2023
     */ 
    public static void songTrivia(Character c)
    {
        //#--VARIABLES
        //#2D Array of Questions
        String[][] triviaQuestions = { //#Format: {Question, Answer}
                {"\"Told you I'll be here forever, said I'll always be your friend.\"", "Umbrella"},
                {"\"Just gonna stand there and watch me burn, but that's alright because I like the way it hurts.\"", "Love The Way You Lie"},
                {"\"It's the way I'm feeling, I just can't deny.\"", "We Found Love"},
                {"\"I knew that we'd become one right away.\"", "Diamonds"},
                {"\"Hold me like a pillow, make me feel right.\"", "Only Girl"},
                {"\"Funny, you're the broken one but I'm the only one who needed saving.\"", "Stay"},
                {"\"Are you hiding from me, yeah?\"", "Where Have You Been"},
                {"\"That was quite a show, very entertaining.\"", "Take a Bow"},
                {"\"The square root of 69 is 8-something.\"", "What's My Name?"},
                {"\"It's a thief in the night to come and grab you.\"", "Disturbia"},
                {"\"It's getting late, I'm making my way over to my favorite place.", "Don't Stop the Music"},
                {"\"It goes one by one, even two by two.\"", "Pon de Replay"},
                {"\"It's not healthy for me to feel this way.\"", "SOS"},
                {"\"What are you willing to do?", "Kiss it Better"},
                {"\"And you got me like, 'Oh, what you want from me?'\"", "Love on the Brain"} 
            };

        byte bytNumOfQuestions = 5; //#There will be 5 questions for the user to answer
        byte bytNumChoices = 4; //#Declare a variable to store how many option should be shown for each question
        byte bytPossibleQuestions = (byte)(triviaQuestions.length); //#I need the number of possible questions a lot
        byte bytCurrentChoice, bytAnswerIndex; //#Keep track of the user's choice, and the index of the answer for each question
        byte bytSongTriviaScore = 0; //#To keep track of the score. The score should always be reset to 0 at the beginning    
        ArrayList<Byte> randQuestions = new ArrayList<Byte>(); //#Declare an arraylist to store the questions in a random order

        //#HEADER in terminal window
        System.out.println("\n---𝗚𝗨𝗘𝗦𝗦 𝗧𝗛𝗘 𝗦𝗢𝗡𝗚: 𝗥𝗜𝗛𝗔𝗡𝗡𝗔 𝗘𝗗𝗜𝗧𝗜𝗢𝗡---\nObjective:\n→ Guess each of the Rihanna songs correctly.\nInstructions:\n→ You will be presented with" + bytNumOfQuestions + "trivia questions. When prompted, enter either 1, 2, 3, or 4 into\nthe blank text box at the bottom of the terminal window to choose your answer. Good Luck!");

        //#Add the numbers 0 to the number of questions in the trivia game to an ArrayList so that the questions chosen from the trivia question bank are randomized.
        for (byte bytIndex = 0; bytIndex < bytPossibleQuestions; bytIndex++)
        {
            randQuestions.add(bytIndex);
        }

        //#Randomize the order of the indexes in "randQuestions" ArrayList  
        Collections.shuffle(randQuestions);

        //#Iterate through each of the questions
        for (byte bytCurrentQuestion = 0; bytCurrentQuestion < bytNumOfQuestions; bytCurrentQuestion++)
        {
            //#Declare an ArrayList of type String ti stire the options for each question
            ArrayList<String> songChoices = new ArrayList<String>();

            //#Header text for each question
            System.out.println("\n>.>.> Question " + (bytCurrentQuestion + 1) + ": " + triviaQuestions[randQuestions.get(bytCurrentQuestion)][0]);

            //#Make sure to have the answer to the question as one of the possible choices
            songChoices.add(triviaQuestions[randQuestions.get(bytCurrentQuestion)][1]);

            //#Ensure that the same choice doesn't show up twice
            do
            {
                //#Generate a random integer between 0 and one less than the number of possible questions to be an index value 
                byte bytRandomOption = (byte)(Math.random() * (bytPossibleQuestions - 1));

                //#If the choices ArrayList doesn't already have this choice as an option, add it as a possible option
                if (!songChoices.contains(triviaQuestions[bytRandomOption][1]))
                {
                    songChoices.add(triviaQuestions[bytRandomOption][1]);
                }
            } while (songChoices.size() < bytNumChoices); //#While the possible choices list does not exceed the maximum number of choices already determined

            //#Randomize the order of the choices
            Collections.shuffle(songChoices);

            //#Convert the ArrayList of song choices to a 1D array so that the showChoices method from the superclass can be used
            String[] arrChoices = songChoices.toArray(new String[0]);

            //#Validate the user's input
            bytCurrentChoice = Level.displayChoices(arrChoices);
            bytAnswerIndex = (byte)(songChoices.indexOf(triviaQuestions[randQuestions.get(bytCurrentQuestion)][1]));

            //#Outcome of question
            if (bytCurrentChoice == (bytAnswerIndex + 1)) {
                //#If the user chooses the correct answer, tell them that they did and add 1 to the score
                System.out.println("Correct!");
                bytSongTriviaScore++;
            } else {
                //#Tell the user that they are wrong and tell them the correct answer
                System.out.println("Wrong! The correct answer was: " + arrChoices[bytAnswerIndex]);
            }
        }

        Level.minigamesMenu(c) ; 
    }

    /**
     * Description: This is one of the side minigames unrelated to the main storyline. It should be treated as
     * an extra or bonus to the main game. Overall, the user must countinue to finish the lyrics to popular Rihanna songs
     * As in one part will be given and 4 different options will be shown the user has to guess
     * The correct one
     * Author: Karina Glavan
     * Date: December 06, 2023
     */ 
    public static void guessTheLyrics(Character c)
    {
        //# Coding a 2D array that will store the lyrics with the continuation of the lyrics
        String[][] lyricQuestions = {
                {"Find light in the beautiful sea","I choose to be happy"},
                {"Now that its raining more than ever", "Know that we'll still have each other"},
                {"Well, funny you're the broken one", "But I'm the only one who needed saving"},
                {"Want you to make me feel like I'm the only girl in the world", "Like I'm the only one that you'll ever love"},
                {"Lemme see you move and rock it 'til the groove done", "Shake it 'til the moon becomes the sun"},
                {"I'm a fine-tuned supersonic speed machine", "Got a sunroof top and a gangster lean"},
                {"S-O-S, please, someone help me", "Its not healthy for me to feel this"}, 
                {"I wanna take you away", "Let's escape into the music"},
                {"I've been everywhere, man","Looking for you, babe"},
                {"Pay me what you owe me", "Don't act like you forgot"},
                {"Shine a light through an open door","Love and life I will divide"},
                {"Always be my boy", "I'll always be your girl"}
            } ; 

        //# Creating a random ocject using the java .util library
        Random random = new Random() ; 

        //# Declaring an array of questions that will store the 8 random questions 
        String[] questions = new String[8] ; 

        //# Using an arraylist to store temporarly the questions and add them to the specific array of questions that will output
        ArrayList<String> listQuestions = new ArrayList<String>() ; 

        //# This is a variable to keep choosing when the options are presented 
        byte bytCurrentChoice ; 

        //# This value will keep track of the questions when going through the questions
        byte bytTrackQuestions ; 
        
        //#HEADER in terminal window
        System.out.println("\n---GUESS THE LYRICS?: 𝗥𝗜𝗛𝗔𝗡𝗡𝗔 𝗘𝗗𝗜𝗧𝗜𝗢𝗡---\nObjective:\n→ Match each corresponding Lyric to eachother.") ; 
        System.out.print("\nInstructions:\n→ You will be presented with 8 trivia questions. When prompted, enter either 1, 2, 3, or 4 into\nthe blank text box at the bottom of the terminal window to choose your answer. Good Luck!");

        //# Adding all the possible questions from the 2D array to the arraylist
        for(int i = 0 ; i < lyricQuestions.length ; i++)
        {
            listQuestions.add(lyricQuestions[i][0]) ; 
        }

        //# Randomising the possible questions and addig them to the String array of questions 
        for(int i = 0 ; i < questions.length ; i++)
        {
            byte bytChosenIndex = (byte)random.nextInt(listQuestions.size()) ; 
            questions[i] = listQuestions.remove(bytChosenIndex) ; 
        }

        //# Randomising the mutlple choice options while also asking the user the questions
        for(int i = 0 ; i < 8; i++)
        {
            //# Declaring a string that stores the mutlple choice options
            ArrayList<String> multipleChoice = new ArrayList<>(4) ; 
            
            String correctAnswer = "" ; 
            
            //# Finding the correct answer to the question before randomising the other possible choices
            for (int j = 0; i < lyricQuestions.length; j++) 
            {
                if (lyricQuestions[j][0].equals(questions[i])) 
                {
                    correctAnswer = lyricQuestions[j][1];
                    break ; 
                }
            }
            
            //# Adding the correct answer to the array list
            multipleChoice.add(correctAnswer) ; 
            
            //# Randomizing the other possible choices for the array list 
            while (multipleChoice.size() < 4) 
            {
                //# Getting a random index that will match any possible answers
                int randomIndex = random.nextInt(lyricQuestions.length);
                
                //# Ensuring that the possible answers are only within the second column of the 2D array
                String potentialAnswer = lyricQuestions[randomIndex][1];
                
                //# Ensuring no answers repeat within the possible choices
                if (!potentialAnswer.equals(correctAnswer) && !multipleChoice.contains(potentialAnswer)) {
                    multipleChoice.add(potentialAnswer);
                }
            }
            
            //# Shuffling the arraylist so that the choices are random
            Collections.shuffle(multipleChoice) ; 
            
            //# Converting the arraylist to a string to be able to use the method in the level class
            String[] choices = new String[multipleChoice.size()] ; 
            choices = multipleChoice.toArray(choices) ; 
            
            //# Actually ask the user the question
            System.out.println("\n" + questions[i]) ; 
            
            //# Using the method from the Level class
            bytCurrentChoice = Level.displayChoices(choices);
            
            //# Checking if the user got the answer correclty 
            if(choices[bytCurrentChoice -1].equals(correctAnswer))
            {
                System.out.println("Correct!");
            }
            else
            {
                System.out.println("Incorrect. The correct answer was: " + correctAnswer) ; 
            }
            
        }  
        
        //# Returning to the main menu
        Level.minigamesMenu(c) ; 
    }
}
