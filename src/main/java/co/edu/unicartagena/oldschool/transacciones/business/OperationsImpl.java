package co.edu.unicartagena.oldschool.transacciones.business;

import co.edu.unicartagena.oldschool.transacciones.persistence.service.PersistenceService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OperationsImpl implements Operations{
    private final PersistenceService persistenceService;
}
