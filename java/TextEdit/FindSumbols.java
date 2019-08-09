package TextEdit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSumbols {

    Map<String, Integer> sortText = new HashMap<>();
    List<Map<String, List<Integer>>> symbolPosition = new ArrayList<>();


    public FindSumbols(String text) {

//        for (int i = text.length() - 1; i >= 0; i--) {
//            Integer count = sortText.get(String.valueOf(text.charAt(i)));
//            sortText.put(String.valueOf(text.charAt(i)), sortText.get(String.valueOf(text.charAt(i))) == null ? 1 : count + 1);
//        }
        for (int i = text.length() - 1; i >= 0; i--) {
            if (symbolPosition.size() == 0) {
                List<Integer> position = new ArrayList<>();
                Integer correctPosition = i + 1;
                position.add(correctPosition);
                Map value = new HashMap<>();
                value.put(String.valueOf(text.charAt(i)), position);
                symbolPosition.add(value);
            } else {
                for (int j = 0; j <= symbolPosition.size() - 1; j++) {
                    Integer maxSize = symbolPosition.size() - 1;
                    if (symbolPosition.get(j).containsKey(String.valueOf(text.charAt(i)))) {
                        Integer correctPosition = i + 1;
                        symbolPosition.get(j).get(String.valueOf(text.charAt(i))).add(correctPosition);
                        break;
                    } else if (j == maxSize) {
                        List<Integer> position = new ArrayList<>();
                        Integer correctPosition = i + 1;
                        position.add(correctPosition);
                        Map value = new HashMap<>();
                        value.put(String.valueOf(text.charAt(i)), position);
                        symbolPosition.add(value);
                        break;
                    }
                }
            }
        }

    }


    public Map<String, Integer> getSortText() {
        return sortText;
    }

    public List<Map<String, List<Integer>>> getSymbolPosition() {
        return symbolPosition;
    }
}
