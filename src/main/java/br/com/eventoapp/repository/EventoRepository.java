package br.com.eventoapp.repository;

import br.com.eventoapp.models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<Evento, String> {
    Evento findByCodigo(long codigo);

}
