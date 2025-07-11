package tfg.proyecto.TFG.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Cargar Beans para inyectar
    @Bean(initMethod = "inicializarBean", destroyMethod = "finalizarBean")
    DtoConverter dtoConverter() {
	    return new DtoConverter();
	}

}
