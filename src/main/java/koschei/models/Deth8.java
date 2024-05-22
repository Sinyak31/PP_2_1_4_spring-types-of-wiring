package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Deth8 {
    private final Egg6 egg6;

    public Deth8(Egg6 egg6) {
        this.egg6 = egg6;
    }

    @Override
    public String toString() {
        return egg6.toString();
    }
}
