package at.refugeescode.englishgentelman.Model;

import at.refugeescode.englishgentelman.Model.Monoloc;

import java.util.Optional;

public class NewsPaper {
    public Optional<NewsPaper> newsPaper(){
        Optional<NewsPaper> newsPaper = Optional.of(new NewsPaper());
        return newsPaper;

    }

}
