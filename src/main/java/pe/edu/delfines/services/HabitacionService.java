package pe.edu.delfines.services;

import java.util.List;
import java.util.Optional;

import pe.edu.delfines.models.entity.Habitacion;

public interface HabitacionService extends CrudService<Habitacion, Integer>{

	Optional<Habitacion> findById(Integer id) throws Exception;

	/*List<Habitacion> fetchMenorPrecio(Float precio) throws Exception;*/
}
