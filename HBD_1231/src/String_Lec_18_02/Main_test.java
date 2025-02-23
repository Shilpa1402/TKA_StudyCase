package String_Lec_18_02;

public class Main_test {
	//find the frequancy of given character?
	public static void main(String[] args) {
		//		StringUtility_18_02 s =new StringUtility_18_02();
		//		System.out.println (StringUtility_18_02.countFreq("Hello", 'l'));
		String s = "good 4566hello ...123445..";
		// count AEIOU.
		char a[]=s.toCharArray();
		int ccounter =0;
		int Vcounter =0;
		int dcounter =0;
		for (int i = 0; i<a.length;++i) {
			char t = a[i];
			if( t == 'A' ||t == 'E' || t == 'I'||
					t=='O' ||t == 'U'||
					t == 'a' || t == 'e' || t == 'i'|| t=='o' ||t == 'u')
				++ Vcounter;
			else if ((t>='A' && t <= 'Z') || (t >= 'a' && t <= 'Z'))
				++ccounter;
			else if (t >= '0' && t <= '9')
				++dcounter; 
		}
		System.out.println("vowels" + Vcounter);
		System.out.println("cononants" + ccounter);
		System.out.println("cononants" + dcounter);
	}
}

