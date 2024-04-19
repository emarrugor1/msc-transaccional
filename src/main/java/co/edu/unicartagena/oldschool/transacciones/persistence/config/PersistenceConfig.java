package co.edu.unicartagena.oldschool.transacciones.persistence.config;

import co.edu.unicartagena.oldschool.transacciones.persistence.repositories.AccountRepository;
import co.edu.unicartagena.oldschool.transacciones.persistence.repositories.UserRepository;
import co.edu.unicartagena.oldschool.transacciones.persistence.service.PersistenceService;
import co.edu.unicartagena.oldschool.transacciones.persistence.service.PersistenceServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("co.edu.unicartagena.oldschool.transacciones.persistence.model")
@EnableJpaRepositories(basePackages = "co.edu.unicartagena.oldschool.transacciones.persistence.repositories")
@RequiredArgsConstructor
public class PersistenceConfig {
    private final UserRepository userRepository;
    private final AccountRepository accountRepository;

    @Bean
    public PersistenceService persistenceService(){
        return new PersistenceServiceImpl(userRepository, accountRepository);
    }

}
