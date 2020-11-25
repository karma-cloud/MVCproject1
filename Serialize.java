import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.io.*;

public class Serialize {

    public static void serialize(Dish dish) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        //String result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dish);
        //System.out.println("result:" + result);
        //JSONObject json = new JSONObject(result);
        //System.out.println("Dish: " + json.getString("name"));
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("file.json"), dish);
    }
    public static Dish deserialize() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Dish dish = mapper.readValue(new File("file.json"), Dish.class);
        System.out.println(dish);
        return dish;
    }

}
