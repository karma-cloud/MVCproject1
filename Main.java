import com.fasterxml.jackson.core.JsonProcessingException;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Category v = new Category("выпечка");
        Dish dish = new Dish("блин", v, 150);
        System.out.println(dish);
        Serialize.serialize(dish);
    }
}
