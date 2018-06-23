package pl.sda.java7gda.toDoList.configuration;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan()  // ładuje ścieżkę, gdzie ma szukać pozostałych komponentów
public class BasicConfiguration extends WebMvcAutoConfiguration {
// Web MVC - Model View Controller (wzorzec projektowy)


}
