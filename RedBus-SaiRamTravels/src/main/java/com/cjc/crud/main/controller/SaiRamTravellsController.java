package com.cjc.crud.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.crud.main.model.SaiRamtravells;
import com.cjc.crud.main.seriveI.ServcieI;

@RestController
public class SaiRamTravellsController 
{
	@Autowired
	ServcieI ser;
	
	@GetMapping("/getAlldata")
	public List<SaiRamtravells> getAlldata()
	{
		List list=ser.getallData();
		return list;
	}
	
	@PostMapping("/postdata")
	public String postdata(@RequestBody SaiRamtravells i )
	{
		ser.savedata(i);
		return "Your data is save now";
	}
	
	@GetMapping("/getAlldata/{id}")
	public Optional<SaiRamtravells> getsingledata(@PathVariable("id") int id)
	{
		Optional<SaiRamtravells> s=ser.getsingledata(id);
		return s;
	}	
	
	@GetMapping("/getAlldata/{from}/{to}")
	public List<SaiRamtravells> getdataFromto(@PathVariable("from") String sfrom,@PathVariable("to") String sto)
	{
		List<SaiRamtravells> list=ser.getdatafromto(sfrom,sto);
		return list;
	}
	
//	@GetMapping("/getAllDataa/{from}/{to}")
//	public Optional<SaiRamtravells> getsingledata(@PathVariable("from") String sfrom,@PathVariable("to") String sto)
//	{
//		Optional<SaiRamtravells> list=ser.getsingledataa(sfrom,sto);
//		return list;
//	}
}
