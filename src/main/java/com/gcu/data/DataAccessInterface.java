package com.gcu.data;

import java.util.List;

public interface DataAccessInterface<T> 
{
	//public List<ContactModel> getUser();
	public List<T> findAll();
}

