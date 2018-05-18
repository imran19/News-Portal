package com.example.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.example.models.Address;

@Entity
@Table(name = "column")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ColumnAddress implements Serializable {


/**
 * 
 */
private static final long serialVersionUID = -3570928575182329616L;


/*@ManyToMany(cascade = {CascadeType.ALL},fetch=FetchType.EAGER,mappedBy = "userAddress",targetEntity=UserData.class)*/

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="address_id")
private Address address;


@Id
@Column(name = "column_id")
@GeneratedValue(strategy = GenerationType.AUTO)
private Long colid;

@Column(name = "column_name")
@NotNull
private String column_name;


public Address getAddress() {
    return address;
}

public void setAddress(Address address) {
    this.address = address;
}

}



