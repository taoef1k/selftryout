package com.cxrus.fuse.poc;

import java.util.Map;

import com.cxrus.fuse.poc.model.Users;

public class UsersBean {

	public Users process(Map<String, Object> data) {

		Users users = new Users();
		
		users.setLoginId((String) data.get("clientId"));
		users.setSurname((String) data.get("firstName"));
		users.setForename((String) data.get("lastName"));
		users.setAge((Integer) data.get("age"));

		return users;
	}
}
