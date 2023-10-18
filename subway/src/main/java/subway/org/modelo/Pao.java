package subway.org.modelo;

import java.util.List;

public class Pao {
    String type_of_bread;
    String filling;
    List<String> sauce;
    String more;


    public String getType_of_bread() {
        return type_of_bread;
    }

    public void setType_of_bread(String type_of_bread) {
        this.type_of_bread = type_of_bread;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public List<String> getSauce() {
        return sauce;
    }

    public void setSauce(List<String> sauce) {
        this.sauce = sauce;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    @Override
    public String toString() {
        return "Pao{" +
                "type_of_bread='" + type_of_bread + '\'' +
                ", filling='" + filling + '\'' +
                ", sauce=" + sauce +
                ", more='" + more + '\'' +
                '}';
    }
}