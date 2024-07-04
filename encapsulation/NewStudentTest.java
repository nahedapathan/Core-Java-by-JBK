package in.tka.encapsulation;

public class NewStudentTest {

	public static void main(String[] args) {
		NewStudent obj=new NewStudent();
		obj.setName("harsh");
		obj.setAge(19);
		obj.setRoll(51);
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getRoll());
	}
}
