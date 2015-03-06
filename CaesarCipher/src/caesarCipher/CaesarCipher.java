package caesarCipher;

public class CaesarCipher {

	/**
	 * encrypts a given string
	 * 
	 * @param original
	 * @param key
	 *            1- 10
	 * @return
	 */
	public static String encrypt(String original, int key) {

		char ch;
		String encryptedText = "";

		for (int loop = 0; loop < original.length(); loop++) {
			// obtain next character to be encrypted
			ch = original.charAt(loop);

			// apply the key to encrypt
			ch = (char) (ch + key);

			// append encrypted character to end of string
			encryptedText += ch;
		}
		return encryptedText;
	}

	/**
	 * Decrypts a given string
	 * 
	 * @param original
	 * @param key
	 *            1 - 10
	 * @return
	 */
	public static String decrypt(String original, int key) {

		char ch;
		String encryptedText = "";

		for (int loop = 0; loop < original.length(); loop++) {
			// obtain next character to be encrypted
			ch = original.charAt(loop);

			ch = (char) (ch - key);

			// append decrypted character to end of string
			encryptedText += ch;
		}

		return encryptedText;

	}

	/**
	 * Tester class
	 */
	public static void main(String[] args) {

		System.out.println(encrypt("Aidan was here", 4));
		System.out.println(decrypt("Emher${ew$livi", 4));

		// code breaker
		for (int loop = 1; loop < 10; loop++) {
			System.out
					.println("Attempt with key : "
							+ loop
							+ " : "
							+ decrypt(
									"Fi$xli$jmvwx$xs$iqemp$qi$xli${svhw$Iewxiv$Ikk$erh${mr$e$tvm~i2$[mrriv$errsyrgih$ex$xli$ri|x$pigxyvi",
									loop));
		}
	}

}
