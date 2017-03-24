import java.text.Normalizer;

class CleanString{
  private static String stripAccents(String s) {
	  s = Normalizer.normalize(s, Normalizer.Form.NFD);
	  s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
	  return s;
	}
	public static String normalize(String s){
		return stripAccents(s).replaceAll("[^a-zA-Z0-9]","");
  }

}
