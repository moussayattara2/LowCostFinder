package com.lowcostfinder.test.domain;

import com.lowcostfinder.java.domain.Client;

import junit.framework.*;


public class ClientTest extends TestCase{

	private void TestgetID_CLIENT() throws Exception{
		assertEquals(2, Client.getID_CLIENT());
		
	}
	private void TestgetNom() throws Exception{
		assertEquals("Pogba", Client.getNOM_CLIENT());
	}
	private void TestgetPrenom() throws Exception{
		assertEquals("Paul", Client.getPRENOM_CLIENT());
		
	}
	
	private void TestgetAdresse() throws Exception {
		assertEquals("1 Avenue Champs Elysées 75016 Paris", Client.getADRESSE_CLIENT());
	}

	private void TestgetEmail() throws Exception {
		assertEquals("paulpobga@gmail.com", Client.getEMAIL_CLIENT());
	}

}
