package com.example.templatedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataProcessingController {

    private final DataProcessingService dataProcessingService;

    @Autowired
    public DataProcessingController(DataProcessingService dataProcessingService) {
        this.dataProcessingService = dataProcessingService;
    }

    @GetMapping("/process/csv")
    public String processCsvData() {
        dataProcessingService.processCsvData();
        return "CSV data processed";
    }

    @GetMapping("/process/json")
    public String processJsonData() {
        dataProcessingService.processJsonData();
        return "JSON data processed";
    }
}
