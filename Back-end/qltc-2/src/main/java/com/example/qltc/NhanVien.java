package com.example.qltc;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {

	@Id
	private int manv;
	private long luong;
	private int heso;
	private String bangcap;
	private int namsinh;
	private String noisinh;
	private String thuongtru;
	private String cho_o_hien_tai;
	
	public int getManv() {
		return manv;
	}
	public void setManv(int manv) {
		this.manv = manv;
	}
	public long getLuong() {
		return luong;
	}
	public void setLuong(long luong) {
		this.luong = luong;
	}
	public int getHeso() {
		return heso;
	}
	public void setHeso(int heso) {
		this.heso = heso;
	}
	public String getBangcap() {
		return bangcap;
	}
	public void setBangcap(String bangcap) {
		this.bangcap = bangcap;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	public String getNoisinh() {
		return noisinh;
	}
	public void setNoisinh(String noisinh) {
		this.noisinh = noisinh;
	}
	public String getThuongtru() {
		return thuongtru;
	}
	public void setThuongtru(String thuongtru) {
		this.thuongtru = thuongtru;
	}
	public String getCho_o_hien_tai() {
		return cho_o_hien_tai;
	}
	public void setCho_o_hien_tai(String cho_o_hien_tai) {
		this.cho_o_hien_tai = cho_o_hien_tai;
	}
	
	
}
