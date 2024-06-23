package com.example.templatedemo;

import org.springframework.stereotype.Component;

@Component
public class CsvDataProcessor extends DataProcessor {

    @Override
    protected void processDataInternal() {
        System.out.println("Processing CSV data");
    }
}