package tfg.proyecto.TFG.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tfg.proyecto.TFG.modelo.Ticket;
@Repository
public interface RepositorioTicket extends CrudRepository<Ticket, Long>{

}
