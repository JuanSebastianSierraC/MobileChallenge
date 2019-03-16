package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class GetConfigData {
    String result = "";
    InputStream inputStream;
    String urlOfTestConfig = "C:/Users/jsierra/Documents/mobileChallenge/src/main/resources/testConfig.properties";

    public String getConfigValues() throws IOException {
        try {
            Properties config = new Properties();
            String testConfig = "testConfig.properties";

            inputStream = new FileInputStream(urlOfTestConfig);

            if(inputStream != null){
                config.load(inputStream);
            }else{
                throw new FileNotFoundException("Config data file'" + testConfig + "' not found in the class path");
            }
            Date time = new Date(System.currentTimeMillis());

            String name = config.getProperty("name");
            String lastName = config.getProperty("lastName");
            String userName = config.getProperty("userName");
            String email = config.getProperty("email");
            String password = config.getProperty("password");
            String url = config.getProperty("url");

            result = "name = " + name + "last name = " + lastName + " username =" + userName + " email = "+email+
                    " password = "+password + "url = " +url;
            System.out.println(result +"\nprogram ran on " + time +" by user =" + name);
        } catch (IOException e) {
            System.out.println("Exception: "+ e);
        }finally {
            inputStream.close();
        }
        return result;
    }

    public String getUserName() throws IOException {
        try {
            Properties config = new Properties();
            String testConfig = "testConfig.properties";

            inputStream = new FileInputStream(urlOfTestConfig);

            if(inputStream != null){
                config.load(inputStream);
            }else{
                throw new FileNotFoundException("Config data file'" + testConfig + "' not found in the class path");
            }
            String userName = config.getProperty("userName");
            return userName;
        } catch (IOException e) {
            System.out.println("Exception: "+ e);
        }finally {
            inputStream.close();
        }
        return "";
    }
    public String getPassword() throws IOException {
        try {
            Properties config = new Properties();
            String testConfig = "testConfig.properties";

            inputStream = new FileInputStream(urlOfTestConfig);

            if(inputStream != null){
                config.load(inputStream);
            }else{
                throw new FileNotFoundException("Config data file'" + testConfig + "' not found in the class path");
            }
            String password = config.getProperty("password");
            return password;
        } catch (IOException e) {
            System.out.println("Exception: "+ e);
        }finally {
            inputStream.close();
        }
        return "";
    }
    public String getUrl() throws IOException {
        try {
            Properties config = new Properties();
            String testConfig = "testConfig.properties";

            inputStream = new FileInputStream(urlOfTestConfig);

            if(inputStream != null){
                config.load(inputStream);
            }else{
                throw new FileNotFoundException("Config data file'" + testConfig + "' not found in the class path");
            }
            String url = config.getProperty("url");
            return url;
        } catch (IOException e) {
            System.out.println("Exception: "+ e);
        }finally {
            inputStream.close();
        }
        return "";
    }

    public String getBadPassword() throws IOException {
        try {
            Properties config = new Properties();
            String testConfig = "testConfig.properties";

            inputStream = new FileInputStream(urlOfTestConfig);

            if(inputStream != null){
                config.load(inputStream);
            }else{
                throw new FileNotFoundException("Config data file'" + testConfig + "' not found in the class path");
            }
            String badPassword = config.getProperty("badPassword");
            return badPassword;
        } catch (IOException e) {
            System.out.println("Exception: "+ e);
        }finally {
            inputStream.close();
        }
        return "";
    }

    public String getCardNumber() throws IOException {
        try {
            Properties config = new Properties();
            String testConfig = "testConfig.properties";

            inputStream = new FileInputStream(urlOfTestConfig);

            if(inputStream != null){
                config.load(inputStream);
            }else{
                throw new FileNotFoundException("Config data file'" + testConfig + "' not found in the class path");
            }
            String cardNumber = config.getProperty("cardNumber");
            return cardNumber;
        } catch (IOException e) {
            System.out.println("Exception: "+ e);
        }finally {
            inputStream.close();
        }
        return "";
    }

    public String getExpDate() throws IOException {
        try {
            Properties config = new Properties();
            String testConfig = "testConfig.properties";

            inputStream = new FileInputStream(urlOfTestConfig);

            if(inputStream != null){
                config.load(inputStream);
            }else{
                throw new FileNotFoundException("Config data file'" + testConfig + "' not found in the class path");
            }
            String expDate = config.getProperty("expDate");
            return expDate;
        } catch (IOException e) {
            System.out.println("Exception: "+ e);
        }finally {
            inputStream.close();
        }
        return "";
    }

    public String getCode() throws IOException {
        try {
            Properties config = new Properties();
            String testConfig = "testConfig.properties";

            inputStream = new FileInputStream(urlOfTestConfig);

            if(inputStream != null){
                config.load(inputStream);
            }else{
                throw new FileNotFoundException("Config data file'" + testConfig + "' not found in the class path");
            }
            String code = config.getProperty("code");
            return code;
        } catch (IOException e) {
            System.out.println("Exception: "+ e);
        }finally {
            inputStream.close();
        }
        return "";
    }
}