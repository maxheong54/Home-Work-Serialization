import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Students student = new Students("Max", 26);

        SerializationExample.serializeObject(student, "Saved Class.json");

        SerializationExample.serializeObject(student, "Saved List.json");

    }
}