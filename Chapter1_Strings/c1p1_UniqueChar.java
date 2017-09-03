package Chapter1_Strings; /*
  ** Assuming String to be ASCII.
  ** Could contain only 128 unique chars
  */
 
public class c1p1_UniqueChar {

    public static boolean isUniqueChar(String s){

		if(s.length()>128) return false;

		boolean[] set = new boolean[128];	
		
		for(int iterator=0;iterator<s.length();iterator++){
			int v = s.charAt(iterator);
			
			if(set[v]) { 
			System.out.println("False");
			return false; 
			}
			
			set[v] = true;
	}
		
		System.out.println("True");	
		return true;
	}
	
	public static void main(String[] args) {
		isUniqueChar("abcdefa");
		isUniqueChar("abcdefg");
	}
	

}