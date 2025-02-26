import java.util.ArrayList;

@SuppressWarnings("serial")
public class SmartHomeHub extends ArrayList<SmartDevice> {
	
	public SmartHomeHub() {
		
	}
	public String turnAllOn() {
		for(SmartDevice sd: this) {
			sd.turnOn();
			
		}
		return "All devices are turned on";
	}
	public String turnAllOff() {
		for(SmartDevice s: this) {
			s.turnOff();
		}
		return "All device are turned off";
	}
	public String showAllStatuses() {
		for(SmartDevice sd: this) {
			return sd.getStatus();
		}
		return null;
		
	}
}
