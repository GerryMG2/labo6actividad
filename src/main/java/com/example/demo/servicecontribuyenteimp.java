package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicecontribuyenteimp implements servicecontribuyente {
	
	@Autowired
	contribuyentedaoimp imp = new contribuyentedaoimp();

	@Override
	public List<contribuyente> getall() {
		// TODO Auto-generated method stub
		return imp.getall();
	}

	@Transactional
	@Override
	public boolean save(contribuyente ct) {
		// TODO Auto-generated method stub
		return imp.save(ct);
	}

}
