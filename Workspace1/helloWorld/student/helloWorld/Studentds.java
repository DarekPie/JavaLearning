package helloWorld;

public class Studentds {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.id = 1000;
		student1.name = "Jhon";
		student1.gender = "male";
		student1.age = 18;
		student1.phone = 223_456_7890L;
		student1.gpa = 3.8;
		student1.degree = 'B';
		student1.international = false;
		student1.compute();
		
		Student student2 = new Student();
		student2.id = 1001;
		student2.name = "Raj";
		student2.gender = "male";
		student2.age = 21;
		student2.phone = 223_456_7999L;
		student2.gpa = 3.4;
		student2.degree = 'M';
		student2.international = true;
		student2.compute();

	}

}

class Student {
	static int computeCount;		// zmienna ktora pozwala byc liczona w zaleznosci od tego ile jest obiektów
	
	int id;
	String name;
	String gender;
	int age;
	long phone;
	double gpa;
	char degree;
	
	boolean international;
	double tuitionFees = 12000.0;
	double internationalFees = 5000.0;
	
	void compute() {
		int nextId = id  + 1;
		computeCount = computeCount + 1;
		
		if(international) {
			tuitionFees = tuitionFees + internationalFees;
		}
		
		System.out.println("\nid: " + id);
		System.out.println("nextId: " + nextId);
		System.out.println("name: " + name);
		System.out.println("gender: " + gender);
		System.out.println("age: " + age);
		System.out.println("phone: " + phone);
		System.out.println("gpa: " + gpa);
		System.out.println("degree: " + degree);
		System.out.println("tuitionFees: " + tuitionFees);
		System.out.println("computeCount: " + computeCount);
		System.out.println();
		
	}
}
