package io.pragra.learning.framework.data;

import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSVDataProvider {
    private String fileName = "data.csv";
    private List<Object[]> data ;

    public CSVDataProvider() {
        data = new ArrayList<>();
        Path path = Paths.get("src/test/resources", fileName);
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line: lines ){
                data.add(line.split(","));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DataProvider
    public Iterator<Object[]> contactSaleProvider(){
        return data.iterator();
    }
}
