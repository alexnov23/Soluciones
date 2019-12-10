package pe.edu.delfines.models.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.delfines.models.entity.Habitacion;

@Repository
public interface HabitacionRepository extends JpaRepository<Habitacion, Integer> {

	Optional<Habitacion> findById(Integer id);

	/*List<Habitacion> fetchMenorPrecio(Float precio);*/
	
}
