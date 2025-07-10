package tfg.proyecto.TFG.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tfg.proyecto.TFG.modelo.Usuario;
@Repository
public interface RepositorioUsuario extends CrudRepository<Usuario, Long> {

}
