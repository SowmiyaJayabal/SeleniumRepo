package week3Assugnments;

public class Automation extends MultipleLanguage implements Language,Testtool  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation a=new Automation();
		a.selenium();
		a.ruby();
		a.java();
		a.python();

	}

	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
		
	}

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
		
	}

}
