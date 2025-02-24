
public class SecurityCamera implements SmartDevice {
	private boolean isOn;
	private boolean isRecording;
	
	public SecurityCamera() {
		isOn = false;
		isRecording=false;
	}

	String toggleRecording() {
		if (isOn = true) {
			if (isRecording = true) {
				isRecording = false;
				return "Recording is turned off";
			} else if (isRecording = false) {
				isRecording = true;
				return "Recording is turned on";
			}
		} else {
			return "Cammera is not on";
		}
		return null;

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
