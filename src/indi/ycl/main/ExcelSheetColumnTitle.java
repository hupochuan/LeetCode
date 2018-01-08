package indi.ycl.main;

import java.util.ArrayList;
import java.util.List;

public class ExcelSheetColumnTitle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ExcelSheetColumnTitle().convertToTitle(26));
		

	}
	//转换为26进制
	public String convertToTitle(int n) {
		StringBuffer re=new StringBuffer();
		List<Integer> trans=new ArrayList<Integer>();
		while(n!=0){
			n--;
			trans.add(n%26);
			n/=26;
		}

		for (int i = trans.size()-1; i >=0; i--) {
			
				re.append((char)(65+trans.get(i)));
			
		}
		return re.toString();

	}

}
