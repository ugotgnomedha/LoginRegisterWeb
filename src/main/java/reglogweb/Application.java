package reglogweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        //String configPath = "/Users/imac/Desktop/all_coding/LoginRegister/logreg.properties";
        String configPath = System.getProperty("logreg");
        ConfigGetter.getConfig(configPath);
    }
}