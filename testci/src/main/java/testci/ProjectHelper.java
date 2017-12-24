package testci;

public class ProjectHelper {

	public static void main(String[] args) {
		System.out.println(myConcat("Hello","world"));
		
	}
	public static String myConcat(String str1, String str2){
		return str1.concat(" my ").concat(str2);
	}
	

}
