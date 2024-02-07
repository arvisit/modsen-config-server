package by.arvisit.modsenlibapp.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ModsenConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModsenConfigServerApplication.class, args);
    }

}
