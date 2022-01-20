import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import mydb.file.io.FileReader;
import mydb.file.io.FileWriter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String jsonString = "{\"k1\":\"v1\",\"k2\":\"v2\"}";
        String jsonString1 = "{\"k4\":\"v5\",\"k6\":\"v7\"}";
        String jsonString2 = "{\"k51\":\"v441\",\"k322\":\"v12\"}";
        String jsonString3 = "{\"k551\":\"v881\",\"k882\":\"v992\"}";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode actualObj = mapper.readTree(jsonString);
        FileWriter fileWriter = new FileWriter("C:\\Users\\REFAEL\\Desktop\\STDb\\db.txt");
        fileWriter.writeRow(mapper.readTree(jsonString));
        fileWriter.writeRow(mapper.readTree(jsonString1));
        fileWriter.writeRow(mapper.readTree(jsonString2));
        fileWriter.writeRow(mapper.readTree(jsonString3));
    }
}
