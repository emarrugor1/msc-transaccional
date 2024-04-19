package co.edu.unicartagena.oldschool.transacciones.persistence.repositories;


import co.edu.unicartagena.oldschool.transacciones.persistence.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
}
