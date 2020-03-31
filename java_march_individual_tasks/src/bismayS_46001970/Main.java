package bismayS_46001970;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter Your Name");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		sc.close();
		
		System.out.println(UserMainCode.getFormatedString(s1));
	}

}

class UserMainCode{
	public static StringBuffer getFormatedString(String s1){
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(s1, " ");
		String s2 = st.nextToken();
		String s3 = st.nextToken();
		String s4 = st.nextToken();
		sb.append(s4).append(" ");
		sb.append(s3.substring(0, 1));
		sb.append(".");
		sb.append(s2.substring(0, 1));
		return sb;
	}
	
}