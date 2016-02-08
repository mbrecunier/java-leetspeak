import java.io.*;

public class LeetSpeak {
  public static void main(String[] args) {

  }

  public static String leetSpeakTranslator(String userString) {
   userString = userString.replaceAll("e", "3");
   userString = userString.replaceAll("o", "0");
   userString = userString.replaceAll("I", "1");
   String[] userArray = userString.split(" ");
   for(Integer i=0; i< userArray.length; i++) {
     userArray[i] = userArray[i].replaceAll("s", "z");
     userArray[i] = userArray[i].replaceAll("S", "Z");
     if(userArray[i].startsWith("Z")) {
         userArray[i] = userArray[i].replaceFirst("Z", "S");
       } else if(userArray[i].startsWith("z")) {
         userArray[i] = userArray[i].replaceFirst("z", "s");
       }
     }
     String translatedString = String.join(" ", userArray);
     return translatedString;
   }
}
