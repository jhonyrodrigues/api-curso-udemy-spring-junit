package br.com.udemy.api.config;

import br.com.udemy.api.domain.User;
import br.com.udemy.api.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@RequiredArgsConstructor
@Configuration
@Profile("local")
public class LocalConfig {

    private final UserRepository repository;

    @Bean
    public void startDB() {
        User u1 = new User(null, "Jhony", "jhony.o_rodrigues@hotmail.com", "123");
        User u2 = new User(null, "Stephanie", "stephanie@hotmail.com", "123");

        repository.saveAll(List.of(u1, u2));
    }
}
