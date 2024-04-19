package co.edu.unicartagena.oldschool.transacciones.persistence.mapper;

import co.edu.unicartagena.oldschool.transacciones.domain.User;
import co.edu.unicartagena.oldschool.transacciones.persistence.model.UserEntity;

public class PersistenceMapper {
    private PersistenceMapper() {
    }

    public static UserEntity toUserEntity(User user){
        return UserEntity.builder()
                .typeId(user.getTypeId())
                .numberId(user.getNumberId())
                .username(user.getUsername())
                .password(user.getPassword())
                .firstName(user.getFirstName())
                .middleName(user.getMiddleName())
                .lastName(user.getLastName())
                .secondLastName(user.getSecondLastName())
                .build();
    }
    public static User toUser(UserEntity userEntity){
        return User.builder()
                .typeId(userEntity.getTypeId())
                .numberId(userEntity.getNumberId())
                .username(userEntity.getUsername())
                .password(userEntity.getPassword())
                .firstName(userEntity.getFirstName())
                .middleName(userEntity.getMiddleName())
                .lastName(userEntity.getLastName())
                .secondLastName(userEntity.getSecondLastName())
                .build();
    }
}
