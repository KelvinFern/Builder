package subway.org.modelo;

import subway.org.interfaces.Builder;

import java.util.List;

public class PaoBuilder implements Builder<PaoBuilder, Pao> {

    private final String bread;
    private String filling;
    private List<String> sauce;
    private String more;

    //required
    public PaoBuilder(String b){
        this.bread = b;
    }

    @Override
    public PaoBuilder filling(String r) {
        this.filling = r;
        return this;
    }

    @Override
    public PaoBuilder sauce(List<String> m) {
        this.sauce = m;
        return this;
    }

    @Override
    public PaoBuilder more(String m) {
        this.more = m;
        return this;
    }

    @Override
    public Pao createdBread() {
        Pao pao = new Pao();
        pao.setType_of_bread(this.bread);
        pao.setFilling(this.filling);
        pao.setSauce(this.sauce);
        pao.setMore(this.more);
        return pao;

    }
}