package tfg.proyecto.TFG.dtos;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DTOInvitado {
	private String nombre;
    private String apellidos;
    private String fotoURL;
    private String descripcion;
}
