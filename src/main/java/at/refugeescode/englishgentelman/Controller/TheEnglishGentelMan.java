package at.refugeescode.englishgentelman.Controller;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TheEnglishGentelMan {
    @Bean
    ApplicationRunner mainEnglishMan(EnglishMan englishman){
        return args -> {
            englishman.EnglishManDay();
        };

    }
}
