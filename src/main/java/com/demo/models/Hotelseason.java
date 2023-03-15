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
 * Hotelseason generated by hbm2java
 */
@Entity
@Table(name = "hotelseason", catalog = "doanky4")
public class Hotelseason implements java.io.Serializable {

	private Integer hotelseasonid;
	private Hotel hotel;
	private Date fromdate;
	private Date todate;
	private String seasonname;
	private int hotelseasonstt;
	public Hotelseason() {
	}

	public Hotelseason(Hotel hotel, Date fromdate, Date todate, String seasonname) {
		this.hotel = hotel;
		this.fromdate = fromdate;
		this.todate = todate;
		this.seasonname = seasonname;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "hotelseasonid", unique = true, nullable = false)
	public Integer getHotelseasonid() {
		return this.hotelseasonid;
	}

	public void setHotelseasonid(Integer hotelseasonid) {
		this.hotelseasonid = hotelseasonid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hotelid", nullable = false)
	public Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fromdate", nullable = false, length = 10)
	public Date getFromdate() {
		return this.fromdate;
	}

	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "todate", nullable = false, length = 10)
	public Date getTodate() {
		return this.todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
	}

	@Column(name = "seasonname", nullable = false, length = 10)
	public String getSeasonname() {
		return this.seasonname;
	}

	public void setSeasonname(String seasonname) {
		this.seasonname = seasonname;
	}
	@Column(name = "hotelseasonstt", nullable = false, length = 11)
	public int getHotelseasonstt() {
		return hotelseasonstt;
	}

	public void setHotelseasonstt(int hotelseasonstt) {
		this.hotelseasonstt = hotelseasonstt;
	}

	public Hotelseason(Integer hotelseasonid, Hotel hotel, Date fromdate, Date todate, String seasonname,
			int hotelseasonstt) {
		super();
		this.hotelseasonid = hotelseasonid;
		this.hotel = hotel;
		this.fromdate = fromdate;
		this.todate = todate;
		this.seasonname = seasonname;
		this.hotelseasonstt = hotelseasonstt;
	}
	
	
	

}
