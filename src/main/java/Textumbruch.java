import static org.apache.commons.text.WordUtils.wrap;

public class Textumbruch {
  public String umbrechen(String text, int maxZeilenLaenge) {
    String adjustedText = text.replace("\n", " ");
    return wrap(adjustedText, maxZeilenLaenge, "\n", true);
  }
}
