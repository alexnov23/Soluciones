package pe.edu.delfines;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import pe.edu.delfines.models.entity.Habitacion;
import pe.edu.delfines.models.repository.HabitacionRepository;
import pe.edu.delfines.models.repository.TipoRepository;
import pe.edu.delfines.models.entity.Tipo;

@RunWith(SpringRunner.class)
@SpringBootTest
class DelfinesApplicationTests {

	@Autowired
	private TipoRepository tipoRepository;
	
	@Autowired
	private HabitacionRepository habitacionRepository;
	
	@Test
	void contextLoads() {
		
		try {
			
			// Habitaciones
			Habitacion habitacion1 = new Habitacion();
			habitacion1.setId(1);
			habitacion1.setNumeroCamas(4);
			habitacion1.setDescripcion("Tiene televisor");
			habitacion1.setPrecio(500F);
			habitacion1.setObservacion("Esta muy limpia");
			Habitacion habitacion2 = new Habitacion();
			habitacion2.setId(2);
			habitacion2.setNumeroCamas(2);
			habitacion2.setDescripcion("Tiene tv");
			habitacion2.setPrecio(300F);
			habitacion2.setObservacion("Esta limpia");
			Habitacion habitacion3 = new Habitacion();
			habitacion3.setId(3);
			habitacion3.setNumeroCamas(5);
			habitacion3.setDescripcion("Tiene televisor");
			habitacion3.setPrecio(100F);
			habitacion3.setObservacion("Esta muy limpia");
			
			habitacion1 = habitacionRepository.save(habitacion1);
			habitacion2 = habitacionRepository.save(habitacion2);
			habitacion3 = habitacionRepository.save(habitacion3);
			
			// Tipos
			Tipo matrimonial = new Tipo();
			matrimonial.setId("1");
			matrimonial.setNombre("Matrimonial");
			Tipo especial = new Tipo();
			especial.setId("2");
			especial.setNombre("Especial");
			Tipo familiar = new Tipo();
			familiar.setId("3");
			familiar.setNombre("Familiar");
			
			matrimonial = tipoRepository.save(matrimonial);
			especial = tipoRepository.save(especial);
			familiar = tipoRepository.save(familiar);
			
			// Relacion Habitacion-Tipo
			habitacion1.setTipo(matrimonial);
			habitacion2.setTipo(especial);
			habitacion3.setTipo(familiar);
			
			// Relacion Tipo-Habitacion
			matrimonial.addHabitacion(habitacion1);
			especial.addHabitacion(habitacion2);
			familiar.addHabitacion(habitacion3);
			
			// grabar
			habitacionRepository.save(habitacion1);
			habitacionRepository.save(habitacion2);
			habitacionRepository.save(habitacion3);
			
			tipoRepository.save(matrimonial);
			tipoRepository.save(especial);
			tipoRepository.save(familiar);			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
