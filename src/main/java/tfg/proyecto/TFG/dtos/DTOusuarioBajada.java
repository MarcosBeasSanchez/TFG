package tfg.proyecto.TFG.dtos;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;
import tfg.proyecto.TFG.modelo.Rol;

@Builder
@Data
public class DTOusuarioBajada {
	private Long id;
	private String nombre; 
	private String email;
	private LocalDate fechaNacimiento;
	private Rol rol;
	private DTOcuentaBancariaBajada cuenta;
	private Boolean activo;

}
