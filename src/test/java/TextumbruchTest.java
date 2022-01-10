import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextumbruchTest {

  private static final String text = "Es blaut die Nacht,\n" +
      "die Sternlein blinken,\n" +
      "Schneefloecklein leis hernieder sinken.";

  @Test
  void testUmbrechenMitLaenge9(){
    Textumbruch textumbruch = new Textumbruch();
    int maxZeilenLaenge = 9;
    String actual = textumbruch.umbrechen(text, maxZeilenLaenge);
    String expected = "Es blaut\n" +
        "die\n" +
        "Nacht,\n" +
        "die\n" +
        "Sternlein\n" +
        "blinken,\n" +
        "Schneeflo\n" +
        "ecklein\n" +
        "leis\n" +
        "hernieder\n" +
        "sinken.";

    assertEquals(expected, actual);

  }

  @Test
  void testUmbrechenMitLaenge14(){
    Textumbruch textumbruch = new Textumbruch();
    int maxZeilenLaenge = 14;
    String actual = textumbruch.umbrechen(text, maxZeilenLaenge);
    String expected = "Es blaut die\n" +
        "Nacht, die\n" +
        "Sternlein\n" +
        "blinken,\n" +
        "Schneefloeckle\n" +
        "in leis\n" +
        "hernieder\n" +
        "sinken.";

    assertEquals(expected, actual);

  }

}