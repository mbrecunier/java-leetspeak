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
}
