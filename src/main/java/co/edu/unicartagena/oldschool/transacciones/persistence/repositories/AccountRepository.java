package co.edu.unicartagena.oldschool.transacciones.persistence.repositories;

import co.edu.unicartagena.oldschool.transacciones.persistence.model.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity, String> {
}
