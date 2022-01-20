package mydb.datastructure;

import com.fasterxml.jackson.databind.JsonNode;
import netscape.javascript.JSObject;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class TableData implements Serializable {
    private List<JsonNode> data;

    public TableData(){
        this.data = new LinkedList<>();
    }

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
