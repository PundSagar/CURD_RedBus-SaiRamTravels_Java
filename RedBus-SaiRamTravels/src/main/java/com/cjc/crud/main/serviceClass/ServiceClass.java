package com.cjc.crud.main.serviceClass;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cjc.crud.main.Rep.Rep;
import com.cjc.crud.main.model.SaiRamtravells;
import com.cjc.crud.main.seriveI.ServcieI;
@Service
public class ServiceClass implements ServcieI {

	@Autowired
	Rep rep;
	@Override
	public List getallData() {
		List list=(List)rep.findAll();
		return list;
	}
	@Override
	public void savedata(SaiRamtravells i) {
		// TODO Auto-generated method stub
		rep.save(i);
	}
	@Override
	public Optional<SaiRamtravells> getsingledata(int id) {
		// TODO Auto-generated method stub
		Optional<SaiRamtravells> l=rep.findById(id);
		return l;
	}
	@Override
	public List<SaiRamtravells> getdatafromto(String sfrom,String sto) 
	{
	
		List<SaiRamtravells> list=rep.findAllSnameBySfromAndSto(sfrom,sto);
		return list;
	}
//	@Override
//	public Optional<SaiRamtravells> getsingledataa(String sfrom, String sto) {
//		// TODO Auto-generated method stub
//		Optional<SaiRamtravells> list=rep.findSnameBySfromAndSto(sfrom,sto);
//		rep.
//		return list;
//	}
	
	
	

}
