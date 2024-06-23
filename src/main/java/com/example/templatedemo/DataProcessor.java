package com.example.templatedemo;

import org.springframework.stereotype.Component;

@Component
public abstract class DataProcessor {

    // Template method
    public void processData() {
        readData();
        processDataInternal();
        saveData();
    }

    // Concrete method
    private void readData() {
        System.out.println("Reading data");
    }

    // Abstract method to be implemented by subclasses
    protected abstract void processDataInternal();

    // Concrete method
    private void saveData() {
        System.out.println("Saving data");
    }
}
