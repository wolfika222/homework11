package classes;

/**
 * Created by Hp_Workplace on 2017. 05. 27..
 */
public class YoutubePojo {
    private String apiVersion;
    private Data data;

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "YoutubePojo{" +
                "apiVersion='" + apiVersion + '\'' +
                ", data=" + data +
                '}';
    }
}
