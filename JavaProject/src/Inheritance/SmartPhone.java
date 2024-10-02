package Inheritance;

public class SmartPhone extends Keypad {
	
	
	private String  operatingSystem;
	private boolean videoCall;
	private boolean screenshots;
	private boolean fingerprint;
	
	
	public SmartPhone(String compName, int modelNo, String color, String battery, String sim, double price,
			String supportedNetwork, String messageSupport, String soundQuality, String batterylife,
			String operatingSystem, boolean videoCall, boolean screenshots, boolean fingerprint) {
		super(compName, modelNo, color, battery, sim, price, supportedNetwork, messageSupport, soundQuality,
				batterylife);
		this.operatingSystem = operatingSystem;
		this.videoCall = videoCall;
		this.screenshots = screenshots;
		this.fingerprint = fingerprint;
	}


	@Override
	public String toString() {
		return "SmartPhone [operatingSystem=" + operatingSystem + ", videoCall=" + videoCall + ", screenshots="
				+ screenshots + ", fingerprint=" + fingerprint + ", supportedNetwork=" + supportedNetwork
				+ ", messageSupport=" + messageSupport + ", soundQuality=" + soundQuality + ", batterylife="
				+ batterylife + ", compName=" + compName + ", modelNo=" + modelNo + ", color=" + color + ", battery="
				+ battery + ", sim=" + sim + ", price=" + price + "]";
	}
	
	
	

}
