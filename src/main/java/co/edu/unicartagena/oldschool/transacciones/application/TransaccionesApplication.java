package co.edu.unicartagena.oldschool.transacciones.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "co.edu.unicartagena.oldschool.transacciones")
public class TransaccionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransaccionesApplication.class, args);
	}

}
