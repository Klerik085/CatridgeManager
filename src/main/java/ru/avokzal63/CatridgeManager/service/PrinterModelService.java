package ru.avokzal63.CatridgeManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.avokzal63.CatridgeManager.domain.PrinterModel;
import ru.avokzal63.CatridgeManager.repo.PrinterModelRepo;

import java.util.List;

@Service
public class PrinterModelService {
    @Autowired
    private PrinterModelRepo printerModelRepo;

    public PrinterModel add(String name) {
        PrinterModel printerModel = new PrinterModel();
        printerModel.setName(name);
        printerModelRepo.save(printerModel);
        return printerModel;
    }

    public PrinterModel add(PrinterModel printerModel) {
        printerModelRepo.save(printerModel);
        return printerModel;
    }

    public List<PrinterModel> listAll() {
        return printerModelRepo.findAll();
    }
}
