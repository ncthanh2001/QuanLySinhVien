package model;

public class SinhVien {
	private String quocTich = "Việt Nam";
	private String hoTen;
	private String truong;
	private int tuoi;
	private float diemToan;
	
	public SinhVien() {
		super();
	}
	public SinhVien(String quocTich, String hoTen, String truong, int tuoi,float diemtoan) {
		super();
		this.quocTich = quocTich;
		this.hoTen = hoTen;
		this.truong = truong;
		this.tuoi = tuoi;
		this.diemToan= diemtoan;
	}
	public SinhVien(String hoTen, String truong, int tuoi,float diemtoan) {
		this.hoTen = hoTen;
		this.truong = truong;
		this.tuoi = tuoi;
		this.diemToan= diemtoan;
	}
	public String getQuocTich() {
		return quocTich;
	}
	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getTruong() {
		return truong;
	}
	public void setTruong(String truong) {
		this.truong = truong;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public float getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}
	
	public float DTB() {
        return diemToan;
    }
	@Override
	public String toString() {
		return "quocTich= " + quocTich + ", hoTen= " + hoTen + ", truong= " + truong + ", tuoi= " + tuoi +", toan = "+diemToan;
	}
	
}
