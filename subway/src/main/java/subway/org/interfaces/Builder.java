package subway.org.interfaces;

import java.util.List;

public interface Builder<k, S>{
    k filling(String r);
    k sauce(List<String> m);
    k more (String m);

    S createdBread();
}