package it.epicode.spring.data;

import it.epicode.spring.data.entities.AppConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RunnerJpa  implements CommandLineRunner {

    @Autowired
    AppConfig appConfig;



    @Override
    public void run(String... args) throws Exception {

    }
}
