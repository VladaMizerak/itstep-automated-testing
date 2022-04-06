package Task_5;

import Task_4.reflection.CustomClass;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class JsonSerial {

    public static void main(String[] args){

        //json init
        JSONObject jsonObject = new JSONObject();
        System.out.println(jsonObject);

        jsonObject.put("field1", "value1");

        //json to object
        ObjectMapper objectMapper = new ObjectMapper();
        CustomClass object = null;
        try {
            object = objectMapper.readValue(jsonObject.toString(), CustomClass.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(object);

        //object to json
        object.setField3(653);
        JSONObject jsonObject2 = new JSONObject(object);
        System.out.println(jsonObject2);

        //text to json
        //object = objectMapper.readValue(jsonObject.toString(), CustomClass.class);

        //json to file
        File file = new File("tmp.json");

        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(jsonObject2.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //file to json
        String content = null;
        try {
            content = Files.readString(Path.of(file.getAbsolutePath()));
            System.out.println(new JSONObject(object));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print(content);

        //json navigation (array, get, keySet)
        jsonObject2.put("arrayField", new JSONArray());
        jsonObject2.getJSONArray("arrayField").put(new JSONObject("{\"field666\":\"666\"}"));
        System.out.println(jsonObject2);

        //json to map
        Map<String, Object> jsonMap = jsonObject2.toMap();
        System.out.println(jsonMap);

        //map to json
        jsonMap.put("mapField", "mapField");
        System.out.println(new JSONObject(jsonMap));



    }
}
