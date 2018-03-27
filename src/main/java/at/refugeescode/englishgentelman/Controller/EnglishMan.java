package at.refugeescode.englishgentelman.Controller;

import at.refugeescode.englishgentelman.Controller.Asker;
import at.refugeescode.englishgentelman.Model.Cigar;
import at.refugeescode.englishgentelman.Model.Lighter;
import at.refugeescode.englishgentelman.Model.Monoloc;
import at.refugeescode.englishgentelman.Model.NewsPaper;
import org.springframework.stereotype.Component;

@Component
public class EnglishMan {
    private Monoloc monoloc;
    private Lighter lighter;

    public EnglishMan(Monoloc monoloc, Lighter lighter){
        this.lighter= lighter;
        this.monoloc= monoloc;
    }

    public void EnglishManDay() {
        NewsPaper newspaper = new NewsPaper();
        Cigar cigar = new Cigar();
        Asker asker = new Asker();
        boolean read = monoloc.read(newspaper);
        lighter.lightandSmock(cigar);
        boolean smoke = cigar.smoke(lighter.lightIt());

        String englishManFeeling = asker.askTheEnglishManIfHeHadGoodDay(read, smoke);

        System.out.println(englishManFeeling);


    }
}
