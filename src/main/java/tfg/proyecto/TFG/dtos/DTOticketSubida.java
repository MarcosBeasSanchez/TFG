package tfg.proyecto.TFG.dtos;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class DTOticketSubida {
	
	private Long usuarioId; // Fk
	private Long eventoId; // Fk
	//private String codigoQR;
	//private LocalDateTime fechaCompra; //en el servicio guardar la fecha actual
}
