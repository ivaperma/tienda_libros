package ipm.tienda_libros;

import ipm.tienda_libros.vista.LibroForm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.*;

@SpringBootApplication
public class TiendaLibrosApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext contextoSpring = new SpringApplicationBuilder(TiendaLibrosApplication.class)
                .headless(false)
                .web(WebApplicationType.NONE)
                .run(args);
        // Ejecutamos código para cargar el formulario
        EventQueue.invokeLater(() -> {
            // Obtenemos el objeto form a través de Spring
            LibroForm libroForm = contextoSpring.getBean(LibroForm.class);
            libroForm.setVisible(true);
        });
    }

}
