package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Deth8 {

    @Autowired
    private  Egg6 egg6;

    @Override
    public String toString() {
        return egg6.toString();
    }
}
