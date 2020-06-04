package co.gov.icfes.misional.cache.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.gov.icfes.misional.cache.entidades.Zona;
import co.gov.icfes.misional.cache.iservicios.IZonaServicio;
import co.gov.icfes.misional.cache.repositorios.ZonaRepositorio;

@Service
public class ZonaServicio implements IZonaServicio {

	@Autowired
	ZonaRepositorio zonaRepositorio;
	
	@Override
	public List<Zona> zonasActivas() {
		// TODO Auto-generated method stub
		return zonaRepositorio.findByEstado();
	}
	
	@Override
	public Zona consultarZona(long id) {
		return zonaRepositorio.findById(id);
	}

}
