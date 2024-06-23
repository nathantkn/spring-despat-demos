package com.example.templatedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataProcessingService {

    private final CsvDataProcessor csvDataProcessor;
    private final JsonDataProcessor jsonDataProcessor;

    @Autowired
    public DataProcessingService(CsvDataProcessor csvDataProcessor, JsonDataProcessor jsonDataProcessor) {
        this.csvDataProcessor = csvDataProcessor;
        this.jsonDataProcessor = jsonDataProcessor;
    }

    public void processCsvData() {
        csvDataProcessor.processData();
    }

    public void processJsonData() {
        jsonDataProcessor.processData();
    }
}
