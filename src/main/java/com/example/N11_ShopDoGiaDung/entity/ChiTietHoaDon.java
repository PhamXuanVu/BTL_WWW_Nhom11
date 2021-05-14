package com.example.N11_ShopDoGiaDung.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ChiTietHoaDon implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@ManyToOne
	@JoinColumn(name = "sanPhamId")
	private SanPham sanPham;
	
	@ManyToOne
	@JoinColumn(name = "hoaDonId")
	private HoaDon hoaDon;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "gioHangId")
	private GioHang gioHang; 
	
	private int soLuong;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public GioHang getGioHang() {
		return gioHang;
	}

	public void setGioHang(GioHang gioHang) {
		this.gioHang = gioHang;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public ChiTietHoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChiTietHoaDon( SanPham sanPham, int soLuong) {
		this.sanPham = sanPham;
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return "ChiTietHoaDon [id=" + id + ", sanPham=" + sanPham + ", hoaDon=" + hoaDon + ", gioHang=" + gioHang
				+ ", soLuong=" + soLuong + "]";
	}
	
	
}
