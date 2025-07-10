package tfg.proyecto.TFG.dtos;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DTOeventoBajada {

	private Long id;
	private String nombre;
	private String localizacion;
	private LocalDateTime inicioEvento;
	private LocalDateTime finEvento;
	private List<DTOInvitado> invitados;

}
