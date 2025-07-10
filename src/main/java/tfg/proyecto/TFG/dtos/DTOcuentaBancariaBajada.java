package tfg.proyecto.TFG.dtos;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DTOcuentaBancariaBajada {
	private Long id;
	private String nombrePropietario;
	private String nombreBanco;
	private String IBAN;
	private String BIC;
	private Float saldo; // saldo disponible

}
