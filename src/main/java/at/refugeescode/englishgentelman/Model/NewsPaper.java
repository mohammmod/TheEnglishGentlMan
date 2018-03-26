package at.refugeescode.englishgentelman.Model;

import at.refugeescode.englishgentelman.Model.Monoloc;

import java.util.Optional;

public class NewsPaper {

    public boolean read(Optional<Monoloc> monoloc) {
        if (monoloc.isPresent()){
            return true ;
        }
        else{
            return false;
        }
    }
}
