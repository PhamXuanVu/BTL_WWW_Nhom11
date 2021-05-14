package com.example.N11_ShopDoGiaDung.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class GioHang implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne
	@JoinColumn(name = "nguoiDungId", nullable = false)
	private NguoiDung nguoiDung;

	@OneToMany(mappedBy = "gioHang")
	private Set<ChiTietHoaDon> chiTietHoaDons;

	public NguoiDung getNguoiDung() {
		return nguoiDung;
	}

	public void setNguoiDung(NguoiDung nguoiDung) {
		this.nguoiDung = nguoiDung;
	}

	public Set<ChiTietHoaDon> getChiTietHoaDons() {
		return chiTietHoaDons;
	}

	public void setChiTietHoaDons(Set<ChiTietHoaDon> chiTietHoaDons) {
		this.chiTietHoaDons = chiTietHoaDons;
	}

	public GioHang( Set<ChiTietHoaDon> chiTietHoaDons) {
		this.chiTietHoaDons = chiTietHoaDons;
	}

	public GioHang() {
		super();
	}

	@Override
	public String toString() {
		return "GioHang [nguoiDung=" + nguoiDung + ", chiTietHoaDons=" + chiTietHoaDons + "]";
	}
	
	
}
