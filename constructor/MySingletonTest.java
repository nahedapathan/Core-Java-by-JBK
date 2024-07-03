package in.tka.constructor;

public class MySingletonTest {

	public static void main(String[] args) {
		MySingleton st=MySingleton.getInstance();
		st.getSomeThing();
	}
}
