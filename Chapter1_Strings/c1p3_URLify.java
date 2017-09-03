package Chapter1_Strings;

public class c1p3_URLify {

	public static void stringURLify(String s, int truelength) {

        char[] c = s.toCharArray();
		
		StringBuilder s1 = new StringBuilder();
		
		for(int j=0;j<truelength;j++) {
			if(c[j] == ' '){
				s1.append("%20");
			}
			else s1.append(c[j]);
		}	
		
		s.equals(s1.toString());
		
		System.out.println(s1.toString());
		
	}
	
	public static void main(String[] args){
		stringURLify("abc def  rt ",11);
		stringURLify("iuo klkjh 2   ",11);
	}

}