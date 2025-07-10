package tfg.proyecto.TFG.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Embeddable
@Builder
@Data
public class Invitado {
	
	private String nombre;
	private String apellidos;
	private String fotoURL;
	@Column(length = 250) // 250 carracteres maximo
	private String descripcion;

}
