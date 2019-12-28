package tn.Imane.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.Imane.model.Regle;


@Repository
public interface RInterface  extends CrudRepository<Regle, Integer>{
	

}
