
public interface SmartDevice {
	String currentStatus = "null";

	public String turnOn(SmartDevice s);

	public String turnOff(SmartDevice s);

	public String getStatus(SmartDevice s);

	
}
