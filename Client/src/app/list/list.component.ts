import { Component, OnInit, TemplateRef } from '@angular/core';

import { reject } from 'q';
import { SpringService } from '../spring.service';
import { Regle } from './Regle';
import { BsModalRef, BsModalService } from 'ngx-bootstrap/modal';
import { Attribute } from '@angular/compiler/src/core';
import { attribut } from './attribut';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  modalRef: BsModalRef;
  Object :Regle=new Regle() ;
  Objects:any ;
  editObject:Regle=new Regle() ;
  id ={ 'id':''} ;
  errorMsg1 :any ;
  recupered:any ;
  ObjectAttribute:Array<attribut>=new Array<attribut> (); 
  ObjectAttributeEdit:any ;
  oldList:any ;
attributEdit:attribut=new attribut() 
  attribut:attribut =new attribut();
  ObjectToDelete:Regle= new Regle() ;
  constructor(private modalService: BsModalService,private springService:SpringService){}
  openModalAdd(template: TemplateRef<any>) {
    this.modalRef = this.modalService.show(template);
  }
  openModalDelete(template: TemplateRef<any>,id) {
    this.ObjectToDelete.id=id ;
    this.modalRef = this.modalService.show(template);
  }
  openModalEdit(template: TemplateRef<any>,regle :Regle) {
    this.editObject=regle ;
    this.getAttribute(regle) ;
    this.modalRef = this.modalService.show(template);
  }
  ngOnInit() {
    this.getObject() ;
  }
 public getObject(){
    this.springService.get().subscribe(
      res =>{
        this.Objects=res ;

      },
      err =>{
        console.log(err) ;
      }
    ) 
    ;
  }

public Onsave(){
this.springService.saveR(this.Object).subscribe(
  res =>{
    console.log(res) ;
    this.recupered=res ;
    this.ObjectAttribute.forEach(element => {
      element.regle=this.recupered.id ;
      this.springService.saveA(element).subscribe(
        res =>{
               console.log(res) ;
        },
        err =>{
          console.log(err) ;
        }
      ) 
      ;

      
      
    });

    this.Object.nom="" ;
    this.ObjectAttribute=new Array<attribut> ();
    this.ngOnInit() ;

  },
  err =>{
    console.log(err) ;
  }

)
 ;

}
onDelete(){
  this.springService.deleteR(this.ObjectToDelete).subscribe(
    res =>{
      console.log(res) ;
      this.modalRef.hide() ;

      this.ngOnInit() ;
  
    },
    err =>{
      console.log(err) ;
    }
  

  ) ;
} 
onAddAttribut(){
  if(!this.attribut.nom){
    return
  }
  this.ObjectAttribute.push(this.attribut)
  this.attribut=new attribut() ;
}
onAddAttribut2(){
  if(!this.attributEdit.nom){
    return
  }
  this.attributEdit.regle=this.editObject.id ;
  this.ObjectAttributeEdit.push(this.attributEdit)
  this.attributEdit=new attribut() ;
}
deleteitemfrombjectAttribute(i){
  this.ObjectAttribute.splice(i,1) ;

}
deleteitemObjectAttributeEdit1(i){
  this.ObjectAttributeEdit.splice(i,1) ;

}
onEdit(){
  this.springService.saveR(this.editObject).subscribe(
    res =>{ 
    
        
          },
          err =>{
            console.log(err) ;
          }
        ) 


this.ObjectAttributeEdit.forEach(element => {
  this.springService.saveA(element).subscribe(
    res =>{
      this.modalRef.hide() ;
      this.editObject=new Regle() ;
      
          },
          err =>{
            console.log(err) ;
          }
        )
  
  
});
    
  



}
getAttribute(Regle:Regle) {
  this.springService.getA(Regle).subscribe(
    res =>{
this.ObjectAttributeEdit=res ;
this.oldList=res ;
    },
    err =>{
      console.log(err) ;
    }
  )

}
getAttribute1(Regle:Regle) {
  this.springService.getA(Regle).subscribe(
    res =>{
this.oldList=res ;
  
    },
    err =>{
      console.log(err) ;
    }
  )

}
deleteitemObjectAttributeEdit(i,Attribut:attribut){
  this.ObjectAttributeEdit.splice(i,1) ;
  this.springService.deleteA(Attribut).subscribe(
    res =>{
        
          },
          err =>{
            console.log(err) ;
          }
  ) ;
}
}
