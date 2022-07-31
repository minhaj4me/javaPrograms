class Student{
	private String name;
	private int age;
	private String fatherName;
	private int fee;
	private String schoolName;
	void input() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("\nEnter Student Name ");
		name=sc.next();
		System.out.println("Enter Student Age ");
		age=sc.nextInt();
		System.out.println("Enter Student Father Name ");
		fatherName=sc.next();
		System.out.println("Enter Student Fee ");
		fee=sc.nextInt();
		System.out.println("Enter Student School Name ");
		schoolName=sc.next();
	}
	void show() {
		System.out.println("Student Name: "+name+" \n"+"Student Age: "+age+" \n"+"Student Father Name: "+fatherName+" \n"+"Student Fee: "+fee+" \n"+"Student School Name: "+schoolName);
	}
}
public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.input();
		s1.show();
		Student s2=new Student();
		s2.input();
		s2.show();
		Student s3=new Student();
		s3.input();
		s3.show();
		Student s4=new Student();
		s4.input();
		s4.show();
		Student s5=new Student();
		s5.input();
		s5.show();

	}

}
