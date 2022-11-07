  package org.phone;

public class PhoneInfo {

	public void  phoneName() {
	System.out.println("Oppo");
	}
	public void phoneMieiNum() {
	System.out.println("7200290564");
	}
	public void Camera() {
	System.out.println("8 mega pixels");
	}
	public void storage() {
	System.out.println("128 Ram");
	}
	public void osName() {
	System.out.println("Windows 10");
	}
	public static void main(String[]args ) {
		PhoneInfo k =new PhoneInfo ();
		k.phoneName();
		k.phoneMieiNum();
		k.Camera();
		k.storage();
		k.osName();
	}

} 
