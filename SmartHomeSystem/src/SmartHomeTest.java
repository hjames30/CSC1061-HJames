
public class SmartHomeTest {

	public static void main(String[] args) {
		SmartHomeHub alexa = new SmartHomeHub();
		SmartLight hue = new SmartLight();
		hue.setBrightness(50);
		SmartThermostat nest = new SmartThermostat();
		
		SecurityCamera ring = new SecurityCamera();
		alexa.add(hue);
		alexa.add(nest);
		alexa.add(ring);
		alexa.turnAllOn();
		
	}

}
