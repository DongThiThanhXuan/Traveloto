package com.demo.models;

import java.util.Date;

/**
 * Reservation generated by hbm2java
 */

public class XuanReservation implements java.io.Serializable {

	private Integer reservationid;
	private Account account;
	private Contractinfo contractinfo;
	private Roomtype roomtype;
	private String reservationidcode;
	private Date checkin;

	private Date checkout;

	private int totalrooms;
	private String customername;
	private String customerphone;
	private Double payment1;
	private Date paymentdat1;
	private Double payment2;
	private Date paymentdat2;
	private int reservationstt;	
	private double price;
	private Date createday;
	private String paymentchannel1;
	private String paymentchannel2;
	private int createby;
	private String bookingchannels;
	private int checkCheckinProcess; 
	private int checkCheckoutProcess; 
	public XuanReservation() {
	}

	

	public Integer getReservationid() {
		return reservationid;
	}

	public void setReservationid(Integer reservationid) {
		this.reservationid = reservationid;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Contractinfo getContractinfo() {
		return contractinfo;
	}

	public void setContractinfo(Contractinfo contractinfo) {
		this.contractinfo = contractinfo;
	}

	public Roomtype getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(Roomtype roomtype) {
		this.roomtype = roomtype;
	}

	public String getReservationidcode() {
		return reservationidcode;
	}

	public void setReservationidcode(String reservationidcode) {
		this.reservationidcode = reservationidcode;
	}

	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}



	public Date getCheckout() {
		return checkout;
	}

	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}

	

	public int getTotalrooms() {
		return totalrooms;
	}

	public void setTotalrooms(int totalrooms) {
		this.totalrooms = totalrooms;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomerphone() {
		return customerphone;
	}

	public void setCustomerphone(String customerphone) {
		this.customerphone = customerphone;
	}

	public Double getPayment1() {
		return payment1;
	}

	public void setPayment1(Double payment1) {
		this.payment1 = payment1;
	}

	public Date getPaymentdat1() {
		return paymentdat1;
	}

	public void setPaymentdat1(Date paymentdat1) {
		this.paymentdat1 = paymentdat1;
	}

	public Double getPayment2() {
		return payment2;
	}

	public void setPayment2(Double payment2) {
		this.payment2 = payment2;
	}

	public Date getPaymentdat2() {
		return paymentdat2;
	}

	public void setPaymentdat2(Date paymentdat2) {
		this.paymentdat2 = paymentdat2;
	}

	public int getReservationstt() {
		return reservationstt;
	}

	public void setReservationstt(int reservationstt) {
		this.reservationstt = reservationstt;
	}

	

	public Date getCreateday() {
		return createday;
	}

	public void setCreateday(Date createday) {
		this.createday = createday;
	}

	public String getPaymentchannel1() {
		return paymentchannel1;
	}

	public void setPaymentchannel1(String paymentchannel1) {
		this.paymentchannel1 = paymentchannel1;
	}

	

	public String getPaymentchannel2() {
		return paymentchannel2;
	}



	public void setPaymentchannel2(String paymentchannel2) {
		this.paymentchannel2 = paymentchannel2;
	}



	public int getCreateby() {
		return createby;
	}

	public void setCreateby(int createby) {
		this.createby = createby;
	}

	public String getBookingchannels() {
		return bookingchannels;
	}

	public void setBookingchannels(String bookingchannels) {
		this.bookingchannels = bookingchannels;
	}

	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getCheckCheckinProcess() {
		return checkCheckinProcess;
	}



	public void setCheckCheckinProcess(int checkCheckinProcess) {
		this.checkCheckinProcess = checkCheckinProcess;
	}



	public int getCheckCheckoutProcess() {
		return checkCheckoutProcess;
	}



	public void setCheckCheckoutProcess(int checkCheckoutProcess) {
		this.checkCheckoutProcess = checkCheckoutProcess;
	}



	public XuanReservation(Integer reservationid, Account account, Contractinfo contractinfo, Roomtype roomtype,
			String reservationidcode, Date checkin, Date checkout, int totalrooms, String customername,
			String customerphone, Double payment1, Date paymentdat1, Double payment2, Date paymentdat2,
			int reservationstt, double price, Date createday, String paymentchannel1, String paymentchannel2,
			int createby, String bookingchannels, int checkCheckinProcess, int checkCheckoutProcess) {
		super();
		this.reservationid = reservationid;
		this.account = account;
		this.contractinfo = contractinfo;
		this.roomtype = roomtype;
		this.reservationidcode = reservationidcode;
		this.checkin = checkin;
		this.checkout = checkout;
		this.totalrooms = totalrooms;
		this.customername = customername;
		this.customerphone = customerphone;
		this.payment1 = payment1;
		this.paymentdat1 = paymentdat1;
		this.payment2 = payment2;
		this.paymentdat2 = paymentdat2;
		this.reservationstt = reservationstt;
		this.price = price;
		this.createday = createday;
		this.paymentchannel1 = paymentchannel1;
		this.paymentchannel2 = paymentchannel2;
		this.createby = createby;
		this.bookingchannels = bookingchannels;
		this.checkCheckinProcess = checkCheckinProcess;
		this.checkCheckoutProcess = checkCheckoutProcess;
	}



	



	


	








	

}