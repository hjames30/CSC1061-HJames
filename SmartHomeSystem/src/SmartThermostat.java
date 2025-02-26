
public class SmartThermostat implements SmartDevice {
	private boolean isOn;
	private double temp;
	
	public SmartThermostat() {
		isOn= false;
		temp = 70;
	}

	String setTemp(double level) {
		if (isOn = true) {
			temp = level;
			return "Temp is set to " + level;

		} else {
			return "Can not set temp on a thermostat that is off";
		}
	}

	@Override
	public String turnOn() {
		isOn = true;
		return  "SmartThrm device is now on";
	}

	@Override
	public String turnOff() {
		isOn = false;
		return  "SmartThrm device is now off";
	}

	@Override
	public String getStatus() {

		if (isOn = false) {
			return  "SmartThrm is off";
		} else if (isOn = true) {
			return  "SmartThrm is on";
		}
		return null;
	}

}
