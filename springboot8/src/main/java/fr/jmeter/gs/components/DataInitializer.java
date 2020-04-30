package fr.jmeter.gs.components;

import fr.jmeter.gs.entities.User;
import fr.jmeter.gs.repositories.UserRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DataInitializer implements ApplicationRunner {

    private final UserRepository userRepository;

    public DataInitializer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void run(ApplicationArguments applicationArguments) throws Exception {

        System.out.println("Initialisation des données au démarrage de l'application");
        this.userRepository.findAll().forEach((u) -> System.out.println("User : " + u.getFirstName()));

    }
}
