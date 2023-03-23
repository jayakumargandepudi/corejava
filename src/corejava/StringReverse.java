package corejava;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="jayakumar";
		String[] arr = s1.split("");
		String s2="";
		for(int i=arr.length-1;i>=0;i--){
			s2=s2+arr[i];
			
			}
		System.out.println(s2);
	}

}
