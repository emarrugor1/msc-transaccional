package co.edu.unicartagena.oldschool.transacciones.persistence.service;

import co.edu.unicartagena.oldschool.transacciones.persistence.repositories.AccountRepository;
import co.edu.unicartagena.oldschool.transacciones.persistence.repositories.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PersistenceServiceImpl implements PersistenceService{
    private final UserRepository userRepository;
    private final AccountRepository accountRepository;

}
