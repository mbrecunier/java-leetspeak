import java.io.*;
import java.util.Map;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class LeetSpeak {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/home", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template","templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

   get("/translator", (request, response) -> {
     Map<String, Object> model = new HashMap<String, Object>();
     model.put("template","templates/translator.vtl");
     String userString = request.queryParams("userLetter");
     String results = LeetSpeak.leetSpeakTranslator(userString);

     model.put("results", results);
     return new ModelAndView(model, layout);
   }, new VelocityTemplateEngine());
  }

  public static String leetSpeakTranslator(String userString) {
   userString = userString.replaceAll("e", "3");
   userString = userString.replaceAll("E", "3");
   userString = userString.replaceAll("o", "0");
   userString = userString.replaceAll("O", "0");
   userString = userString.replaceAll("I", "1");
   String[] userArray = userString.split(" ");
   for(Integer i=0; i< userArray.length; i++) {
     if((userArray[i].startsWith("S")) || (userArray[i].startsWith("s"))) {
       userArray[i] = userArray[i].replaceAll("s", "z");
       userArray[i] = userArray[i].replaceAll("S", "Z");
       userArray[i] = userArray[i].replaceFirst("Z", "S");
       userArray[i] = userArray[i].replaceFirst("z", "s");
     } else {
       userArray[i] = userArray[i].replaceAll("s", "z");
       userArray[i] = userArray[i].replaceAll("S", "Z");
     }

    }
     String translatedString = String.join(" ", userArray);
     return translatedString;
   }
}
