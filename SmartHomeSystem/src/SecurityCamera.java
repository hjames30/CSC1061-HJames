
public class SecurityCamera implements SmartDevice {
	private boolean isOn;
	private boolean isRecording;

	public SecurityCamera() {
		isOn = false;
		isRecording = false;
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
	public String turnOn() {
		isOn = true;
		return "Smart Security device is now on";
	}

	@Override
	public String turnOff() {
		isOn = false;
		return "Smart Security device is now off";
	}

	@Override
	public String getStatus() {

		if (isOn = false) {
			return "Smart Security is off";
		} else if (isOn = true) {
			return "Smart Security is on";
		}
		return null;
	}
}
