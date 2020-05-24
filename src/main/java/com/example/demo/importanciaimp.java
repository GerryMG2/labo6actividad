package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class importanciaimp implements importanciaDao {

	
	@PersistenceContext(unitName = "capas")
	private EntityManager entity;
	
	@Override
	public List<importancia> findAll2() throws DataAccessException {
	
		
			
			StringBuffer sb = new StringBuffer();
			sb.append("select * from importancia;");
			Query qr = entity.createNativeQuery(sb.toString(), importancia.class);
			
			
			 return qr.getResultList();
	}
			
	
	
	

}
