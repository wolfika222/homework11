package classes;

/**
 * Created by Hp_Workplace on 2017. 05. 27..
 */
public class Content {

    private String one;
    private String five;
    private String six;

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getFive() {
        return five;
    }

    public void setFive(String five) {
        this.five = five;
    }

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    @Override
    public String toString() {
        return "Content{" +
                "one='" + one + '\'' +
                ", five='" + five + '\'' +
                ", six='" + six + '\'' +
                '}';
    }
}
