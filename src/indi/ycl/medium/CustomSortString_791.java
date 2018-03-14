package indi.ycl.medium;

public class CustomSortString_791 {
	//方法很拙
	public String customSortString(String S, String T) {
		StringBuffer s=new StringBuffer(S);
        StringBuffer t=new StringBuffer(T);

        int index=0;
        while(index<s.length()){
            if(t.indexOf(s.charAt(index)+"")==-1)
                s.deleteCharAt(index);	
            else
                index++;
        }
    
        
        for (int i = 0; i < s.length(); i++) {
           t.deleteCharAt(t.indexOf(s.charAt(i)+""));
        }
        index=0;
        while(index<t.length()){
			int pos=s.indexOf(t.charAt(index)+"");
			if(pos!=-1){
				s.insert(pos, t.charAt(index));
				t.delete(index,index+1);
			}
			else
				index++;
		}
        return s.append(t).toString();
	}
	//
	public String customSortString_A(String S, String T) {
		int[] cnt=new int[26];
		for (int i = 0; i < T.length(); i++) {
			cnt[T.charAt(i)-'a']++;
		}
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < S.length(); i++) {
			while(cnt[S.charAt(i)-'a']-->0)
				sb.append(S.charAt(i));
		}
		for (int i = 0; i < cnt.length; i++) {
			while(cnt[i]-->0)
				sb.append((char)'a'+i);
		}
		return sb.toString();
	}

}
