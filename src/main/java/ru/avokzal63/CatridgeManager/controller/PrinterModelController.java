package ru.avokzal63.CatridgeManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.avokzal63.CatridgeManager.domain.PrinterModel;
import ru.avokzal63.CatridgeManager.service.PrinterModelService;

@Controller
@RequestMapping("/printer_model")
public class PrinterModelController {
    @Autowired
    private PrinterModelService printerModelService;
    @PostMapping
    public String add(PrinterModel printerModel) {
        printerModelService.add(printerModel);
        return "redirect:printer_model";
    }

    @GetMapping
    public String listAll(Model model) {
        model.addAttribute("printerModels", printerModelService.listAll());

        return "printerModel";

    }

}
