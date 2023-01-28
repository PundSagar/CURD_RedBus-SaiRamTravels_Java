package com.cjc.crud.main.seriveI;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cjc.crud.main.model.SaiRamtravells;

@Service
public interface ServcieI {

	List getallData();

	void savedata(SaiRamtravells i);

	Optional<SaiRamtravells> getsingledata(int id);

List<SaiRamtravells> getdatafromto(String sfrom,String sto);

//Optional<SaiRamtravells> getsingledataa(String sfrom, String sto);

}
