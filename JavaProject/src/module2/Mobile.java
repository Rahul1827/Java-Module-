
package module2;
import java.util.Scanner;



public class Mobile{
	
	private String company;
	private int model_no;
	private String color;
	private double price;
	private String display;
	private String  ram;
	private String rom;
	private String Battery;
	private String Camera;
	private String sim;
	private String version;
	private String launchDate;
	
	Scanner sc= new Scanner(System.in);
	
	public void getDetails()

	{
		
		System.out.println("Enter the mobile Company Name");
		company=sc.next();
		
		System.out.println("Enter the mobile Model Number");
		model_no=sc.nextInt();
		
		System.out.println("Enter the mobile color");
		color=sc.next();
		
		System.out.println("Enter the mobile Display Details or dimensions");
		display=sc.next();
		
		System.out.println("Enter the mobile Ram");
		ram=sc.next();
		
		System.out.println("Enter the mobile Rom");
		rom=sc.next();
		
		System.out.println("Enter the mobile Battery");
		Battery=sc.next();
		
		System.out.println("Enter the mobile Camera Details");
		Camera=sc.next();
		
		System.out.println("Enter the Sim Name");
		sim=sc.next();
		
		System.out.println("Enter the Android version");
		version=sc.next();
		
		System.out.println("Enter the mobile launch date");
		launchDate=sc.next();
		
		
		
		
	}
	
	public void   call()

	{
		System.out.println("Calling.....");
		
		
	}

	public void   messageing()

	{
		System.out.println("Messaging.....");
		
		
	}
	
	
	
	public void   calculator()

	{
		System.out.println("Calculating.....");
		
		
	}
	
	
	
	public void   takePictures()

	{
		System.out.println("Taking Pictures.....");
		
		
	}
	
	
	public void   playMusic()

	{
		System.out.println("Playing Music.....");
		
		
	}
	
	
	
	public void   playGames()

	{
		System.out.println("Playing Games.....");
		
		
	}
	
	
	
	public void   screenRecord()

	{
		System.out.println("Screen Recording.....");
		
		
	}
	
	
	public void   wifi()

	{
		System.out.println("Wifi is on/off.....");
		
		
	}
	
	
	public void   qr()

	{
		System.out.println("Scanning the QR code.....");
		
		
	}
	
	public void   facelock()

	{
		System.out.println("face lock Activated.....");
		
		
	}
	
	public void   voiceRecorder()

	{
		System.out.println("Voice is Recorded.....");
		
		
	}
	
	
	public void   alarm()

	{
		System.out.println("Alarm is set.....");
		
		
	}
	
	public void   bluettoth()

	{
		System.out.println("Your bluetooth device is connected.....");
		
		
	}
	
	public void display()
	{
		

		
		
		System.out.println("Company is ="+company);
		System.out.println("Model Number is ="+model_no);
		System.out.println("Color is ="+color);
		System.out.println("Price is ="+price);
		System.out.println("Display is ="+display);
		System.out.println("Ram is ="+ram);
		System.out.println("Rom is ="+rom);
		System.out.println("Battery is ="+Battery);
		System.out.println("Camera is ="+Camera);
		System.out.println("Sim is ="+sim);
		System.out.println("Version is ="+version);
		System.out.println("Launch Date is ="+launchDate);
		
	}
	
	

}