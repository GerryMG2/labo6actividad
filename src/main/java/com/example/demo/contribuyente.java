package com.example.demo;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;

import org.springframework.boot.context.properties.bind.DefaultValue;

import com.sun.istack.NotNull;

import net.bytebuddy.implementation.bind.annotation.Default;

@Entity
@Table(schema = "public",name = "contribuyente")
public class contribuyente {
	@Id
	@Column(name = "c_contribuyente")
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	@NotNull
	@Column(name = "c_importancia")
	private Integer importancia;
	
//	@Max(value = 30)
	@Column(name = "s_nombre")
	private String nombre;
	
//	@Max(value = 30)
	@Column(name = "s_apellido")
	private String apellido;
	
//	@Max(value = 14)
	@Column(name = "s_nit")
	private String nit;
	
//	@Max(value = 30)
	@Column(name = "f_fecha_ingreso")
	private String fecha = (new Date()).toGMTString();
	
	public contribuyente() {
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getImportancia() {
		return importancia;
	}

	public void setImportancia(Integer importancia) {
		this.importancia = importancia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	
	
	

}
