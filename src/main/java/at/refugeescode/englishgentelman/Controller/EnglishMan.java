package at.refugeescode.englishgentelman.Controller;

import at.refugeescode.englishgentelman.Controller.Asker;
import at.refugeescode.englishgentelman.Model.Cigar;
import at.refugeescode.englishgentelman.Model.Lighter;
import at.refugeescode.englishgentelman.Model.Monoloc;
import at.refugeescode.englishgentelman.Model.NewsPaper;
import org.springframework.stereotype.Component;

@Component
public class EnglishMan {
    public void EnglishManDay() {
        Monoloc monoloc = new Monoloc();
        NewsPaper newspaper = new NewsPaper();
        Cigar cigar = new Cigar();
        Lighter lighter = new Lighter();
        Asker asker = new Asker();

        boolean read = newspaper.read(monoloc.getMonoloc());
        boolean smoke = cigar.smoke(lighter.lightIt());

        String englishManFeeling = asker.askTheEnglishManIfHeHadGoodDay(read, smoke);

        System.out.println(englishManFeeling);


    }
}
