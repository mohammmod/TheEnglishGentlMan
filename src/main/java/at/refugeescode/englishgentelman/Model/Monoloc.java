package at.refugeescode.englishgentelman.Model;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Monoloc {
    public Optional<Monoloc> getMonoloc(){

         Optional<Monoloc> monoloc = Optional.of(new Monoloc());
         return monoloc;
    }

    public boolean read(NewsPaper newspaper) {
        if (newspaper.newsPaper().isPresent()){
            return true;
        }
        return false;
    }
}
