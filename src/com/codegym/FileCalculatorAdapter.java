package com.codegym;

import java.io.File;

public class FileCalculatorAdapter implements FileCalculator {

    @Override
    public long caculateSize(String path) {
        FileUtil fileUtil = new FileUtil();
        File file = new File(path);
        return fileUtil.calculateSize(file);
    }
}
