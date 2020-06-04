package co.gov.icfes.misional.cache.controladores;

import org.springframework.web.bind.annotation.RestController;

import co.gov.icfes.misional.cache.iservicios.IZonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/redis")
public class ZonaControlador {

	@Autowired
	private IZonaServicio IZona;

	@Cacheable(cacheNames = "zonas")
	@RequestMapping(value = "/zonas/all", method = RequestMethod.GET)
	public Object getZonas() {
		return IZona.zonasActivas();
	}

	@Cacheable(value = "zona", key = "#key")
	@RequestMapping(value = "/zona/{key}", method = RequestMethod.GET)
	public Object getZona(@PathVariable long key) {
		return IZona.consultarZona(key);
	}
	
	@CacheEvict(cacheNames = "zona", key = "#key")
	@RequestMapping(value = "/zona/elimina/{key}", method = RequestMethod.GET)
	public void eliminarObjeto(String key){
	   // log.info("Elimanado del cache el objeto '{}'!", key);
	    System.out.println("Elimanado del cache el objeto '{}'!" + key);
	}
	
	@CacheEvict(cacheNames = "zonas")
	@RequestMapping(value = "/zona/elimina/all", method = RequestMethod.GET)
	public void eliminarObjetoZona(){
	   // log.info("Elimanado del cache el objeto '{}'!", key);
	    System.out.println("Elimanado del cache el objeto '{}'!" + "Zonas");
	}

}
