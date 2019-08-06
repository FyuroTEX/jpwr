
import java.util.HashMap;
import java.util.Map;

public class FindSumbols {

    Map<String, Integer> sortText = new HashMap<>();

    public FindSumbols(String text) {

        for (int i = text.length() - 1; i >= 0; i--) {

            String symbolFromText = String.valueOf(text.charAt(i));

            if (sortText.containsKey(symbolFromText)) {
                Integer count = sortText.get(symbolFromText) + 1;
                sortText.put(symbolFromText, count);
            }
            else{
                sortText.put(symbolFromText, 1);
            }
//
//
//            Integer count = sortText.get(String.valueOf(text.charAt(i)));
//
//
//            sortText.put(String.valueOf(text.charAt(i)), sortText.get(String.valueOf(text.charAt(i))) == null ? 1 : count + 1);
        }
    }

    public Map<String, Integer> getSortText() {
        return sortText;
    }
}