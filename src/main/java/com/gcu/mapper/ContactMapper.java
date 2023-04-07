package com.gcu.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gcu.model.ContactModel;


public class ContactMapper implements RowMapper<ContactModel> {

	@Override
	public ContactModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ContactModel contact = new ContactModel(rs.getInt("id"),
												rs.getString("firstN"),
												rs.getString("lastN"),
												rs.getString("phone"),
												rs.getString("email"),
												rs.getString("address"));
		
		return contact;
	}

}
