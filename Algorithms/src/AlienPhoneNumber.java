import java.util.Arrays;

/*#### Alien Phone Number ####
# There is a nearby alien planet whose numbers are formatted as
# "xxxx xxxx" where "x" is any numerical digit (0-9). Write a function
# that determines whether a given string is a valid alien phone number.
#
# constraint: You may not use RegExp.
#
# examples:
# alien_phone_number?('1234 5678') #=> true
# alien_phone_number?('ar32 t19i) #=> false
# alien_phone_number?('123 45678') #=> false
# alien_phone_number?('12345678') #=> false
# alien_phone_number?('1234 567') #=> false
# alien_phone_number?('12345 12345') #=> false
*/

public class AlienPhoneNumber {
	private static boolean alienPhoneNumber(String number) {
		final String stringAtIndex4 = Character.toString(number.charAt(4));
		final String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		
		if(number.length() != 9 || !stringAtIndex4.equals(" ")) return false;
		
		for(int i = 0; i < number.length(); i++) {
			final String currentChar = Character.toString(number.charAt(i));

			if(!Arrays.stream(digits).anyMatch(currentChar::equals) && i != 4) return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		final String phoneNumber = "1234 5678";
		final boolean result = alienPhoneNumber(phoneNumber);
		System.out.println(result);
	}

}
