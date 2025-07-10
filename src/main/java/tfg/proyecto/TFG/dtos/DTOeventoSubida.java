package tfg.proyecto.TFG.dtos;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DTOeventoSubida {
	
	private String nombre;
	private String localizacion;
	private List<DTOInvitado> invitados;
	private LocalDateTime inicioEvento;
	private LocalDateTime finEvento;

}
