package at.refugeescode.englishgentelman.Model;

import java.util.Optional;

public class Cigar {
   public Optional<Cigar> cigar(){
       Optional<Cigar> cigar = Optional.of(new Cigar());
       return cigar;
   }
}
