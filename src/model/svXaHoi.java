package model;

public class svXaHoi extends SinhVien{
	private float congDan;
	public svXaHoi() {
		super();
	}
	
	public svXaHoi(String quocTich, String hoTen, String truong, int tuoi, float toan, float congDan) {
		super(quocTich, hoTen, truong, tuoi,toan);
		this.congDan = congDan;
	}

	public svXaHoi(String hoTen, String truong, int tuoi, float toan, float congDan) {
		super( hoTen, truong, tuoi,toan);
		this.congDan = congDan;
	}
	
	public float getCongDan() {
		return congDan;
	}
	public void setCongDan(float congDan) {
		this.congDan = congDan;
	}
	@Override
	public float DTB() {
		// TODO Auto-generated method stub
		return ((congDan*2 + getDiemToan())/3);
	}
	@Override
	public String toString() {
		return "svXaHoi ["+super.toString()+" , congDan= " + congDan +", DTB= " + DTB() + "]";
	}
	
}
