package com.codegym;

public class Client {
    private FileCalculator fileCalculator;

    public Client(FileCalculator fileCalculator){
        this.fileCalculator = fileCalculator;
    }

    public void printFileSize(String path){
        long size = fileCalculator.caculateSize(path);
        System.out.println("Size: " + size);
    }
}
