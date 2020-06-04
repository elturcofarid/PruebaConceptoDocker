package co.gov.icfes.misional.cache.controladores;

import org.springframework.web.bind.annotation.RestController;
import co.gov.icfes.misional.cache.iservicios.IZonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/redis")
public class DivipolaControlador {    

	@Autowired
	private IZonaServicio IZona;
	
	@Cacheable(cacheNames = "divipola")
	@RequestMapping(value = "/divi/all", method = RequestMethod.GET)
    public Object getZonas() {		
     return IZona.zonasActivas(); 
    }
}
