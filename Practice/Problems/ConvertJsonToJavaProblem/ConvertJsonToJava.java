package Practice.Problems.ConvertJsonToJavaProblem;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConvertJsonToJava {
    private Object name;
    private Object age;
    private String phoneNo;

    public ConvertJsonToJava(Map<String,Object> map){
        for(Map.Entry<String,Object> map1: map.entrySet()){
        // if(value instanceof JSONArray){
        //             convertJsonToMap(value.toString());
        //             }
        //             else if(value instanceof Integer){
        //             result.put(key,value);
        //             }
        name=map.get("name");
        age=map.get("age");
        phoneNo=(String) map.get("phoneNo");
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
                    result.put(key,value);
                }
                 catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return result;
    }

    public static void main(String[] args) throws JSONException {
        String json = "{\"name\":\"Paul\",\"age\":20,\"phoneNo\":[\"12345\",\"98765\",\"567890\"]}";
        // String json2 = "{\"name\": \"John Doe\", \"age\": 30, \"phoneNo\": \"09877654\"}";
        Map<String, Object> data = convertJsonToMap(json);
 
        // for (Map.Entry<String, Object> entry : data.entrySet()) {
        //     System.out.println(entry.getKey() + ": " + entry.getValue());
        // }
        ConvertJsonToJava obj1=new ConvertJsonToJava(data);
        System.out.println(obj1.name +" "+obj1.age+" "+obj1.phoneNo);
    }
}
