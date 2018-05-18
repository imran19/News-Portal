package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class Rubrika {

	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	 	private long id;
	    private String rubrika;
	   
		public Rubrika(long id, String rubrika) {
			this.id=id;
			this.rubrika = rubrika;
		}
		
		protected Rubrika()
		{}

		 public long getId() {
				return id;
			}
		 
	    public String getRubrika() {
			return rubrika;
		}

	
		
	    public void setRubrika(String rubrika) 
	    {
	        this.rubrika=rubrika;
	       
	        
	    }
	
	
}