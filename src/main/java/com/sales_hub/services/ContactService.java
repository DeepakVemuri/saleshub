package com.sales_hub.services;

import java.util.List;

import com.sales_hub.entities.Contacts;

public interface ContactService {

	public void saveContact(Contacts contacts);
	
	public List<Contacts> getAllContacts();

	public Contacts findContactById(long id);
}
