
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
		System.out.println(alexa.turnAllOn());
		hue.turnOn();
		System.out.println(hue.turnOn());
		nest.turnOn();
		System.out.println(nest.turnOn());
		ring.turnOn();
		System.out.println(ring.turnOn());
		ring.toggleRecording();
		System.out.println(ring.toggleRecording());
		
		System.out.println(hue.setBrightness(75));
		System.out.println(nest.setTemp(25.0));
		System.out.println(ring.toggleRecording());
		
		alexa.showAllStatuses();
		System.out.println(alexa.showAllStatuses());

		
		System.out.println(alexa.turnAllOff());
		
		System.out.println(alexa.showAllStatuses());
		System.out.println(alexa.toString());
	}

}
