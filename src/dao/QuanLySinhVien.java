package dao;

import java.util.ArrayList;

import model.SinhVien;
import model.svTuNhien;
import model.svXaHoi;

public class QuanLySinhVien {
	private ArrayList<SinhVien> danhSachSinhVien;

    public QuanLySinhVien() {
        danhSachSinhVien = new ArrayList<>();
    }
    
    public void addSinhVien(SinhVien sinhVien) {
    	
        danhSachSinhVien.add(sinhVien);
    }

    public void output() {
    	StringBuffer bf = new StringBuffer();    
        for (SinhVien sinhVien : danhSachSinhVien) {
           bf.append(sinhVien.toString());
            if (sinhVien.DTB() >= 5) {
            	bf.append(", ket qua : Dau");
            	System.out.println();
            } else {
            	bf.append(", ket qua : Rot");
            	System.out.println();
            }
            System.out.println(bf.toString());
            bf.delete(0, bf.length());
        }
    }
    
    
    public void outputSingle(SinhVien sinhVien ) {
    	StringBuffer bf = new StringBuffer();    
           bf.append(sinhVien.toString());
            if (sinhVien.DTB() >= 5) {
            	bf.append(", ket qua : Dau");
            	System.out.println();
            } else {
            	bf.append(", ket qua : Rot");
            	System.out.println();
            }
            System.out.println(bf.toString());
            bf.delete(0, bf.length());
        
    }
    
    public void findSVByAge(int tuoi) {
        System.out.println("Danh sach sinh vien co tuoi tren " + tuoi + ":");
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getTuoi() > tuoi) {
            	outputSingle(sinhVien);
            }
        }
    }
    
    public void findSVByMajor(String chuyenNganh) {
        System.out.println("Danh sach sinh vien theo chuyen nganh " + chuyenNganh + ":");
        for (SinhVien sinhVien : danhSachSinhVien) {
            if ((sinhVien instanceof svTuNhien && chuyenNganh.equals("TuNhien"))
                    || (sinhVien instanceof svXaHoi && chuyenNganh.equals("XaHoi"))) {
            	outputSingle(sinhVien);
                System.out.println();
            }
        }
    }
    
    public void findSVByName(String ten) {
        System.out.println("Danh sach sinh vien co ten " + ten + ":");
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getHoTen().equals(ten)) {
            	outputSingle(sinhVien);
            }
        }
    }
    
    public void findSVByAVG(float n) {
        System.out.println("Danh sách sinh viên có DTB >= " + n + ":");
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            SinhVien sv = danhSachSinhVien.get(i);
            if (sv instanceof svXaHoi) {
            	svXaHoi svxh = (svXaHoi) sv;
                if (sv.DTB() >= n) {
                	outputSingle(sv);
                }
            } else if (sv instanceof svTuNhien) {
            	svTuNhien svtu = (svTuNhien) sv;
            	 if (sv.DTB() >= n) {
                 	outputSingle(sv);
                 }
            }
        }
    }

    
}
