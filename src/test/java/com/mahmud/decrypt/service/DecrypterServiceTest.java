package com.mahmud.decrypt.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

import com.mahmud.decrypt.dao.IBodyDao;
import com.mahmud.decrypt.dao.ICryptDao;
import com.mahmud.decrypt.model.Body;
import com.mahmud.decrypt.model.Crypt;
import com.mahmud.decrypt.service.DecrypterService;

public class DecrypterServiceTest {
	
	@Mock
	private IBodyDao bodyDaoMock;
	
	@Mock
	private ICryptDao cryptDaoMock;
	
	private DecrypterService decrypterService;
	private List<Body> bodyList = new ArrayList<Body>();
	private List<Crypt> cryptList = new ArrayList<Crypt>();
	
	
	@Before
	public void setup()
	{
		 MockitoAnnotations.initMocks(this);
		 setupBodyList();
		 setupCryptList();
		 decrypterService = new DecrypterService();
		 
	}

	private void setupCryptList() {
		Crypt crypt = new Crypt();
		crypt.setStart(1);
		crypt.setLength(4);
		crypt.setRotate(8);
		cryptList.add(crypt);		
	}

	private void setupBodyList() {
		Body body = new Body();
		body.setId(1);
		body.setData("XIZB Q.");
		bodyList.add(body);
		
	}

	@Test
	public void testDecryptBook() {
		when(bodyDaoMock.getAll()).thenReturn(bodyList);
		when(cryptDaoMock.getAll()).thenReturn(cryptList);
		decrypterService.setBodyDao(bodyDaoMock);
		decrypterService.setCryptDao(cryptDaoMock);
		
		String decryptedBook = decrypterService.decryptBook();
		assertEquals("PART I.", decryptedBook);

	}

}
