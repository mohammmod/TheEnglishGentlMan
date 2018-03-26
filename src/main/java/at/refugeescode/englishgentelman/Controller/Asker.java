package at.refugeescode.englishgentelman.Controller;

public class Asker {

    public String askTheEnglishManIfHeHadGoodDay(boolean read, boolean smoke) {
        if (read && smoke ==true){
            return "I have GOOD Day";
        }
        return "I had Bad Day";
    }
}
