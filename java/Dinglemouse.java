public class Dinglemouse {

	public static int deadAntCount(final String ants) {
		if(ants == null)	return 0;
		String antRemains = ants.replaceAll("ant", "");
		
		return Math.max(count(antRemains, "a"), Math.max(count(antRemains, "n"), count(antRemains, "t")));
	}
	
	/**
	 * Count the occurrence of c in str
	 * @param str 	the original string
	 * @param c		the character to be counted
	 * @return
	 */
	public static int count(String str, String c){
		return str.length() - str.replace(c, "").length();
	}

}