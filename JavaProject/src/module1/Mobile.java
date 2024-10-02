package module1;

public class Mobile {
	
	private String company;
	private int model_no;
	private String color;
	private double price;
	private String display;
	private int ram;
	private int rom;
	private String Battery;
	private String Camera;
	private String sim;
	private String version;
	private String launchDate;
	
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile mobile = new Mobile();
		
		mobile.call();
		mobile.messageing();
		mobile.calculator();
		mobile.takePictures();
		mobile.playMusic();
		mobile.playGames();
		mobile.screenRecord();
		mobile.wifi();
		mobile.qr();
		mobile.facelock();
		mobile.voiceRecorder();
		mobile.alarm();
		mobile.bluettoth();
		
		System.out.println("********************************************");
		
		
		mobile.company ="Apple";
		mobile.model_no =124;
		mobile.color="Golden";
		mobile.price=120000;
		mobile.display="120*140";
		mobile.ram =12;
		mobile.rom=512;
		mobile.Battery="6500mhz";
		mobile.Camera="200 mega pixel";
		mobile.sim="Jio";
		mobile.version="Android 15";
		mobile.launchDate="22-Aug-2024";
		
		mobile.display();
		
		System.out.println("********************************************");
		
		
        Mobile mobile2 = new Mobile();
		
		mobile2.call();
		mobile2.messageing();
		mobile2.calculator();
		mobile2.takePictures();
		mobile2.playMusic();
		mobile2.playGames();
		mobile2.screenRecord();
		mobile2.wifi();
		mobile2.qr();
		mobile2.facelock();
		mobile2.voiceRecorder();
		mobile2.alarm();
		mobile2.bluettoth();
		
		System.out.println("********************************************");
		
		
		mobile2.company ="Apple";
		mobile2.model_no =124;
		mobile2.color="Golden";
		mobile2.price=120000;
		mobile2.display="120*140";
		mobile2.ram =12;
		mobile2.rom=512;
		mobile2.Battery="6500mhz";
		mobile2.Camera="200 mega pixel";
		mobile2.sim="Jio";
		mobile2.version="Android 15";
		mobile2.launchDate="22-Aug-2024";
		
		mobile2.display();
		
	

	}

}
