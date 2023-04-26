package model;

public class svTuNhien extends SinhVien{
	private float hoa;
	public svTuNhien() {
		super();
	}
	public svTuNhien(String quocTich, String hoTen, String truong, int tuoi,float diemtoan, float hoa) {
		super(quocTich, hoTen, truong, tuoi,diemtoan);
		this.hoa = hoa;
	}
	public svTuNhien(String hoTen, String truong, int tuoi,float diemtoan, float hoa) {
		super(hoTen, truong, tuoi,diemtoan);
		this.hoa = hoa;
	}
	public float getHoa() {
		return hoa;
	}
	public void setHoa(float hoa) {
		this.hoa = hoa;
	}

	@Override
	public float DTB() {
		return  ((hoa + getDiemToan())/2);
	}
	@Override	
	public String toString() {
		return "svTuNhien [ " +super.toString() + ", hoa=" + hoa +",DTB= "+DTB() + "]";
	}
	
}
