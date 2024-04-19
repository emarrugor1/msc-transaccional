package co.edu.unicartagena.oldschool.transacciones.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
    private String username;
    private String password;
    private String typeId;
    private String numberId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String secondLastName;

}
