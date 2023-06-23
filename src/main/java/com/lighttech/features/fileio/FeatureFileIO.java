package com.lighttech.features.fileio;

import com.lighttech.features.FeatureBase;
import lombok.Getter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FeatureFileIO extends FeatureBase {

    @Getter
    private final String dataFolderPath = "data/";

    @Getter
    private final String dataFile1 = "data1.txt";


    public FeatureFileIO() {
        super();

        printPWD();
        test1();
    }

    public void printPWD() {
        Path currentRelativePath = Paths.get("");
        String strPath = currentRelativePath.toAbsolutePath().toString();

        report(String.format("[%s=%s]", "CurrentPath", strPath));
    }

    public void test1() {
        String text = null;
        try {
            text = new String(Files.readAllBytes(Paths.get(dataFolderPath + dataFile1)));

            System.out.println(text);
        } catch (IOException e) {
            reportError("Unable to read file", String.format("[fileName=%s]", dataFile1), e);
        }
    }
}
