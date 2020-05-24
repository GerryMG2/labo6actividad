package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.sun.istack.NotNull;

@Entity
@Table(schema = "public",name = "importancia")
public class importancia {
	
	@Id
	@Column(name = "c_importancia")
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer importanciaCode;
	
	@Column(name = "s_importancia")
	@Max(value = 30)
	private String importanciaName;
	
	public importancia() {
		System.out.println("entra");
		
	}

	public int getImportanciaCode() {
		return importanciaCode;
	}

	public void setImportanciaCode(int importanciaCode) {
		this.importanciaCode = importanciaCode;
	}

	public String getImportanciaName() {
		return importanciaName;
	}

	public void setImportanciaName(String importanciaName) {
		this.importanciaName = importanciaName;
	}


	

}
