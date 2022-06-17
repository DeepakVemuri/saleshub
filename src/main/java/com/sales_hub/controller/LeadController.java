package com.sales_hub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sales_hub.entities.Lead;
import com.sales_hub.services.ContactService;
import com.sales_hub.services.LeadService;

@Controller
public class LeadController {

	@Autowired
	LeadService leadService;
	
	@Autowired
	ContactService contactService;
	
	@RequestMapping("/viewCreatedLeadPage")
	public String viewCreatedLeadPage() {
		return "created_lead_page";
	}
	
	@RequestMapping(value ="/saveOneLead", method = RequestMethod.POST)
	public String saveOneLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		try {
			leadService.saveLeadInfo(lead);
			model.put("lead", lead);
		} catch (Exception e) {
			model.put("errorMsg", "Email/Mobile already exists!");
			return "created_lead_page";
		}
		return "view_saved_lead";
	}
	
	@RequestMapping("/composeEmail")
	public String composeEmail(@RequestParam("email") String email,ModelMap model) {
		model.put("email", email);
		return "compose_email";
	}
	
	@RequestMapping("/listAllLeads")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadService.getAllLeads();
		model.put("leads", leads);
		return "list_all_leads";
	}
	
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadService.findLeadById(id);
		if(lead!=null) {
			model.put("lead", lead);
			return "view_saved_lead";
		} else {
			model.put("msg","No Record found");
			return "view_saved_lead";
		}
	}

}
