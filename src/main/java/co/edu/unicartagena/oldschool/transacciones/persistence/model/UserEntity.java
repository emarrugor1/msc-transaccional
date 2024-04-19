package co.edu.unicartagena.oldschool.transacciones.persistence.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "type_id")
    private String typeId;
    @Column(name = "number_id")
    private String numberId;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "second_lastname")
    private String secondLastName;
}
