package com.gcu.data;

import java.util.List;
import javax.sql.DataSource;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gcu.mapper.ContactMapper;
import com.gcu.model.ContactModel;

@Repository
public class ContactDataService implements DataAccessInterface<ContactModel> 
{

	DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public ContactDataService(DataSource dataSource) 
	{
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	@Override
	public List<ContactModel> findAll() 
	{
		List<ContactModel> results = jdbcTemplateObject.query("SELECT * FROM client", new ContactMapper());
		return results;
	}
}
