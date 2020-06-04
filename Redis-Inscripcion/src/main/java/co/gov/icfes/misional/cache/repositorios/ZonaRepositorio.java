package co.gov.icfes.misional.cache.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.gov.icfes.misional.cache.entidades.Zona;

@Repository
public interface ZonaRepositorio extends CrudRepository<Zona,Long>{
	   List<Zona> findByEstado();
	   
	 
	   Zona findById (long id);
	   
	   
}
