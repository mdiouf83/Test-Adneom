package test.technique.adneom.util;

/**
 * @author Malick DIOUF
 *
 */
public class AdneomUtils {

	/**
	 * Allows to check if the value is integer
	 * 
	 * @param value : the value to convert in integer
	 * @return
	 */
	public static boolean isStringInt(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

}
