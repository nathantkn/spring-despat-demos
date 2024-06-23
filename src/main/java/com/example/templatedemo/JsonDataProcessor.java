package com.example.templatedemo;

import org.springframework.stereotype.Component;

@Component
public class JsonDataProcessor extends DataProcessor {

    @Override
    protected void processDataInternal() {
        System.out.println("Processing JSON data");
    }
}
