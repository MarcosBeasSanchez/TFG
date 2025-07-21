package tfg.proyecto.TFG.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfg.proyecto.TFG.config.DtoConverter;
import tfg.proyecto.TFG.dtos.DTOusuarioBajada;
import tfg.proyecto.TFG.dtos.DTOusuarioModificarSubida;
import tfg.proyecto.TFG.dtos.DTOusuarioSubida;
import tfg.proyecto.TFG.modelo.Usuario;
import tfg.proyecto.TFG.repositorio.RepositorioCuentaBancaria;
import tfg.proyecto.TFG.repositorio.RepositorioEvento;
import tfg.proyecto.TFG.repositorio.RepositorioTicket;
import tfg.proyecto.TFG.repositorio.RepositorioUsuario;

@Service
public class ServicioUsuarioImpl implements IServicioUsuario {

	@Autowired
	RepositorioUsuario repoUsuario;
	@Autowired
	RepositorioCuentaBancaria repoCuentaBancaria;
	@Autowired
	RepositorioEvento repoEvento;
	@Autowired
	RepositorioTicket repoTicket;
	@Autowired
	DtoConverter dtoConverter;

	@Override
	public DTOusuarioBajada insert(DTOusuarioSubida usuarioDto) {
		Usuario usuario;
		DTOusuarioBajada dtoBajada;

		usuario = dtoConverter.map(usuarioDto, Usuario.class);
		repoUsuario.save(usuario);

		dtoBajada = dtoConverter.map(usuario, DTOusuarioBajada.class);
		return dtoBajada;
	}

	@Override
	public DTOusuarioBajada update(DTOusuarioModificarSubida usuarioDto) {
		Usuario usuario;
		DTOusuarioBajada dtoBajada;

		if (repoUsuario.existsById(usuarioDto.getId())) {
			usuario = dtoConverter.map(usuarioDto, Usuario.class);
			repoUsuario.save(usuario);
			dtoBajada = dtoConverter.map(usuario, DTOusuarioBajada.class);
		} else {
			dtoBajada = null; // sino existe el id devuelve null
		}

		return dtoBajada;
	}

	@Override
	public Integer deleteById(Long id) {
		Integer nfilas = 0;

		if (repoUsuario.existsById(id)) {
			repoUsuario.deleteById(id); // elimina el usuario tener cuidado con cuentaBancaria
			nfilas = 1;
		}
		return nfilas;
	}
	
	//devuelve nulo si no lo encuentra
	@Override
	public DTOusuarioBajada findById(Long id) { 
		DTOusuarioBajada dtobajada;
		Usuario usuario;

		if (repoUsuario.existsById(id)) {
			usuario = repoUsuario.findById(id).get();
			dtobajada = dtoConverter.map(usuario, DTOusuarioBajada.class);
		} else {
			dtobajada = null;
		}
		return dtobajada;
	}

	@Override
	public List<DTOusuarioBajada> findAllUsuarios() {
	    return dtoConverter.mapAll((List<Usuario>) repoUsuario.findAll(), DTOusuarioBajada.class);

	}

}
