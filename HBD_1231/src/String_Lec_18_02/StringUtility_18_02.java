package String_Lec_18_02;

public class StringUtility_18_02 {



	static int countFreq(String s, int j) {

		char[]a  = s.toCharArray();
		int counter = 0;
		for (int i = 0; i<a.length; ++i) {
			if (a[i]==j) ++ counter;	
		}
		return counter;
	}

}
