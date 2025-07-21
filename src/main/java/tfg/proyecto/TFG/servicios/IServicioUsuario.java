package tfg.proyecto.TFG.servicios;

<<<<<<< HEAD
=======
import java.util.List;

import tfg.proyecto.TFG.dtos.DTOusuarioBajada;
import tfg.proyecto.TFG.dtos.DTOusuarioModificarSubida;
import tfg.proyecto.TFG.dtos.DTOusuarioSubida;

>>>>>>> 7bf72fd3a1c13ce7e42151cbc007e26d501b08b5
public interface IServicioUsuario {
	
	DTOusuarioBajada insert(DTOusuarioSubida usuarioDto);
	DTOusuarioBajada update(DTOusuarioModificarSubida usuarioDto);
	Integer deleteById(Long id); //eliminar usuario por id
	DTOusuarioBajada findById(Long id);
	List<DTOusuarioBajada>findAllUsuarios();
	
	
	

}
