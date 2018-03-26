package at.refugeescode.englishgentelman.Model;

import java.util.Optional;

public class Monoloc {
    public Optional<Monoloc> getMonoloc(){

         Optional<Monoloc> monoloc = Optional.of(new Monoloc());
         return monoloc;
    }

}
