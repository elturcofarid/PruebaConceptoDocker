package co.gov.icfes.misional.cache.entidades;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the DIPO_ZONA database table.
 * 
 */
@Entity
@Table(name = "DIPO_ZONA")
@NamedQueries({
		@NamedQuery(name = "Zona.findByEstado",
		query = "select z from Zona z where z.estado = 'A' "),
		@NamedQuery(name = "Zona.findById",
		query = "select z from Zona z where z.idZona = :id "),
})
public class Zona  implements Serializable{

	private static final long serialVersionUID = 1L;
	

	
	@Id
	@Column(name = "ZONA_ID")
	private Long idZona;

	@Column(name = "ZONA_ESTADO")
	private String estado;

	@Column(name = "ZONA_NOMBRE")
	private String nombre;

	public Zona() {
	}

	public Zona(Long idZona, String estado, String nombre) {
		super();
		this.idZona = idZona;
		this.estado = estado;
		this.nombre = nombre;
	}
	
	public Long getIdZona() {
		return idZona;
	}

	public void setIdZona(Long idZona) {
		this.idZona = idZona;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}






}