package edu.fit.iuh.cs;

import java.util.List;
import java.util.ArrayList;

public class TestCSVC{
	 private static List<CoSoVatChat> initData() {
	        List<CoSoVatChat> ds = new ArrayList<>();

	        ds.add(new Ban("B01", ChatLieu.GO, KichCo.LON, 4, 1.2, 2.0));
	        ds.add(new Ban("B02", ChatLieu.KIMLOAI, KichCo.VUA, 6, 1.5, 2.5));
	        ds.add(new Ban("B03", ChatLieu.NHUA, KichCo.NHO, 3, 0.8, 1.0));

	        ds.add(new Ghe("G01", ChatLieu.GO, KichCo.NHO, 4, true));
	        ds.add(new Ghe("G02", ChatLieu.NHUA, KichCo.VUA, 4, false));
	        ds.add(new Ghe("G03", ChatLieu.KIMLOAI, KichCo.LON, 3, true));

	        return ds;
	    }

	    public static void main(String[] args) {
	        List<CoSoVatChat> danhSach = initData();

	        System.out.println("===================================== DANH SÁCH CƠ SỞ VẬT CHẤT =====================================");
	        for (CoSoVatChat csvc : danhSach) {
	            System.out.println(csvc);
	        }
	    }
}

