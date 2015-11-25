package com.cxrus.fuse.poc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cxrus.fuse.poc.model.Client;

public class ClientBean {

	public List<Client> process(List<Map<String, Object>> data){
		
		List<Client> listClient= new ArrayList<Client>();
		
		if(data.size() > 0) {
			for (Map<String, Object> map : data) {
				Client client= new Client();
				client.setClientId((String) map.get("LOGIN_ID"));
				client.setFirstName((String) map.get("SURNAME"));
				client.setLastName((String) map.get("FORENAME"));
				client.setAge((Integer) map.get("AGE"));
				
				listClient.add(client);
			}
		}
		
		return listClient;
    }
	
}
