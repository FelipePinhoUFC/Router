package br.ufc.conbo.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.ufc.conbo.model.Projeto;

@Repository
@Transactional
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

}
