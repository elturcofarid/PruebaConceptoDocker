package co.gov.icfes.misional.cache.iservicios;

import java.util.List;
import co.gov.icfes.misional.cache.entidades.Zona;

public interface IZonaServicio {
       List<Zona> zonasActivas();
       
       Zona consultarZona(long id);
}
