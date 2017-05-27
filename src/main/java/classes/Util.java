package classes;

import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Hp_Workplace on 2017. 05. 27..
 */
public class Util {

    public void printYoutubeJSON(String path) throws IOException {

        byte[] jsonData = Files.readAllBytes(Paths.get(path));
        ObjectMapper objectMapper = new ObjectMapper();
        YoutubePojo youtubePojo = objectMapper.readValue(jsonData, YoutubePojo.class);

        System.out.println(youtubePojo.toString());
    }

    public void convertYoutubeJSONtoXML(String source, String path){

    }
}
