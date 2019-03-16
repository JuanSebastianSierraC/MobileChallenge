package utils;

import java.io.IOException;

public class TestsConfigReader {
    public static void main(String[] args) throws IOException {
        GetConfigData configData = new GetConfigData();
        System.out.println(configData.getCardNumber());
        System.out.println(configData.getExpDate());
        System.out.println(configData.getCode());
    }
}
