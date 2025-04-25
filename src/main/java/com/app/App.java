package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.Controller.SearchController;

/**
 * This class starts the Spring Boot application, allowing you to manually test the API
 * using tools such as Postman, cURL, or Thunder Client.
 * See {@link com.app.Controller.SearchController} for the implemented endpoints.
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(App.class);

        // Retrieving a bean from the context
        SearchController controller = applicationContext.getBean(SearchController.class);
        System.out.println("Controller Bean: " + controller);
    }
}