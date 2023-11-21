
public class isValidEmail {

	public static boolean isValidEmail (String email) {
		// worked with Bella Chen and Brandon Tran
		for(int i=0;i<=email.length();i++)
		{
			if(email.charAt(i+1)=='@' && (email.substring(0,i).isEmpty()!=true))
			{
				if(email.charAt(email.length()-4)=='.')
				{
					if(email.lastIndexOf(email)-email.charAt(email.length()-4)==3)
						return true;
				}
			}
		}
		return false;
	}
}

