package mydb.datastructure;

import netscape.javascript.JSObject;

import java.util.List;

public class TableData {
    private List<JSObject> data;

    public TableData(List<JSObject> data) {
        this.data = data;
    }

    public List<JSObject> getData() {
        return data;
    }

    public void setData(List<JSObject> data) {
        this.data = data;
    }

    public void addRow(JSObject row)
    {
        this.data.add(row);
    }
}