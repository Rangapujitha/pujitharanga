package com.loginreg.repository;

import java.util.List;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.loginreg.model.Reg;


public interface LoginRepository extends CouchbasePagingAndSortingRepository<Reg,Integer> {
	
	List<Reg> findByNameAndPassword(String name, String password);
}
