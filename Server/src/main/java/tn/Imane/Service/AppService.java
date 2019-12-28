package tn.Imane.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.Imane.dao.AInterface;
import tn.Imane.dao.ProjectInterface;
import tn.Imane.dao.RInterface;
import tn.Imane.dao.UInterface;
import tn.Imane.model.Attribut;
import tn.Imane.model.Regle;
@Service
public class AppService  implements ProjectInterface{
	
	@Autowired
	AInterface AInterface ;
	@Autowired
	RInterface RInterface ;
	@Autowired
	UInterface UInterface ;
	
	public void setAInterface(AInterface inter) {
		this.AInterface=inter ;
		
	}
	public void setRervice(RInterface inter) {
		this.RInterface=inter ;
		
	}
	public void setUInterface(UInterface inter) {
		this.UInterface=inter ;
		
	}
	

	@Override
	public List<Regle> GetAllRegle() {
		return (List<Regle>) RInterface.findAll();
	}

	@Override
	public List<Attribut> getAttributsByIdRegle(Integer id) {
		return (List<Attribut>)AInterface.getAllAttributByRegleId(id);
	}

	@Override
	public Regle AddRegle(Regle regle) {
           return RInterface.save(regle) ;		
	}

	@Override
	public void EditRegle(Regle regle) {
		RInterface.save(regle) ;
		
	}

	@Override
	public void DeleteRegle(Integer id) {
RInterface.deleteById(id);		
	}

	@Override
	public void VerifUser(String login, String Password) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void DeleteAttribut(Integer id) {
AInterface.deleteById(id);		
	}
	@Override
	public void AddAttribut(Attribut attribut) {
AInterface.save(attribut)	;	
	}

}
