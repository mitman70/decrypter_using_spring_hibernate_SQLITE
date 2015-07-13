package com.mahmud.decrypt.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mahmud.decrypt.dao.IBodyDao;
import com.mahmud.decrypt.dao.ICryptDao;
import com.mahmud.decrypt.model.Body;
import com.mahmud.decrypt.model.Crypt;
import com.mahmud.decrypt.util.DecrypterUtil;

public class DecrypterService implements IDecrypterService {
	
	@Autowired
	private IBodyDao bodyDao;
	
	@Autowired
	private ICryptDao cryptDao;
	
	
	
	@Override
	@Transactional
	public String decryptBook()
	{
		
		List<Crypt> cryptList = cryptDao.getAll();
		
		Map<Integer,Integer> rotationMap  = DecrypterUtil.populateRotationList(cryptList);
		StringBuilder strBuilder = new StringBuilder();
		
		List<Body> data = bodyDao.getAll();
		
		for(Body body:data)
		{
			int rotation = rotationMap.get(body.getId());
			strBuilder.append(DecrypterUtil.decrypt(body.getData(), rotation));
			
		}
	
		return strBuilder.toString();
		
	}



	public void setBodyDao(IBodyDao bodyDao) {
		this.bodyDao = bodyDao;
	}



	public void setCryptDao(ICryptDao cryptDao) {
		this.cryptDao = cryptDao;
	}
	

}
