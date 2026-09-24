package com.bank.system;


import com.bank.system.domain.model.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.Clock;

@SpringBootApplication
public class Application {
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public Clock clock() {
        return Clock.systemUTC();
    }
    
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*");
            }
        };
    }
    
    // Configuración adicional para asegurar que el contexto de Spring
    // se inicializa correctamente con todas las dependencias necesarias
    @Bean
    public String applicationInfo() {
        System.out.println("Inicializando sistema de gestión de cuentas bancarias");
        System.out.println("Aplicando patrones GRASP: Experto en Información, Creador y Controlador");
        return "Bank Account System Initialized";
    }
}