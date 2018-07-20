package com.cgs.pro94tek.healthcare.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
@Table(name="newappointment", uniqueConstraints = { @UniqueConstraint (columnNames = "ID") })
public class Appointment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "ID", unique = true, nullable = false)
	 private Long id;
	@Column(length=20)
	 private int staffId;
	@Column(name ="staffName",length=20)
	 private String staffName;//` VARCHAR(200) NULL DEFAULT NULL,
	@Column(name ="doctorId",length=20)
	 private int  doctorId;//` INT(100) NULL DEFAULT NULL,
	@Column(name ="doctorName",length=20)
	 private String doctorName;
	@Column(name ="hospitalName",length=20)
	 private String hospitalName;//` VARCHAR(200) NULL DEFAULT NULL,
	@Column(name ="staffName",length=20)
	 private Date appointementDate;//` DATE NULL DEFAULT NULL,
	@Column(name ="staffName",length=20)
	 private String appointmentTime;//` VARCHAR(20) NULL DEFAULT NULL,
	@Column(name ="staffName",length=20)
	 private int phoneMumber;//INT(20) NULL DEFAULT NULL,
	@Column(name ="staffName",length=20)
	 private String address;//` VARCHAR(1000) NULL DEFAULT NULL,
	@Column(name ="staffName",length=20)
	 private String status;//` VARCHAR(1) NULL DEFAULT NULL,
	 private int patientId; //INT(100) NULL DEFAULT NULL,
	 private String patientName;//` VARCHAR(200) NULL DEFAULT NULL,
	 private int hosiptalId;//` BIGINT(10) NULL DEFAULT NULL,
	 private String pregnancy;//` VARCHAR(2) NULL DEFAULT NULL,
	 private String inpatient;// VARCHAR(2) NULL DEFAULT NULL,
	 private Long amount; //BIGINT(10) NULL DEFAULT NULL,
	 private String child;// VARCHAR(20) NULL DEFAULT NULL,
	 private Date createdate;//` DATE NULL DEFAULT NULL,
	 private String labamount;//` VARCHAR(20) NULL DEFAULT NULL,
	 private String  occupancyid;//` VARCHAR(20) NULL DEFAULT NULL,
	 private String accomidationtype;//` VARCHAR(20) NULL DEFAULT NULL,
	 private String receiptid;//` VARCHAR(50) NULL DEFAULT NULL,
	 private String labpaidprice;//` VARCHAR(20) NULL DEFAULT NULL,
	 private String medicalpaidprice;//` VARCHAR(20) NULL DEFAULT NULL,
	 private String medicaltotalbill;// VARCHAR(20) NULL DEFAULT NULL,
	 private Date futuredate;//` DATE NULL DEFAULT NULL,
	 
	
	
	
}
