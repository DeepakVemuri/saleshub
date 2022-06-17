package com.sales_hub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sales_hub.entities.Billing;
import com.sales_hub.entities.Contacts;
import com.sales_hub.services.BillingService;
import com.sales_hub.services.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService BillingService;
	
	@RequestMapping("/createBill")
	public String createBill(@RequestParam("bid") long id,ModelMap model) {
		Contacts contact = contactService.findContactById(id);
		model.put("contact",contact);
		return "create_bill";
	}
	
	@RequestMapping("/saveBill")
	public String saveBill(@ModelAttribute Billing bill,ModelMap model) {
		BillingService.saveBill(bill);
		model.put("bill", bill);
		return "generate_bill";
	}
}
