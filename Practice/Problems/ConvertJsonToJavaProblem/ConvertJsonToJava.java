package Practice.Problems.ConvertJsonToJavaProblem;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConvertJsonToJava {
    
    public static Map<String, Object> convertJsonToMap(String json) throws JSONException {
        JSONObject jsonObject = new JSONObject(json);
        Map<String, Object> result = new HashMap<>();
        Iterator<String> keys = jsonObject.keys();

            while (keys.hasNext()) {
                String key = keys.next();
                try {
                    Object value = jsonObject.get(key);
                    result.put(key, jsonObject.get(key));
                }
                 catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return result;
    }

    public static void main(String[] args) throws JSONException {
        // String json = "{\"name\": \"John Doe\", \"age\": 30, \"email\": \"john.doe@example.com\"}";
        String json = "{\"name\":\"Paul\",\"age\":20,\"phoneNo\":[\"12345\",\"98765\",\"567890\"]}";
        Map<String, Object> data = convertJsonToMap(json);
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
