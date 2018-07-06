import java.util.Scanner;    


public class Hangman


{

    private static String hum = "";

 private static int mistake = 0;

 private static String mainText;

 private static String text;

    private static Scanner user_input = new Scanner(System.in);


 public static void main(String[] args)


 {

    System.out.println("Choose a word for another to guess");

    Scanner keyboard = new Scanner (System.in);

    String j = keyboard.nextLine( );

    String word = j;

    int chosen = j.length();

    String word2 = word;

    char letter = ' ';

    char letter2 = ' ';

    Stand();

    for(int k = 0;k <= chosen - 1; k++)

    {

        word =word.toLowerCase();

        word2 = word2.toUpperCase();

        letter = word.charAt(k);

        letter2 = word2.charAt(k);

        if(letter != letter2)

        {

            word = word.replace(letter, '-');

        }

    }

    System.out.println(word);

    text = word;

    mainText = j.toLowerCase();

    StringBuffer oldWord = new StringBuffer(mainText);

    StringBuffer nword = new StringBuffer(word);

    do

    {

     if(mistake == 6)

     {

      break;

     }

     System.out.println("Choose a letter: ");

     String humanInput = keyboard.next( );

     letter2 = humanInput.charAt(0);

     int letter3 = mainText.indexOf(letter2);
     int letter4 = mainText.indexOf(letter2); 
     
     while (letter3 >= 0)
     {
              
         if(letter3 >= 0 && humanInput.length() == 1)

         {
           	nword = nword.replace(letter3, letter3 + 1, humanInput);
        	
            Stand();
            
            System.out.println(hum);
            
            System.out.println(nword);

         }

         letter3 = mainText.indexOf(letter2, letter3 + 1);
     }
     
     while(letter4 < 0 && humanInput.length() == 1)
     {
    	 if(hum.indexOf(humanInput) <0)
    	 {
    		 Human();

    		 hum = humanInput + hum;

    		 System.out.println(hum);

    		 System.out.println(nword);
    		 break;
    	 
    	 }
    	 else
    	 {
    		 Stand();

    		 System.out.println(hum);

    		 System.out.println(nword);
    		 
    		 break;
    	 }
     }
     if(humanInput.length() != 1)
	 {
    	 Stand();

		 System.out.println(hum);

		 System.out.println(nword);
	 }

    }while(!nword.toString().contentEquals(oldWord.toString()));

    if(nword.toString().contentEquals(oldWord.toString()))

    {

    	System.out.println("You Win!");

    }

    if(!nword.toString().contentEquals(oldWord.toString()))

    {

    	System.out.println("You Lose the word was: " + oldWord);

    }

 }


 public static void Stand()


 {

     if(mistake == 0)

      {

       System.out.println(" |--|");

          System.out.println("    |");

          System.out.println("    |");

          System.out.println("____|");

      }

     if(mistake == 1)

      {

       System.out.println(" |--|");

          System.out.println(" 0  |");

          System.out.println("    |");

          System.out.println("____|");

      }

      if(mistake == 2)

      {

       System.out.println(" |--|");

          System.out.println(" 0  |");

          System.out.println(" |  |");

          System.out.println("____|");

      }if(mistake == 3)

      {

       System.out.println(" |--|");

          System.out.println(" 0  |");

          System.out.println(" |  |");

          System.out.println("/___|");

      }if(mistake == 4)

      {

       System.out.println(" |--|");

          System.out.println(" 0  |");

          System.out.println(" |  |");

          System.out.println("/_\\_|");

      }if(mistake == 5)

      {

       System.out.println(" |--|");

          System.out.println(" 0  |");

          System.out.println(" |\\ |");

          System.out.println("/_\\_|");

      }if(mistake == 6)

      {

       System.out.println(" |--|");

          System.out.println(" 0  |");

          System.out.println("/|\\ |");

          System.out.println("/_\\_|");

      }

    return;

 }


 public static String Human()

 {
  if(mistake == 0)

  {

   System.out.println(" |--|");

      System.out.println(" 0  |");

      System.out.println("    |");

      System.out.println("____|");

  }

  if(mistake == 1)

  {

   System.out.println(" |--|");

      System.out.println(" 0  |");

      System.out.println(" |  |");

      System.out.println("____|");

  }if(mistake == 2)

  {

   System.out.println(" |--|");

      System.out.println(" 0  |");

      System.out.println(" |  |");

      System.out.println("/___|");

  }if(mistake == 3)

  {

   System.out.println(" |--|");

      System.out.println(" 0  |");

      System.out.println(" |  |");

      System.out.println("/_\\_|");

  }if(mistake == 4)

  {

   System.out.println(" |--|");

      System.out.println(" 0  |");

      System.out.println(" |\\ |");

      System.out.println("/_\\_|");

  }if(mistake == 5)

  {

   System.out.println(" |--|");

      System.out.println(" 0  |");

      System.out.println("/|\\ |");

      System.out.println("/_\\_|");

  }

  mistake++;

  return null;

 }

}




