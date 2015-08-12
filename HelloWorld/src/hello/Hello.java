/**
 * 
 */
package hello;

/**
 * @author harbison
 *
 */
public class Hello {

	/**
	 * Prints "Hello, world!".
	 * @param args unused
	 */
	public static void main(String[] args) {
		Message message = new Message("Hello, world!");
		System.out.println(message.getMessage());
	}

}
