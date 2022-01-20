package mydb.fileworking.io;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader extends FileIO{
    private FileInputStream fileInputStream;
    private ObjectMapper objectMapper;

    public FileReader(String file) throws IOException {
        super(file);
        this.fileInputStream = new FileInputStream(file);
        this.objectMapper = new ObjectMapper();
    }

    public FileInputStream getFileInputStream() {
        return fileInputStream;
    }

    public void setFileInputStream(FileInputStream fileInputStream) {
        this.fileInputStream = fileInputStream;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    /*
    im doing this for only one record because i will work with threads so i will take at a time for better runtime
    */
    public JsonNode GetRecord(int lineNumber)
    {
        try (Stream<String> lines = Files.lines(Paths.get(this.file))) {
            return this.objectMapper.readTree(lines.skip(lineNumber - 1).findFirst().get());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
