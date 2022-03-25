import java.util.*; 
import java.io.*;


class Main {

  static final int totalLetter = 26;
  static final int iniLowercase = 97;
  static final int iniUppercase = 65;

  public static String StringChallenge(String str, int num) {
    String output = "";
    int newPosition;
    char caracter;

    for(int i=0; i < str.length(); i++){
      caracter = str.charAt(i);

      if(!Character.isLetter(caracter)) { //Punctuation, spaces, and capitalization should remain intact
        output += caracter;
        continue;
      }

      boolean isUppercase = Character.isUpperCase(caracter);

      newPosition = ((((int) caracter) - (isUppercase? iniUppercase : iniLowercase)) + num) % totalLetter;
      int newPosAscii = (isUppercase? iniUppercase : iniLowercase) + newPosition;

      output += Character.toString((char) newPosAscii);
    }

    return output;
  }

  public static void main (String[] args) {  
    // keep this function call here

    String word = args[0];
    int desp = Integer.parseInt(args[1]);

    System.out.println(StringChallenge(word, desp)); 
  }

}