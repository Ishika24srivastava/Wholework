package test;
import java.util.*;

public class lowestFrequency {
	public static void main(String[]args) {
		String str="grass is green ";
		int[] frq=new int[str.length()];
		char minChar=str.charAt(0);
		int i,j,min;
		char string[]=str.toCharArray();
		for(i=0;i<string.length;i++) {
			frq[i]=1;
			for(j=i+1;j<string.length;j++) {
				if(string[i]==string[j] &&  string[i]!='0') {
					frq[i]++;
					string[j]='0';
				} 
			}
		}
	
	min=frq[0];
	for( i=0;i<frq.length;i++) {
		if(min>frq[i]&& frq[i]!='0')
		{
			min=frq[i];
			minChar=string[i];
		}
	}
		System.out.println("Lowest freuency="+minChar);
	}
	

}
