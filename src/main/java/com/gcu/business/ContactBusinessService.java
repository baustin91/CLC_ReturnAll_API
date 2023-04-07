package com.gcu.business;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.data.ContactDataService;
import com.gcu.model.ContactModel;

@Service
public class ContactBusinessService implements ContactBusinessServiceInterface
{
	@Autowired
	ContactDataService contactDataService;

	
	@Override
	public List<ContactModel> getClients() 
	{
		List<ContactModel> clients = contactDataService.findAll();
		//leave in for testing
		//clients.add(new ContactModel(20, "Test", "User", "315-489-5555", "_test@my.gcu.edu", "230 address"));//static list item with i for iterating and creating a unique 
	
		return clients; //return the list 
	}
}
