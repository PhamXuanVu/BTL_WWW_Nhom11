package com.example.N11_ShopDoGiaDung.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class TheLoai implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private String id;

	@Column(nullable = false)
	private String ten;

	@OneToOne(mappedBy = "theLoai")
	private SanPham sanPham;

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

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public TheLoai(String id, String ten, SanPham sanPham) {
		super();
		this.id = id;
		this.ten = ten;
		this.sanPham = sanPham;
	}

	public TheLoai() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TheLoai [id=" + id + ", ten=" + ten + ", sanPham=" + sanPham + "]";
	}
	
	
}
