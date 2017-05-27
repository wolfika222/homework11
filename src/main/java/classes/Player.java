package classes;

/**
 * Created by Hp_Workplace on 2017. 05. 27..
 */
public class Player {

    private String def;

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    @Override
    public String toString() {
        return "Player{" +
                "def='" + def + '\'' +
                '}';
    }
}
