import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.io.*;

public class Serialize {
    public static void example() throws JsonProcessingException {
        Category category = new Category("Baking");
        ObjectMapper objectMapper = new ObjectMapper();
        String result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(category);
        System.out.println("result:" + result);
        JSONObject json = new JSONObject(result);
        System.out.println("category: " + json.getString("nameCategory"));
    }
    public static void serialize(Dish dish) throws JsonProcessingException{
        ObjectMapper objectMapper = new ObjectMapper();
        String result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dish);
        System.out.println("result:" + result);
        JSONObject json = new JSONObject(result);
        System.out.println("Dish: " + json.getString("name"));
        //objectMapper.writeValue(new File("file.json"), dish);
    }


    /*public static void serializeBuilding(Building building, OutputStream out) throws IOException {
        ObjectOutputStream out1 = new ObjectOutputStream(out);
        out1.writeObject(building);
    }

    public static Building deserializeBuilding(InputStream in) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(in);
        return (Building) in1.readObject();
    }

     */
}
