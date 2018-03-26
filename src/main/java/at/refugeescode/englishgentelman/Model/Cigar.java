package at.refugeescode.englishgentelman.Model;

import java.util.Optional;

public class Cigar {
    public boolean smoke(Optional<Lighter> lighter) {
        if (lighter.isPresent()){
            return true;
        }
        return false;
    }
}
