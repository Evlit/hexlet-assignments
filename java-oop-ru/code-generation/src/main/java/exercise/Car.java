package exercise;

//import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.JsonMappingException;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

//import javax.imageio.IIOException;
import java.io.IOException;

// BEGIN
@Value
// END
class Car {
    static ObjectMapper mapper = new ObjectMapper();
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize() throws JsonProcessingException {
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
    }

    public static Car deserialize(String json) throws IOException {
        return mapper.readValue(json, Car.class);
    }
    // END
}
//class Out {
//    public static void main(String[] args) throws IOException {
//        User owner = new User(1, "Ivan", "P", 25);
//        Car car = new Car(1, "bmv", "x5", "black", owner);
//        String jsonRepresentation = car.serialize();
//        System.out.println(jsonRepresentation);
//        Car instance = Car.deserialize(jsonRepresentation);
//        System.out.println(instance.getBrand()); // "bmv"
//        System.out.println(instance.getModel()); // "x5"
//    }
//}