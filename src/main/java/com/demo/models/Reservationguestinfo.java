package com.demo.models;
// Generated Dec 6, 2022, 10:46:20 AM by Hibernate Tools 4.3.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Reservationguestinfo generated by hbm2java
 */
@Entity
@Table(name = "reservationguestinfo", catalog = "doanky4")
public class Reservationguestinfo implements java.io.Serializable {

	private Integer reservationguestinfoid;
	private Reservationroomdetails reservationroomdetails;
	private Date birthday;
	private String guestname;
	private String guestidcardnumber;

	public Reservationguestinfo() {
	}

	public Reservationguestinfo(Reservationroomdetails reservationroomdetails, String guestname,
			String guestidcardnumber) {
		this.reservationroomdetails = reservationroomdetails;
		this.guestname = guestname;
		this.guestidcardnumber = guestidcardnumber;
	}

	public Reservationguestinfo(Reservationroomdetails reservationroomdetails, Date birthday, String guestname,
			String guestidcardnumber) {
		this.reservationroomdetails = reservationroomdetails;
		this.birthday = birthday;
		this.guestname = guestname;
		this.guestidcardnumber = guestidcardnumber;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "reservationguestinfoid", unique = true, nullable = false)
	public Integer getReservationguestinfoid() {
		return this.reservationguestinfoid;
	}

	public void setReservationguestinfoid(Integer reservationguestinfoid) {
		this.reservationguestinfoid = reservationguestinfoid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "reservationroomdetailsid", nullable = false)
	public Reservationroomdetails getReservationroomdetails() {
		return this.reservationroomdetails;
	}

	public void setReservationroomdetails(Reservationroomdetails reservationroomdetails) {
		this.reservationroomdetails = reservationroomdetails;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "birthday", length = 10)
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Column(name = "guestname",  length = 50)
	public String getGuestname() {
		return this.guestname;
	}

	public void setGuestname(String guestname) {
		this.guestname = guestname;
	}

	@Column(name = "guestidcardnumber",  length = 50)
	public String getGuestidcardnumber() {
		return this.guestidcardnumber;
	}

	public void setGuestidcardnumber(String guestidcardnumber) {
		this.guestidcardnumber = guestidcardnumber;
	}

}