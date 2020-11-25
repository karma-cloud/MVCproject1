import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Category v = new Category("выпечка");
        Dish dish = new Dish("блин", v, 150);
        //System.out.println(dish);
        Serialize.serialize(dish);

        Serialize.deserialize();
    }
}
