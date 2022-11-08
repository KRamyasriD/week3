package week3.AssignmentDay2;

public class Automation extends MultipleLanguage implements Language,TestTool{
	
	public static void main(String[] args) {
		
	 
		Automation Au= new Automation();
		Au.java();
		Au.Selenium();
		Au.python();
		Au.ruby();
		
	}

	public void Selenium() {
		
		
		
	}

	public void java() {
		
		System.out.println("Java");
	}

	@Override
	public void ruby() {
		
		System.out.println("Ruby");
	}

	public void Java() {
		// TODO Auto-generated method stub
		
	}

}