package tn.Imane.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import tn.Imane.model.Attribut;
import tn.Imane.model.Regle;
public interface ProjectInterface {
public List<Regle> GetAllRegle() ;
public List<Attribut> getAttributsByIdRegle(Integer id) ;
public Regle AddRegle(Regle regle) ;
public void AddAttribut(Attribut attribut) ;
public void EditRegle(Regle regle) ;
public void DeleteRegle(Integer id) ;
public void DeleteAttribut(Integer id) ;
public void VerifUser(String login ,String Password) ;
}