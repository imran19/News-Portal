package com.example.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "address")
public class Address {



	private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    @Column(name = "name")
    private String name;
 
    @Column(name = "address")
    private String address;
    
   
    
    
	@ManyToMany(cascade = CascadeType.ALL)
	@JsonBackReference
	@JoinTable(name = "column_address", 
		joinColumns = @JoinColumn(name = "id", referencedColumnName = "id"), 
		inverseJoinColumns = @JoinColumn(name = "column_id", referencedColumnName = "column_id"))
	private Set<Collumn> columns = new HashSet<Collumn>();
	
	/*@ManyToOne
	@JoinColumn(name = "owner")
	private AppUser owner;*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/*public AppUser getOwner() {
		return owner;
	}

	public void setOwner(AppUser owner) {
		this.owner = owner;
	}
*/
	public Set<Collumn> getColumns() {
		return columns;
	}

	public void setColumns(Set<Collumn> columns) {
		this.columns = columns;
	}
}
