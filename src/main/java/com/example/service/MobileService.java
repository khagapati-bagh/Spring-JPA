package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Mobile;
import com.example.repository.MobileRepository;

@Service
public class MobileService {

	@Autowired
	MobileRepository mr;
	
	public Object addMobile(Mobile mob) {
		return mr.save(mob);
	}
	
	public void addMobiles(List<Mobile> mobiles) {
		mr.saveAll(mobiles);
	}
	
	public List<Mobile> getAllMobile() {
		return (List<Mobile>) mr.findAll();
	}
	
	public Mobile getMobileById(String id) {
		Mobile mobile = new Mobile();
		try {
			Optional<Mobile> optional= mr.findById(id);
			mobile = optional.get();
		} catch (Exception e) {
			System.out.println("No such Id");
		}
		
		return mobile;
	}
	
	public String deleteById(String id) {
		mr.deleteById(id);
		return "Successfully deleted";
	}
	
	public String updateMobile(Mobile mob) {
		Mobile existMob = mr.findById(mob.getId()).orElse(null);
		String status = "Not Found";
		if (existMob != null) {
			existMob.setBrand(mob.getBrand());
			mr.save(existMob);
			status = "Successfully added " + existMob.toString();
		}
		return status;
	}
	
}
