package co.edu.unicartagena.oldschool.transacciones.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Account {
    private String username;
    private double totalMoney;
}
