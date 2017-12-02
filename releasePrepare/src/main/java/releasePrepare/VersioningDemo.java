package releasePrepare;

public class VersioningDemo {

	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println();
		System.out.println("this program is running version"+
			VersioningDemo.class.getPackage().getImplementationVersion());

	}

}
