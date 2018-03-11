package indi.ycl.easy;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String[] findWords(String[] words) {
        List<String> result=new ArrayList<String>();
		//0-9 第一行 10-18 二 19-25
		String rol1="qwertyuiopQWERTYUIOP";
		String rol2="asdfghjklASDFGHJKL";
		String rol3="zxcvbnmZXCVBNM";
		for (int i = 0; i < words.length; i++) {
			String str=words[i];
			int rolnum=0;
			Boolean tag=true;
			for (int j = 0; j < str.length(); j++) {
				String chr=String.valueOf(str.charAt(j));
				if(rol1.contains(chr)){
					if(rolnum!=1){
						if(rolnum==0){
							rolnum=1;
						}else{
							tag=false;
							break;
						}
					}
					
				}else if(rol2.contains(chr)){
					if(rolnum!=2){
						if(rolnum==0){
							rolnum=2;
						}else{
							tag=false;
							break;
						}
					}
					
					
				}else if(rol3.contains(chr)){
					if(rolnum!=3){
						if(rolnum==0){
							rolnum=3;
						}else{
							tag=false;
							break;
						}
					}
					
				}
			}
			
			if(tag){
				result.add(str);
			}
			
			
		}
		String[] jieguo=new String[result.size()];
		for (int i = 0; i < result.size(); i++) {
			jieguo[i]=result.get(i);
		}
		return jieguo;

	}

}
