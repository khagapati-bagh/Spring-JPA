package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Mobile;
import com.example.service.MobileService;

@RestController
public class MobileController {
	
	@Autowired
	MobileService ms;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String homePage() {
		return "Welcome to Spring JPA";
	}
	
	@RequestMapping(value="/getMobileById/{id}", method=RequestMethod.GET)
	public Mobile getMobileById(@PathVariable("id") String id) {
		System.out.println("##### " + id);
		return ms.getMobileById(id);
	}
	
	@RequestMapping(value="/getAllMobile", method=RequestMethod.GET)
	public List<Mobile> getAllMobiles() {
		return ms.getAllMobile();
	}
	
	@RequestMapping(value="/addMobile", method = RequestMethod.POST)
	public Object addMobile(@RequestBody Mobile mob) {
		ms.addMobile(mob);
		return ms.addMobile(mob);
	}
	
	@RequestMapping(value="/addMobiles", method = RequestMethod.POST)
	public String addMobiles(@RequestBody List<Mobile> mobiles) {
		
		System.out.println("addMobiles");
		ms.addMobiles(mobiles);
		return "Added successfully";
	}
	
	@RequestMapping(value="/deleteMobileById/{id}", method=RequestMethod.DELETE)
	public String deleteMobileById(@PathVariable String id) {
		System.out.println("##### " + id);
		return ms.deleteById(id);
	}
	
	@RequestMapping(value="/updateMobile", method=RequestMethod.PUT)
	public String updateMobile(@RequestBody Mobile mob) {
		return ms.updateMobile(mob);
	}
	
}
