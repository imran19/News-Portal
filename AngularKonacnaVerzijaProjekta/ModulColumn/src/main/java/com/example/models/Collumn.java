package com.example.models;

import java.io.Serializable;

import java.util.HashSet;
import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;



//import com.example.models.Novost;


@Entity
@Table(name = "column")

public class Collumn {

	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name = "column_id")
	 private long id;
	    private String column_name;
	    
	    
	    @ManyToMany
		@JoinTable(name = "column_address", 
			joinColumns = @JoinColumn(name = "column_id", referencedColumnName = "column_id"), 
			inverseJoinColumns = @JoinColumn(name = "id", referencedColumnName = "id"))
		private Set<Address> addresses = new HashSet<Address>();
	   
		public Collumn(long id, String column_name) {
			this.id=id;
			this.column_name = column_name;
		}
		
		protected Collumn()
		{}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

	
		public String getColumn() {
			return column_name;
		}
	    public void setColumn(String column_name) 
	    {
	        this.column_name=column_name;
	       
	        
	    }
	    public Set<Address> getAddresses() {
			return addresses;
		}

		public void setAddresses(Set<Address> addresses) {
			this.addresses = addresses;
		}
	
	
}