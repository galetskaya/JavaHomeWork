import java.util.HashMap;
import java.util.Map;

public class Notebook {
    String model;       //model
    String color;       //color
    String OS;          //operational system
    int SDD;            //processor memory
    int RAM;            //RAM memory
    int price;


    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s, %s", model, color, OS, SDD, RAM, price);
    }

    public  Map<Object,Object> parametrsMap() {
        Map<Object,Object> parametrsNotebook = new HashMap<>();
        parametrsNotebook.put("color", color);
        parametrsNotebook.put("model", model);
        parametrsNotebook.put("ssd", SDD);
        parametrsNotebook.put("price", price);
        parametrsNotebook.put("RAM", RAM);
        parametrsNotebook.put("OS", OS);
        return parametrsNotebook;
    }
}
