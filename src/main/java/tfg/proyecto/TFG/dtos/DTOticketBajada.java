package tfg.proyecto.TFG.dtos;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class DTOticketBajada {
	private Long id;
	private Long usuarioId; // Fk
	private Long eventoId; // Fk
	private String codigoQR;
	private LocalDateTime fechaCompra; // guardar la fecha actual
}
