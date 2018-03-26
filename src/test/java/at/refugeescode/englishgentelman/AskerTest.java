package at.refugeescode.englishgentelman;

import at.refugeescode.englishgentelman.Controller.Asker;
import at.refugeescode.englishgentelman.Model.Cigar;
import at.refugeescode.englishgentelman.Model.Lighter;
import at.refugeescode.englishgentelman.Model.Monoloc;
import at.refugeescode.englishgentelman.Model.NewsPaper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AskerTest {

    private Cigar cigar;
    private Lighter lighter;
    private Monoloc monoloc;
    private NewsPaper newsPaper;
    private Asker asker;

    @BeforeEach
    void initialize() {
        cigar =new Cigar();
        lighter = new Lighter();
        monoloc = new Monoloc();
        newsPaper = new NewsPaper();
        asker =new Asker();
    }
    @Test
    void askTheEnglishManIfHeHadGoodDay() {
        boolean smoke = cigar.smoke(lighter.lightIt());
        boolean read = newsPaper.read(monoloc.getMonoloc());

        String englishManFeeling = asker.askTheEnglishManIfHeHadGoodDay(smoke, read);
        String expacted = "I have GOOD Day";
        Assertions.assertEquals(expacted,englishManFeeling);


    }
}