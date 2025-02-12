//WAP to check whether the given string is palindrome or not
class isPalindrome{
	String str;					//data member
	String str2="";				// taking another empty string to compare the other given string
	isPalindrome(String str){		//using constructor assigning the value
		this.str = str;				//assigning the parameter value to data member
	}
	boolean isPalindromeChek() {				//taking a boolean method to check if the string is palindrome or not and return true or false
		for(int i=str.length()-1;i>=0;i--) {		//using for loop to reverse the string 
			char c = str.charAt(i);					//Every time storing new character at the value i
			str2 += c;								//adding every character of c in string str2 and creating reverse string
		}
		if(str.equals(str2)) {					//checking if the 'str2' is equal to 'str'
			return true;						// if it is equal than it is an palindrome, so return true
		}
		return false;							//else return false
	}
}

public class Palindrome {

	public static void main(String[] args) {
		
		isPalindrome p = new isPalindrome("madam");
		System.out.println(p.isPalindromeChek());
		isPalindrome p1 = new isPalindrome("radar");
		System.out.println(p1.isPalindromeChek());

	}

}
