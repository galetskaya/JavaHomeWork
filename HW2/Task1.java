//Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
//используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
//Разберите строку, используя String.split.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"40"}

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("Task1.txt")) {

            //to write into the file
            String text = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
            writer.write(text);
            writer.flush();

            // to read from the file
            FileInputStream inFile = new FileInputStream("Task1.txt");
            byte[] string = new byte[inFile.available()];
            inFile.read(string);
            String newText = new String(string);

            String str = newText.replace("\"", "").replace("{", "").replace("}", "");
            String[] str2 = str.split(", ");

            Map<String, String> dictionary = new HashMap<String, String>();
            for (String items : str2) {
                String[] strNew = items.split(":");

                for (int i = 0; i < strNew.length; i++) {
                    dictionary.put(strNew[0], strNew[1]);
                }
            }
            String new1 = "SELECT * FROM students  WHERE ";
            StringBuilder builder = new StringBuilder();
            builder.append(new1);

            if (dictionary.get("name") != null)  {
                builder.append(" name = " + dictionary.get("name"));
            }
            if (dictionary.get("country") != null)  {
                builder.append(" AND country = " + dictionary.get("country"));
            }
            if (dictionary.get("city") != null) {
                builder.append(" AND city = " + dictionary.get("city"));
            }
            if (!(dictionary.get("age") != "null")){
                builder.append(" AND age = " + dictionary.get("age"));
            }

            System.out.println(builder.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}