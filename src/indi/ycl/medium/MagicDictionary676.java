package indi.ycl.medium;

import java.util.ArrayList;
import java.util.List;

public class MagicDictionary676 {
	String[] list;
	public MagicDictionary676() {
		
	}

	/** Build a dictionary through a list of words */
	public void buildDict(String[] dict) {
		list=dict;
	}

	/**
	 * Returns if there is any word in the trie that equals to the given word
	 * after modifying exactly one character
	 */
	public boolean search(String word) {
		for (int i = 0; i < list.length; i++) {
			int strlen=list[i].length();
			if(strlen!=word.length()) continue;
			int cnt=0;
			for (int j = 0; j < strlen; j++) {
				if(list[i].charAt(j)-word.charAt(j)!=0)
					cnt++;
				if(cnt==2)
					break;
			}
			if(cnt==1)
				return true;
		}
		return false;

	}

}
