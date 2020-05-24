package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
@Service
public class serviceImportanciaImpl implements serviceimportancia {

	@Autowired
	private importanciaimp dao = new importanciaimp();
	
	
	@Override
	public List<importancia> getlistimportancia() throws DataAccessException {
		
		return dao.findAll2();
	}

}
