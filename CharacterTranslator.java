/**
   The CharacterTranslator class stores data 
   about telephone digits for the Alphabetic 
   Telephone Number Translator programming 
   challenge.
*/

public class CharacterTranslator
{
   /**
      The getPhoneDigit method accepts a character
      that might be used in a telephone number. If
      character is alphabetic, the method returns
      the numeric digit that corresponds to it on
      the telephone keypad. Otherwise, the character
      that was passed as an argument is returned.
      @param c The character to translate.
      @return The corresponding numeric digit, or
              the original value of c.
   */

   public static char getPhoneDigit(char c)
   {
      // The digit variable will hold the digit
      // on a standard telephone keypad that
      // corresponds with the character.
      char digit;

      // Get the uppercase version of the character.
      c = Character.toUpperCase(c);

//add code here

      // Return the translated character.
      return digit;
   }
}