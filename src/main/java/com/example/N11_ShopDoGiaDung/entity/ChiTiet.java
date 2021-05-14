package com.example.N11_ShopDoGiaDung.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ChiTiet implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "id", nullable = false)
	private SanPham sanPham;

	@Column(name = "thuocTinh", nullable = false)
	private String key;

	@Column(name = "giaTri", nullable = false)
	private String value;

	public ChiTiet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChiTiet(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ChiTiet [sanPham=" + sanPham + ", key=" + key + ", value=" + value + "]";
	}
	
	
}
