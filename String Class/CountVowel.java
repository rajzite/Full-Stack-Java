//WAP to count number of vowels, consonants and words from the given line of text
class Vowel{
	String str;						//data member
	int countVowel = 0;
	int countConstrant = 0;
	int countWord = 0;
	Vowel(String str){				//constructor to assign a sentence
		this.str = str;				//assign the parameter value to data member
		String[] strArr = str.split(" ");		//converting a sentence into words by splitting from " " and storing words in an array 
		for(String strWord : strArr) {			//storing array words into string one by one and added a increment operator to countWord
			String str1 = strWord.toLowerCase();	//converting string into lower case so no need to write extra code for capital letters
			char[] c = str1.toCharArray();			//converting string into an character array 
			for(char c1 : c) {						//taking the character of the word one by one and checking if it is an vowel or not and used increment operator
				if(Character.isAlphabetic(c1)) {	//checking if the character is an alphabet or not
					switch(c1) {					//using switch checking the cases for vowel
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						countVowel++;				//increment operator for countVowel
						break;
					default:						//if the case does not match than it will be constrant ,because it only takes alphabet 
						countConstrant++;			//increment operator for countConstrant
					}
				}
				
			}
			countWord++;						//increment operator for countWord
		}
	}
	void display() {							//this methods display the counts
		System.out.println("Vowels Count : "+countVowel);
		System.out.println("Constrant Count : "+countConstrant);
		System.out.println("Words Count : "+countWord);
		System.out.println("---------------------------------------");
	}
}

public class CountVowel {

	public static void main(String[] args) {
		
		Vowel v = new Vowel("Today is A very good day to go for a trip!!");				//created an object and assign the sentence using the constructor
		v.display();							//call display() method using object
		Vowel v2 = new Vowel("HOW YOU DOING?");
		v2.display();
		
	}

}
