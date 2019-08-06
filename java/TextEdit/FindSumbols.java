package TextEdit;

import java.util.HashMap;
import java.util.Map;

public class FindSumbols {

    Map<String, Integer> sortText = new HashMap<>();

    public FindSumbols(String text) {

        for (int i = text.length() - 1; i >= 0; i--) {
            Integer count = sortText.get(text.charAt(i));
            sortText.put(String.valueOf(text.charAt(i)), sortText.get(text.charAt(i)) == null ? 1 : count + 1);
        }
    }

    public Map<String, Integer> getSortText() {
        return sortText;
    }
}
