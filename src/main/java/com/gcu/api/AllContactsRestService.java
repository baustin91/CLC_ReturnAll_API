package com.gcu.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.business.ContactBusinessService;
import com.gcu.model.ContactModel;

@RestController
@RequestMapping("/contacts")
public class AllContactsRestService {

	@Autowired
	ContactBusinessService service;
	
	@GetMapping(path="/all")
	public ResponseEntity<?> getAllContacts()
	{
		try
		{
			//Get all contacts 
			List<ContactModel> orders = service.getClients();
			if(orders == null)
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			else
				return new ResponseEntity<>(orders, HttpStatus.OK);
		}
		catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
