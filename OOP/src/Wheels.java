
public class Wheels {
private double rad; 
private String type;

public Wheels(double rad, String type) {
	super();
	this.rad = rad;
	this.type = type;
}

public double getRad() {
	return rad;
}

public void setRad(double rad) {
	this.rad = rad;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

@Override
public String toString() {
	return "Wheels [rad=" + rad + ", type=" + type + "]";
}



}
