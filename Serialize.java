import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.io.*;

public class Serialize {
    static File file = new File("file.json");

    public static void serialize(Dish dish) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        //String result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dish);
        //System.out.println("result:" + result);
        //JSONObject json = new JSONObject(result);
        //System.out.println("Dish: " + json.getString("name"));
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, dish);
    }
    public static Dish deserialize() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Dish dish = mapper.readValue(file, Dish.class);
        System.out.println(dish);
        return dish;
    }

}
