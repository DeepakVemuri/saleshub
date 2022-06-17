package com.sales_hub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sales_hub.entities.Contacts;
import com.sales_hub.entities.Lead;
import com.sales_hub.services.ContactService;
import com.sales_hub.services.LeadService;

@Controller
public class ContactController {

	@Autowired
	LeadService leadService;
	
	@Autowired
	ContactService contactService;
	
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadService.findLeadById(id);

		Contacts contacts = new Contacts();
		contacts.setFirstName(lead.getFirstName());
		contacts.setLastName(lead.getLastName());
		contacts.setLeadSource(lead.getLeadSource());
		contacts.setEmail(lead.getEmail());
		contacts.setMobile(lead.getMobile());
		contactService.saveContact(contacts);
		
		leadService.deleteLeadById(id);
		
		List<Contacts> contact = contactService.getAllContacts();
		model.put("contact", contact);
		return "list_all_contacts";
	}
	
	@RequestMapping("/contactInfo")
	public String contactInfo(@RequestParam("id") long id,ModelMap model) {
		Contacts contact = contactService.findContactById(id);
		model.put("contact", contact);
		return "one_contact_list";
	}
	
	@RequestMapping("/listAllContacts")
	public String listAllContacts(ModelMap model){
		List<Contacts> contact = contactService.getAllContacts();
		model.put("contact", contact);
		return "list_all_contacts";
	}
	
}
