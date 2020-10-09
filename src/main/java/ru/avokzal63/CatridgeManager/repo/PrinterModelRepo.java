package ru.avokzal63.CatridgeManager.repo;

import org.springframework.data.repository.CrudRepository;
import ru.avokzal63.CatridgeManager.domain.PrinterModel;

import java.util.List;

public interface PrinterModelRepo extends CrudRepository<PrinterModel, Long> {
    List<PrinterModel> findAll();

}
