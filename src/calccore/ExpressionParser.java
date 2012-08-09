/**
 * 
 */
package calccore;

import java.util.regex.*;

/**
 * Class for validating String with regexp.
 * 
 * @author alexandr afanasev
 * 
 */
public class ExpressionParser {
	private Pattern p;
	private Matcher m;

	public ExpressionParser(String expPattern) {
		Pattern p = Pattern.compile(expPattern);
	}

	/**
	 * Validating String with regular expression
	 * 
	 * @param exp
	 *            String to validate
	 * @return boolean result of validation
	 */

	public boolean validate(String exp) {
		m = p.matcher(exp);
		return m.matches();
	}

}
