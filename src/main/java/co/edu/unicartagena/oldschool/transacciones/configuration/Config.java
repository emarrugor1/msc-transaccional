package co.edu.unicartagena.oldschool.transacciones.configuration;

import co.edu.unicartagena.oldschool.transacciones.business.Operations;
import co.edu.unicartagena.oldschool.transacciones.business.OperationsImpl;
import co.edu.unicartagena.oldschool.transacciones.persistence.service.PersistenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class Config {
    private final PersistenceService persistenceService;

    @Bean
    public Operations operations(){
        return new OperationsImpl(persistenceService);
    }
}
