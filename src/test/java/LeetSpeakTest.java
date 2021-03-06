import org.junit.*;
import static org.junit.Assert.*;

public class LeetSpeakTest {
  @Test
  public void leetSpeakTranslator_returnsAsStrngAsIsWhenNoLeetspeakIsPresent_wordDoesntChange() {
    LeetSpeak testLeetSpeak = new LeetSpeak();
    assertEquals("happy", testLeetSpeak.leetSpeakTranslator("happy"));
  }

  @Test
  public void leetSpeakTranslator_replacesEveryEWithA3_wordChanges() {
    LeetSpeak testLeetSpeak = new LeetSpeak();
    assertEquals("3l3phant", testLeetSpeak.leetSpeakTranslator("elephant"));
  }

  @Test
  public void leetSpeakTranslator_replacesEveryOInAStringWithA0_wordChanges() {
    LeetSpeak testLeetSpeak = new LeetSpeak();
    assertEquals("b00 b00", testLeetSpeak.leetSpeakTranslator("boo boo"));
  }

  @Test
  public void leetSpeakTranslator_replacesEveryIInAStringWithA1_wordChanges() {
    LeetSpeak testLeetSpeak = new LeetSpeak();
    assertEquals("1 lik3 1k3", testLeetSpeak.leetSpeakTranslator("I like Ike"));
  }

  @Test
  public void leetSpeakTranslator_replacesEverySInAStringWithAZ_wordChanges() {
    LeetSpeak testLeetSpeak = new LeetSpeak();
    assertEquals("r0z3z ar3 r3d", testLeetSpeak.leetSpeakTranslator("roses are red"));
  }

  @Test
  public void leetSpeakTranslator_doesNotReplaceSWhenFirstLetter_wordChanges() {
    LeetSpeak testLeetSpeak = new LeetSpeak();
    assertEquals("Suzi3 sunzhin3", testLeetSpeak.leetSpeakTranslator("Susie sunshine"));
  }

  @Test
  public void leetSpeakTranslator_makesCorrectReplacementsRegardlessOfCase_ignoresUppercase() {
    LeetSpeak testLeetSpeak= new LeetSpeak();
    assertEquals( "1 scr3am y0u scr3am w3 all scr3am f0r raZpb3rry ic3 cr3am!", testLeetSpeak.leetSpeakTranslator("I scrEam you scream we all scream for raSpberry ice cream!"));
  }
}
