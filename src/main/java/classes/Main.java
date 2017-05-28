package classes;

import java.io.IOException;

/**
 * Created by Hp_Workplace on 2017. 05. 27..
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Util util = new Util();

        util.printYoutubeJSON("C:\\Users\\Hp_Workplace\\IdeaProjects\\homework11\\src\\main\\java\\json\\youtube.json");
        util.convertYoutubeJSONtoXML("C:\\Users\\Hp_Workplace\\IdeaProjects\\homework11\\src\\main\\java\\json\\youtube.json", "C:\\Users\\Hp_Workplace\\IdeaProjects\\homework11\\src\\main\\java\\xml\\youtube.xml");

    }
}
