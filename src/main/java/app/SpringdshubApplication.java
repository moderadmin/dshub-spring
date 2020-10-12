package app;

import dshub.DSHubInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"app", "dshub"})
public class SpringdshubApplication {


    public static void main(String[] args) {
        System.out.println("rthrthtrh");


        var context =  SpringApplication.run(SpringdshubApplication.class, args);
        var ds = context.getBean(DSHubInitializer.class);
        ds.runCLI(args);
    }

}