package com.example.N11_ShopDoGiaDung.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class HoaDon implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@Column(nullable = false)
	private Calendar ngayLap;
	
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TrangThai trangThai;
	
	@Column(nullable = false)
	private Date ngayGiao;
		
//	@ManyToOne
//	@JoinColumn(name = "nguoiDungId", nullable = false)
//	private NguoiDung nguoiDung;

	public HoaDon(String id, Calendar ngayLap, TrangThai trangThai, Date ngayGiao) {
		super();
		this.id = id;
		this.ngayLap = ngayLap;
		this.trangThai = trangThai;
		this.ngayGiao = ngayGiao;
//		this.nguoiDung = nguoiDung;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Calendar getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(Calendar ngayLap) {
		this.ngayLap = ngayLap;
	}

	public TrangThai getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(TrangThai trangThai) {
		this.trangThai = trangThai;
	}

	public Date getNgayGiao() {
		return ngayGiao;
	}

	public void setNgayGiao(Date ngayGiao) {
		this.ngayGiao = ngayGiao;
	}

//	public NguoiDung getNguoiDung() {
//		return nguoiDung;
//	}
//
//	public void setNguoiDung(NguoiDung nguoiDung) {
//		this.nguoiDung = nguoiDung;
//	}

	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HoaDon [id=" + id + ", ngayLap=" + ngayLap + ", trangThai=" + trangThai + ", ngayGiao=" + ngayGiao
				+ ", nguoiDung="  + "]";
	}
	
	
}
