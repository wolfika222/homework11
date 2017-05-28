package classes;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.json.XML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
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

    public void convertYoutubeJSONtoXML(String source, String path) throws IOException {


        byte[] jsonData = Files.readAllBytes(Paths.get(source));
        ObjectMapper objectMapper = new ObjectMapper();
        YoutubePojo youtubePojo = objectMapper.readValue(jsonData, YoutubePojo.class);


        try {

            File file = new File(path);
            JAXBContext jaxbContext = JAXBContext.newInstance(YoutubePojo.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();


            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(youtubePojo, file);
            jaxbMarshaller.marshal(youtubePojo, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }



    }
}
