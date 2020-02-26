package config;

import controller.ControllerBearPosition;
import controller.ControllerBothPosition;
import controller.ControllerBullPosition;
import controller.ControllerTestBullMts;
import indicator.Percent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.*;

@Configuration
public class ApplicationConfig {

    @Bean
    public Mts getMts() {
        return new Mts();
    }

    @Bean
    public Equal getEqual() {
        return new Equal();
    }

    @Bean
    public Exchange getExchange() {
        return new Exchange();
    }

    @Bean
    public Percent getPercent() {
        return new Percent();
    }

    @Bean
    public Table getTable() {
        return new Table();
    }
// push
    @Bean
    public Start getStart() {
        return new Start();
    }
//test
    @Bean
    public Compare getCompare() {
        return new Compare();
    }

    @Bean
    public ControllerBullPosition getControllerBullPosition() {
        return new ControllerBullPosition();
    }

    @Bean
    public ControllerBearPosition getControllerBearPosition() {
        return new ControllerBearPosition();
    }

    @Bean
    public ControllerBothPosition getControllerBothPosition() {
        return new ControllerBothPosition();
    }

    @Bean
    public ControllerTestBullMts getControllerTestBullMts() {
        return new ControllerTestBullMts();
    }
}
