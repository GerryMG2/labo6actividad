package com.example.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class contribuyentedaoimp  implements contribuyentedao  {
	
	@PersistenceContext(unitName = "capas")
	private EntityManager entity;
	
	@Override
	public List<contribuyente> getall() throws DataAccessException {
		
			
			StringBuffer sb = new StringBuffer();
			sb.append("select * from contribuyente;");
			Query qr = entity.createNativeQuery(sb.toString(), contribuyente.class);
		
			return qr.getResultList();
			
		
	}
	
	@Transactional
	@Override
	public boolean save(contribuyente ct) throws DataAccessException {
		
		System.out.println("entro a insertar:" + ct.getFecha());
		System.out.println("entro a insertar:" + ct.getApellido());
		System.out.println("entro a insertar:" + ct.getImportancia());
		System.out.println("entro a insertar:" + ct.getNit());
		System.out.println("entro a insertar:" + ct.getCodigo());
		
		try {
//			StringBuffer sb = new StringBuffer();
//			sb.append("insert into contribuyente(c_importancia,s_nombre,s_apellido,f_fecha_ingreso,s_nit) values (:importancia,:nombre,:apellido,:fecha,:nit)");
//			
//			Query qr = entity.createNativeQuery(sb.toString());
//			qr.setParameter("importancia", ct.getImportancia());
//			qr.setParameter("nombre",ct.getNombre());
//			qr.setParameter("apellido", ct.getApellido());
//			qr.setParameter("fecha", ct.getFecha());
//			qr.setParameter("nit", ct.getNit());
//			qr.executeUpdate();
			
			entity.persist(ct);
			
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		
	}

}
