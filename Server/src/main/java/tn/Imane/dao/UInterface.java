package tn.Imane.dao;

import javax.jws.soap.SOAPBinding.Use;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.Imane.model.User;
@Repository
public interface UInterface extends CrudRepository<User, Integer> {

}
