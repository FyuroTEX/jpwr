import com.google.common.collect.Maps;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> listColor = new ArrayList();
        listColor.add("white");
        listColor.add("white");
        listColor.add("white");
        listColor.add("white");
        listColor.add("yellow");
        listColor.add("yellow");
        listColor.add("white");
        listColor.add("white");
        listColor.add("white");
        listColor.add("white");
        listColor.add("white");

        listColor.add("yellow");
        listColor.add("black");
        listColor.add("white");
        listColor.add("black");
        listColor.add("white");
        listColor.add("yellow");
        listColor.add("white");
        listColor.add("yellow");
        listColor.add("yellow");
        listColor.add("yellow");
        listColor.add("yellow");
        listColor.add("white");
        listColor.add("white");
        listColor.add("white");
        listColor.add("white");
        listColor.add("white");






//        listColor.forEach(i -> {
//            if (i.contains("white")) {
//                listColor.remove(listColor.get(item));
//            }
//        });
//        for (String item: listColor) {
//            if(item.contains("white")){
//                listColor.remove(listColor.indexOf(item));
//            }
//        }
        for (int i = listColor.size() -1 ; i >= 0; i--) {
            if(listColor.get(i).equals("white")){
                listColor.remove(i);
            }
        }
//        System.out.println(listColor.get(0).contains("white"));
        System.out.println(listColor);



        List<Map<String, List<Integer>>> someLIst = new ArrayList<>();

        List<Integer> someIntegers = new ArrayList<>();
        someIntegers.add(1);
        someIntegers.add(2);
        someIntegers.add(3);

        Map<String, List<Integer>> mapWithLIstINside = new HashMap<>();
        mapWithLIstINside.put("a", someIntegers);
        someLIst.add(mapWithLIstINside);

        Map<String, String> mapWithStrings = Map.of("key1", "value1",
                "key2","value2");

        mapWithStrings.forEach((key, value)-> System.out.println("This is key "+key+ " and value is :"+ value));

        Iterator<Map.Entry<String, String>> iterator = mapWithStrings.entrySet().iterator();
        while (iterator.hasNext()==true) {
            System.out.println(iterator.next().getValue());
        }


        mapWithStrings.getOrDefault("a", "azaza");

        List<Integer> listInt = someLIst.get(0).get("a");
        listInt.add(1);
    }
}
