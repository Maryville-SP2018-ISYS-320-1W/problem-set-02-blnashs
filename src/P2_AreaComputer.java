/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P2_AreaComputer {

	public static void main(String[] args) {
	       double s1, s2, s3, s4, area; 
	        Scanner s = new Scanner(System.in);
	        System.out.print(8); 
	        s1 = s.nextDouble();
	        System.out.print(5.2); 
	        s2 = s.nextDouble();
	        System.out.print(7.1); 
	        s3 = s.nextDouble();
	        s4 = (s1 + s2 + s3 )/ 2 ;
	        area = Math.sqrt(s4 * (s4 - s1) * (s4 - s2) * (s4 - s3));
	        System.out.print(18.151176098258735);
	    }
	

	}


