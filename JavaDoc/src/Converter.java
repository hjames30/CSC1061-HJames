/* This is a class that does length conventions 
	Copyright (c) 2025 Holden James
*/

/**
 * Methods For Converting between inches and centimeters 
 * @author Holden James
 * 
 */
public class Converter {
	public static final double CM_PER_Inch =2.54;
	/**
	 * Converts a measurement in centimeters to inches. 
	 * @param cm length in centimeters
	 * @return length in inches
	 */
	public static double toInches(double cm) {
		return cm/CM_PER_Inch;
	}
	/**
	 * Converts a measurement in inches to centimeters
	 * @param inch length in inches
	 * @return length in centimeters
	 */
	public static double toCM(double inch) {
		return inch*CM_PER_Inch;
	}
	/**
	 * Converts a measurement in feet and inches to centimeters 
	 * @param feet length in feet
	 * @param inches length in inches
	 * @return length in centimeters
	 */
	public static double toCM(double feet, int inches) {
		return ((feet*12)+inches)*CM_PER_Inch;
	}
	
}
