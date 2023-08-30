package week1Assignments;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnumber=0;
		int secondnumber=1;
		for(int i=1;i<=11;++i) {
			System.out.println("Fibbanocci series "+firstnumber);
			int nextnumber=firstnumber+secondnumber;
			firstnumber=secondnumber;
			secondnumber=nextnumber;
			
		}
		
		
	}
}
