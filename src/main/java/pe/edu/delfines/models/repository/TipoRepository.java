package pe.edu.delfines.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.delfines.models.entity.Tipo;

@Repository
public interface TipoRepository extends JpaRepository<Tipo, String> {

}
