package Practice.Problems.ConvertJsonToJavaProblem;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.lang.reflect.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConvertJsonToJava {
    private String name;
    private int age;
    private String phoneNo;

    public ConvertJsonToJava(Map<String, Object> map) {
        for (Map.Entry<String, Object> map1 : map.entrySet()) {
                Object val=map1.getValue();
                String key=map1.getKey();
            if (val instanceof JSONArray && key.equals("phoneNo")) {
                phoneNo=val.toString();
                System.out.println("stringarr");
            } else if (val instanceof Integer && key.equals("age")) {
                age=(int)val;
                System.out.println("int");
            } else if (val instanceof String && key.equals("name")) {
                name=val.toString();
                System.out.println("string name");
            }
            else if(val instanceof String && key.equals("phoneNo")){
                phoneNo=val.toString();
                System.out.println("string ph");
            }
        }
    }

    public static Map<String, Object> convertJsonToMap(String json) throws JSONException {
        JSONObject jsonObject = new JSONObject(json);
        Map<String, Object> result = new HashMap<>();
        Iterator<String> keys = jsonObject.keys();

        while (keys.hasNext()) {
            String key = keys.next();
            try {
                Object value = jsonObject.get(key);
                result.put(key, value);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static void main(String[] args) throws JSONException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        // String json = "{\"name\":\"Paul\",\"age\":20,\"phoneNo\":[\"12345\",\"98765\",\"567890\"]}";
        String json2 = "{\"name\": \"John Doe\", \"age\": 30, \"phoneNo\":\"0923456664\"}";
        Map<String, Object> data = convertJsonToMap(json2);
        ConvertJsonToJava obj1 = new ConvertJsonToJava(data);
        // System.out.println(obj1.get);
        // Class<?> A=obj1.getClass();
        // Field field1[] = A.getDeclaredFields();
        // for(int i=0;i<field1.length;i++)
        // System.out.println(field1[i]);

        System.out.println(obj1.name + " " + obj1.age + " " + obj1.phoneNo);
    }
}
