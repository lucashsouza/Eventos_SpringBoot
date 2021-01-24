package br.com.eventoapp.repository;

import br.com.eventoapp.models.Convidado;
import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
}
