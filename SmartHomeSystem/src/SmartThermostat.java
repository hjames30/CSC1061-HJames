
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
	public String turnOn(SmartDevice s) {
		isOn = true;
		return s + " device is now on";
	}

	@Override
	public String turnOff(SmartDevice s) {
		isOn = false;
		return s + " device is now off";
	}

	@Override
	public String getStatus(SmartDevice s) {

		if (isOn = false) {
			return s + " is off";
		} else if (isOn = true) {
			return s + " is on";
		}
		return null;
	}

}
