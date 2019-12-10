package pe.edu.delfines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.delfines.models.entity.Habitacion;
import pe.edu.delfines.models.repository.HabitacionRepository;
import pe.edu.delfines.services.HabitacionService;

@Service
public class HabitacionServiceImpl implements HabitacionService{
	
	@Autowired
	private HabitacionRepository habitacionRepository;

	@Transactional(readOnly = true)
	@Override
	public List<Habitacion> findAll() throws Exception{
		return habitacionRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<Habitacion> findById(Integer id) throws Exception{
		return habitacionRepository.findById(id);
	}

	@Transactional
	@Override
	public Habitacion save(Habitacion entity) throws Exception {
		return habitacionRepository.save(entity);
	}

	@Transactional
	@Override
	public Habitacion update(Habitacion entity) throws Exception {
		return habitacionRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		habitacionRepository.deleteById(id);
		
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		habitacionRepository.deleteAll();
	}
	/*
	@Transactional(readOnly = true)
	@Override
	public List<Habitacion> fetchMenorPrecio(Float precio) throws Exception {
		return habitacionRepository.fetchMenorPrecio(precio);
	}*/
}
