package com.cjc.crud.main.Rep;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.crud.main.model.SaiRamtravells;
@Repository
public interface Rep extends CrudRepository<SaiRamtravells,Serializable>
{

	 List<SaiRamtravells> findAllSnameBySfromAndSto(String sfrom,String sto);
	 //Optional<SaiRamtravells> findSnameBySfromAndSto(String sfrom,String sto);
}
