package tn.Imane.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.Imane.model.Attribut;
@Repository
public interface AInterface extends CrudRepository<Attribut, Integer> {
	@Query("Select p from Attribut p where p.regle=:x")
	public List<Attribut> getAllAttributByRegleId(@Param("x") Integer id);

}
