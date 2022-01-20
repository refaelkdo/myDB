package mydb.file.io;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class FileWriter extends FileIO{
    private Writer writer;

    public FileWriter(String file) throws IOException {
        super(file);
        this.writer = new java.io.FileWriter(new File(file)) {
        };
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void writeRow(JsonNode row) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        this.writer.write(objectMapper.writeValueAsString(row));
        this.writer.write("\n");
        this.writer.flush();
    }
}
