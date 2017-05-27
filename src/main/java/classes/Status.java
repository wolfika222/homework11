package classes;

/**
 * Created by Hp_Workplace on 2017. 05. 27..
 */
public class Status {

    private String reason;
    private String value;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Status{" +
                "reason='" + reason + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
