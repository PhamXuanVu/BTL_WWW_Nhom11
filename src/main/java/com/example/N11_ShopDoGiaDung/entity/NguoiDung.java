package com.example.N11_ShopDoGiaDung.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;                            
@Entity
public class NguoiDung implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	private String ten;
	private Date ngaySinh;
	private String sdt;
	private Boolean gioiTinh;
	private String anh;
	private String diaChi;
	
	@OneToOne
	@JoinColumn(name = "userId")
	private User user;
	
	@OneToMany(mappedBy = "nguoiDung")
	private HoaDon hoaDon;
	
	@OneToMany(mappedBy = "nguoiDung")
	private GioHang gioHang;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public Boolean getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(Boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getAnh() {
		return anh;
	}

	public void setAnh(String anh) {
		this.anh = anh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public NguoiDung(String id, String ten, Date ngaySinh, String sdt, Boolean gioiTinh, String anh, String diaChi,
			User user, HoaDon hoaDon, GioHang gioHang) {
		super();
		this.id = id;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.sdt = sdt;
		this.gioiTinh = gioiTinh;
		this.anh = anh;
		this.diaChi = diaChi;
		this.user = user;
		this.hoaDon = hoaDon;
		this.gioHang = gioHang;
	}

	public NguoiDung() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NguoiDung [id=" + id + ", ten=" + ten + ", ngaySinh=" + ngaySinh + ", sdt=" + sdt + ", gioiTinh="
				+ gioiTinh + ", anh=" + anh + ", diaChi=" + diaChi + ", user=" + user + ", hoaDon=" + hoaDon
				+ ", gioHang=" + gioHang + "]";
	}
	
	
}
