package it.epicode.demo.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = " Luigi")
    public Utente LuigiBean(){
        return Utente.builder()
                .withUsername("igi93")
                .withNome("Luigi")
                .withCognome("Guajana")
                .withEmail("luigi@guajana.com")
                .build();
    }

    @Bean(name = "Filippo")
    public Utente FilippoBean(){
        return Utente.builder()
                .withUsername("filip90")
                .withNome("Filippo")
                .withCognome("Cosentino")
                .withEmail("filippo@cosentino.com")
                .build();
    }

    @Bean(name = "Paolo")
    public Utente PaoloBean(){
        return Utente.builder()
                .withUsername("paolo50")
                .withNome("Paolo")
                .withCognome("Rossi")
                .withEmail("paolo@rossi.com")
                .build();
    }

    @Bean(name = "palazzo01")
    public Edificio primoEdificio(){
        return Edificio.builder()
                .withCitta("Palermo")
                .withIndirizzo("piazza castelnuovo")
                .withName("palazzo Gallo")
                .build();
    }

    @Bean(name = "palazzo02")
    public Edificio secondoEdificio(){
        return Edificio.builder()
                .withCitta("Roma")
                .withIndirizzo("piazza Ruggero Settimo")
                .withName("palazzo Certosa")
                .build();
    }

    @Bean(name = "palazzo03")
    public Edificio terzoEdificio(){
        return Edificio.builder()
                .withCitta("Napoli")
                .withIndirizzo("via spaccanapoli")
                .withName("palazzo Branciforte")
                .build();
    }

    @Bean(name = "Posto01")
        public Postazioni posto01(){
            return Postazioni.builder()
                    .withDescrizione("prima postazione")
                    .withTipo(TipoPostazione.PRIVATO)
                    .withOccupantiMax(1)
                    .withEdificio(secondoEdificio())
                    .build();
        }

    @Bean(name = "Posto02")
    public Postazioni posto02(){
        return Postazioni.builder()
                .withDescrizione("bellissima")
                .withTipo(TipoPostazione.OPENSPACE)
                .withOccupantiMax(2)
                .withEdificio(primoEdificio())
                .build();
    }

    @Bean(name = "Posto03")
    public Postazioni posto03(){
        return Postazioni.builder()
                .withDescrizione("terzo postazione")
                .withTipo(TipoPostazione.RIUNIONE)
                .withOccupantiMax(3)
                .withEdificio(terzoEdificio())
                .build();
    }






}
