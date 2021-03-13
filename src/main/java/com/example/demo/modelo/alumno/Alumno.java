package com.example.demo.modelo.alumno;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.demo.modelo.profesor.Profesor;
import com.example.demo.modelo.responsable.Responsable;

import io.swagger.annotations.ApiModelProperty;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "alumno")
public class Alumno {
	@Id
	@ApiModelProperty(value = "identificador del alumno", dataType = "String", position = 1, example = "1")
    @Column(name = "id",unique=true, nullable = false)
	private String id;


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
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
		if (profesor == null) {
			if (other.profesor != null)
				return false;
		} else if (!profesor.equals(other.profesor))
			return false;
		if (responsable == null) {
			if (other.responsable != null)
				return false;
		} else if (!responsable.equals(other.responsable))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}




	@ApiModelProperty(value = "dni del alumno", dataType = "String", position = 2, example = "1662465Q")
	@Column(name="dni")
	private String dni;

	@ApiModelProperty(value = "nombre del alumno", dataType = "String", position = 3, example = "Pablo")
	@Column(name="nombre")
	private String nombre;

	@ApiModelProperty(value = "fecha de nacimiento del alumno", dataType = "String", position = 4, example = "27/09/2000")
	@Column(name="fechaNacimiento")
	private String fechaNacimiento;

	@ApiModelProperty(value = "telefono del alumno", dataType = "String", position = 5, example = "622524")
	@Column(name="telefono")
	private String telefono;

	@ApiModelProperty(value = "direccion del alumno", dataType = "String", position = 6, example = "Calle madrid, 1")
	@Column(name="direccion")
	private String direccion;

	@OneToOne
	@ApiModelProperty(value = "responsable del alumno", dataType = "Responsable", position = 7)
	@JoinColumn(name="responsableId")
	private Responsable responsable;


	@ManyToOne
	@ApiModelProperty(value = "profesor del alumno", dataType = "Profesor", position = 8)
	@JoinColumn(name="profesorId")
	private Profesor profesor;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	public Alumno(String id, String dni, String nombre, String fechaNacimiento, String telefono,
			String direccion) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	
	


	public Alumno() {
		
	}


	
	
	
	
}