import java.util.ArrayList;

@SuppressWarnings("serial")
public class SmartHomeHub extends ArrayList<SmartDevice> {
	
	public String turnAllOn() {
		for(SmartDevice s: this) {
			s.turnOn(s);
			
		}
		return "All devices are turned on";
	}
	public String turnAllOff() {
		for(SmartDevice s: this) {
			s.turnOff(s);
		}
		return "All device are turned off";
	}
	public String showAllStatuses() {
		for(SmartDevice s:this) {
			return s.getStatus(s);
		}
		return null;
	}
}
