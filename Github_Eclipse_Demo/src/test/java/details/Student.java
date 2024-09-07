package details;


public class Student extends University{
	
	String name;
	String gender;
	
	public Student(String nm, String gn) {
		super("G H Raisoni");
		name=nm;
		gender=gn;
	}
	
	public void showDetails() {
		System.out.println(name+" & "+gender);
	}
	
	public static void main(String[] args) {
		Student st = new Student("sonu","male");
		st.showDetails();
	}



}