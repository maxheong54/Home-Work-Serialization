import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

/*
   Класс, который содержит статические методы для сериализации и десериализации объектов
   с использованием библиотеки Jackson.
*/

public class SerializationExample {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void serializeObject(Object object, String fileName) {
        try {
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(new File(fileName), object);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static <T> T deserializeObject(String fileName, Class <T> valueType) {
        T object = null;
        try {
            object = mapper.readValue(new File(fileName), valueType);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return object;
    }
}
