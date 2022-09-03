package week1.day1;

public class Mobile {
	public void sendsms() {
		System.out.println("please send snapshot");
		
	}
	public void takesnopshot() {
		System.out.println("I have send the snapshot");
	}

	public static void main(String[] args) {
		Mobile Obj=new Mobile();
		Obj.sendsms();
		Obj.takesnopshot();
		

	}

}
