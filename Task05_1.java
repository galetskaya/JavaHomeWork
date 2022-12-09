//Реализуйте структуру телефонной книги с помощью HashMap,
//учитывая, что один человек может иметь несколько телефонов.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task05_1 {
    public static void main(String[] args) {

        Map<String, ArrayList<String>> multValMap = new HashMap<String, ArrayList<String>>();

        multValMap.put("James Brody", new ArrayList<String>());
        multValMap.get("James Brody").add("1234567");
        multValMap.get("James Brody").add("0231234");
        multValMap.get("James Brody").add("8885757");

        multValMap.put("Lady Gaga", new ArrayList<String>());
        multValMap.get("Lady Gaga").add("7474747");
        multValMap.get("Lady Gaga").add("85858858");

        System.out.println(multValMap);
    }
}
