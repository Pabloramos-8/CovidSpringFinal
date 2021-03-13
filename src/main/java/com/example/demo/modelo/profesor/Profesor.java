package com.example.demo.modelo.profesor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "Profesor")
public class Profesor {

	@Id
	@ApiModelProperty(value = "identificador del profesor", dataType = "String", position = 1, example = "1")
    @Column(name = "id",unique=true, nullable = false)
	private String id;

	@ApiModelProperty(value = "nombre del profesor", dataType = "String", position = 2, example = "Pablo")
	@Column(name="nombre")
	private String nombre;
	
	
	@ApiModelProperty(value = "telefono del profesor", dataType = "String", position = 3, example = "656535")
	@Column(name="telefono")
	private String telefono;


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}

	public Profesor(String id, String nombre, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;

	}

	public Profesor() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}

}
