
public class SmartLight implements SmartDevice {
	private boolean isOn;
	private int brightness;

	public SmartLight() {
		isOn = false;
		brightness=50;
	}
	

	public SmartLight(boolean isOn, int brightness) {
		super();
		this.isOn = isOn;
		this.brightness = brightness;
	}


	public String setBrightness(int level) {
		if (isOn = true) {
			brightness = level;
			return "Brightness set to " + level;
		} else {
			return "You can not set brightness to a light that is off";
		}

	}

	@Override
	public String turnOn() {
		isOn = true;
		return  "smartlight device is now on";
	}

	@Override
	public String turnOff() {
		isOn = false;
		return   "smartlight device is now off";
	}

	@Override
	public String getStatus() {

		if (isOn = false) {
			return  "smartlight is off";
		} else if (isOn = true) {
			return  "smartlight is on";
		}
		return null;
	}

}
