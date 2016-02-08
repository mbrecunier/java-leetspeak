import java.io.*;

public class LeetSpeak {
  public static void main(String[] args) {

  }

  public static String leetSpeakTranslator(String userString) {
   userString = userString.replaceAll("e", "3");
   userString = userString.replaceAll("o", "0");
   userString = userString.replaceAll("I", "1");
   userString = userString.replaceAll("s", "z");
   return userString;
  }
}
