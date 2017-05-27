package classes;

/**
 * Created by Hp_Workplace on 2017. 05. 27..
 */
public class Thumbnail {

    private String hqDefault;
    private String def;

    public String getHqDefault() {
        return hqDefault;
    }

    public void setHqDefault(String hqDefault) {
        this.hqDefault = hqDefault;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    @Override
    public String toString() {
        return "Thumbnail{" +
                "hqDefault='" + hqDefault + '\'' +
                ", def='" + def + '\'' +
                '}';
    }
}
