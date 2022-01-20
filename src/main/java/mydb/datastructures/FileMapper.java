/*
this object is used for working with the database mapper and built on the form of json that contains a hashmap of the objects that declared as primary keys snumbered by lineNumber
*/

package mydb.datastructures;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FileMapper {
    private JsonNode jsonObject;
    private ObjectMapper objectMapper;

    public FileMapper(String[] primaryKeys) {
        this.objectMapper = new ObjectMapper();

    }
}
