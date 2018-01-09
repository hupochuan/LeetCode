package indi.ycl.main;

public class FindSmallestLetterGreaterThanTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a=new char[]{'j','j', 'j'};
		new FindSmallestLetterGreaterThanTarget().nextGreatestLetter1(a, 'j');

	}

	public char nextGreatestLetter(char[] letters, char target) {
		
		if(letters[letters.length-1]<=target){
			for (int i = 0; i < letters.length; i++) {
				if(letters[i]!=target)
					return letters[i];
			}
		}else{
			for (int i = 0; i < letters.length; i++) {
				if(letters[i]-target>0)
					return letters[i];
			}
		}
		return ' ';	

	}
	
	public char nextGreatestLetter1(char[] a, char x) {
		 int n = a.length;

	        //hi starts at 'n' rather than the usual 'n - 1'. 
	        //It is because the terminal condition is 'lo < hi' and if hi starts from 'n - 1', 
	        //we can never consider value at index 'n - 1'
	        int lo = 0, hi = n;

	        //Terminal condition is 'lo < hi', to avoid infinite loop when target is smaller than the first element
	        while (lo < hi) {
	            int mid = lo + (hi - lo) / 2;
	            if (a[mid] > x)     hi = mid;
	            else    lo = mid + 1;                 //a[mid] <= x
	        }
	 
	        //Because lo can end up pointing to index 'n', in which case we return the first element
	        System.out.println(a[lo%n]+" "+lo);
	        return a[lo % n];
	}
	
	
	

}
