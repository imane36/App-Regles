package tn.Imane.Rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tn.Imane.Service.AppService;
import tn.Imane.dao.ProjectInterface;
import tn.Imane.dao.RInterface;
import tn.Imane.model.Attribut;
import tn.Imane.model.Regle;

@CrossOrigin("*")
@RestController
public class App1 {
	@Autowired
    AppService service ;
	public void setService(AppService service) {
		this.service=service ;
		
	}
	
	@PostMapping("/Attribut")
	public List<Attribut> fnct0(@Valid @RequestBody Regle regle){
		return (List<Attribut>) service.getAttributsByIdRegle(regle.getId()) ;
	}
	
	@GetMapping("/regles")
	public List<Regle>fnct1(){
		return (List<Regle>)service.GetAllRegle() ;
		
	}
	
	 @PostMapping("/deleteR")

	public Regle fnct2(@Valid @RequestBody Regle regle) {
		 System.out.println(regle.getId());
		service.DeleteRegle(regle.getId());
		return regle ;
	}
	 
	 @PostMapping("/deleteA")
	 public Attribut fnct3(@Valid @RequestBody Attribut attribut) {
			service.DeleteAttribut(attribut.getId());
			return attribut ;
		}
	 
	
	 @PostMapping("/AddR")
		public Regle createRegle(@Valid @RequestBody Regle regle) {
			 service.AddRegle(regle);
			 return regle ;
		}
	 
	 
	 @PostMapping(value="/AddA")
	 public Attribut fnct5(@Valid @RequestBody Attribut attribut) {
		 
		 service.AddAttribut(attribut);
		 return attribut ;
	 }
	 @PostMapping(value="/EditA")
	 public void fnct6(@Valid @RequestBody Attribut attribut) {
		 service.AddAttribut(attribut);
	 }
	 @PostMapping(value="/EditR")
	 public void fnct47(@Valid @RequestBody Regle regle) {
		 service.AddRegle(regle);
	 }
	 
	 
	
}
