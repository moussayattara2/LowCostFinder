package com.lowcostfinder.java.DAO;

import java.util.List;
import com.lowcostfinder.java.domain.Client;

public interface IEDAOClient {

	public void insertClient(Client client);
	public void updateClient(Client client);
	public void deleteClient(Client client);
	public int getClient();
	public Client getClientbyId(int idclient);
	public List<Client> getAllClient();
	
}
