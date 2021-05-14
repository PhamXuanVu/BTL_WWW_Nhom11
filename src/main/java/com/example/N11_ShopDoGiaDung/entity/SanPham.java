package com.example.N11_ShopDoGiaDung.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class SanPham implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id",nullable = false)
	private String id;
	
	@Column(name = "ten",nullable = false)
	private String ten;
	
	@Column(name = "thuongHieu",nullable = false)
	private String thuonghieu;
	
	@Column(name = "gia",nullable = false)
	private double gia;
	
	private String moTa;
	
	@ElementCollection
	@CollectionTable(name = "Hinh", joinColumns = @JoinColumn(name = "id"))
	private Set<String> anh;
	
	@OneToMany(mappedBy = "sanPham")
    private Set<ChiTiet> chiTiets;

    @OneToOne
    @JoinColumn( nullable = false)
    private TheLoai theLoai;

    @Column(nullable = false)
    private int soLuongTon;

    @OneToMany(mappedBy = "sanPham")
    private Set<ChiTietHoaDon> chiTietHoaDons;

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

	public String getThuonghieu() {
		return thuonghieu;
	}

	public void setThuonghieu(String thuonghieu) {
		this.thuonghieu = thuonghieu;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public Set<String> getAnh() {
		return anh;
	}

	public void setAnh(Set<String> anh) {
		this.anh = anh;
	}

	public Set<ChiTiet> getChiTiets() {
		return chiTiets;
	}

	public void setChiTiets(Set<ChiTiet> chiTiets) {
		this.chiTiets = chiTiets;
	}

	public TheLoai getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(TheLoai theLoai) {
		this.theLoai = theLoai;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}

	public Set<ChiTietHoaDon> getChiTietHoaDons() {
		return chiTietHoaDons;
	}

	public void setChiTietHoaDons(Set<ChiTietHoaDon> chiTietHoaDons) {
		this.chiTietHoaDons = chiTietHoaDons;
	}

	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SanPham(String id, String ten, String thuonghieu, double gia, String moTa, Set<String> anh,
			Set<ChiTiet> chiTiets, TheLoai theLoai, int soLuongTon, Set<ChiTietHoaDon> chiTietHoaDons) {
		super();
		this.id = id;
		this.ten = ten;
		this.thuonghieu = thuonghieu;
		this.gia = gia;
		this.moTa = moTa;
		this.anh = anh;
		this.chiTiets = chiTiets;
		this.theLoai = theLoai;
		this.soLuongTon = soLuongTon;
		this.chiTietHoaDons = chiTietHoaDons;
	}

	@Override
	public String toString() {
		return "SanPham [id=" + id + ", ten=" + ten + ", thuonghieu=" + thuonghieu + ", gia=" + gia + ", moTa=" + moTa
				+ ", anh=" + anh + ", chiTiets=" + chiTiets + ", theLoai=" + theLoai + ", soLuongTon=" + soLuongTon
				+ ", chiTietHoaDons=" + chiTietHoaDons + "]";
	}
    
    
}
