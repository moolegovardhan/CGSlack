package com.cgs.pro94tek.healthcare.modal;

import java.util.Date;

public class AppointmentModal {
	 private Long id;
	 private int staffId;
	 public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public Date getAppointementDate() {
		return appointementDate;
	}
	public void setAppointementDate(Date appointementDate) {
		this.appointementDate = appointementDate;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public int getPhoneMumber() {
		return phoneMumber;
	}
	public void setPhoneMumber(int phoneMumber) {
		this.phoneMumber = phoneMumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getHosiptalId() {
		return hosiptalId;
	}
	public void setHosiptalId(int hosiptalId) {
		this.hosiptalId = hosiptalId;
	}
	public String getPregnancy() {
		return pregnancy;
	}
	public void setPregnancy(String pregnancy) {
		this.pregnancy = pregnancy;
	}
	public String getInpatient() {
		return inpatient;
	}
	public void setInpatient(String inpatient) {
		this.inpatient = inpatient;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getChild() {
		return child;
	}
	public void setChild(String child) {
		this.child = child;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public String getLabamount() {
		return labamount;
	}
	public void setLabamount(String labamount) {
		this.labamount = labamount;
	}
	public String getOccupancyid() {
		return occupancyid;
	}
	public void setOccupancyid(String occupancyid) {
		this.occupancyid = occupancyid;
	}
	public String getAccomidationtype() {
		return accomidationtype;
	}
	public void setAccomidationtype(String accomidationtype) {
		this.accomidationtype = accomidationtype;
	}
	public String getReceiptid() {
		return receiptid;
	}
	public void setReceiptid(String receiptid) {
		this.receiptid = receiptid;
	}
	public String getLabpaidprice() {
		return labpaidprice;
	}
	public void setLabpaidprice(String labpaidprice) {
		this.labpaidprice = labpaidprice;
	}
	public String getMedicalpaidprice() {
		return medicalpaidprice;
	}
	public void setMedicalpaidprice(String medicalpaidprice) {
		this.medicalpaidprice = medicalpaidprice;
	}
	public String getMedicaltotalbill() {
		return medicaltotalbill;
	}
	public void setMedicaltotalbill(String medicaltotalbill) {
		this.medicaltotalbill = medicaltotalbill;
	}
	public Date getFuturedate() {
		return futuredate;
	}
	public void setFuturedate(Date futuredate) {
		this.futuredate = futuredate;
	}
	private String staffName;//` VARCHAR(200) NULL DEFAULT NULL,
	 private int  doctorId;//` INT(100) NULL DEFAULT NULL,
	 private String doctorName;
	 private String hospitalName;//` VARCHAR(200) NULL DEFAULT NULL,
	 private Date appointementDate;//` DATE NULL DEFAULT NULL,
	 private String appointmentTime;//` VARCHAR(20) NULL DEFAULT NULL,
	 private int phoneMumber;//INT(20) NULL DEFAULT NULL,
	 private String address;//` VARCHAR(1000) NULL DEFAULT NULL,
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
	 private Date futuredate;//

}
