package com.example.demo;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface importanciaDao {
	
	
	public List<importancia> findAll2() throws DataAccessException;
}
