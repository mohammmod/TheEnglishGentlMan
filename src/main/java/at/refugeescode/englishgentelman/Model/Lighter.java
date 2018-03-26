package at.refugeescode.englishgentelman.Model;

import java.util.Optional;

public class Lighter {
    public Optional<Lighter> lightIt() {
        Optional<Lighter> lighter = Optional.of(new Lighter());
        return lighter;
    }
}
