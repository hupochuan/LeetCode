package indi.ycl.easy;

public class ConstructtheRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructtheRectangle().constructRectangle(4);

	}

	public int[] constructRectangle(int area) {
		  double floor=Math.floor(Math.sqrt(area));
			int[] re=new int[2];
			while(floor>0){
				if(area%(int)floor==0){
					re[0]=area/(int)floor;
					re[1]=(int)floor;
	                break;
				}
	            floor--;
	            
			}
//			System.out.println(re[0]+" "+re[1]);
			return re;

	}
	
//	 int w = (int)Math.sqrt(area);
//		while (area%w!=0) w--;
//		return new int[]{area/w, w};

}
