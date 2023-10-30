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
        String json = "{\"name\":\"Paul\",\"age\":20,\"phoneNo\":[\"12345\",\"98765\",\"567890\"]}";
        // String json2 = "{\"name\": \"John Doe\", \"age\": 30, \"phoneNo\":\"0923456664\"}";
        Map<String, Object> data = convertJsonToMap(json);
        ConvertJsonToJava obj1 = new ConvertJsonToJava(data);

        
         Field[] fields = ConvertJsonToJava.getDeclaredFields();

         
         Map<String, Class<?>> fieldMap = new HashMap<>();
 
       
         for (Field field : fields) {
             String fieldName = field.getName();
             Class<?> fieldType = field.getType();
             fieldMap.put(fieldName, fieldType);
         }
       
        Class<?> A=obj1.getClass();
        Field fieldss[] = A.getDeclaredFields();
        for(int i=0;i<fieldss.length;i++)
        System.out.println(fieldss[i]);

        System.out.println(obj1.name + " " + obj1.age + " " + obj1.phoneNo);
    }

    private static Field[] getDeclaredFields() {
        return null;
    }
}
