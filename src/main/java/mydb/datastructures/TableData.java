package mydb.datastructures;

import com.fasterxml.jackson.databind.JsonNode;
import netscape.javascript.JSObject;

import java.util.List;

public class TableData {
    private List<JsonNode> data;

    public TableData(List<JsonNode> data) {
        this.data = data;
    }

    public List<JsonNode> getData() {
        return data;
    }

    public void setData(List<JsonNode> data) {
        this.data = data;
    }

    public void addRow(JsonNode row)
    {
        this.data.add(row);
    }
}