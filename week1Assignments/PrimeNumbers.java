package week1Assignments;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		boolean flag=false;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				flag=true;
				
			}
		}
		if(flag!=false) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a prime number");
		}

	}

}
