package at.refugeescode.englishgentelman.Model;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Lighter {
    public Optional<Lighter> lightIt() {
        Optional<Lighter> lighter = Optional.of(new Lighter());
        return lighter;
    }

    public boolean lightandSmock(Cigar cigar) {
        if (cigar.cigar().isPresent()){
            return true;
        }
        return false;

    }
}
