//WAP to reverse every word from the given line of text
class Sentence{
	String str;						//data member
	String strNew="";				//Created an empty string to store reverse words
	Sentence(String str){			//Constructor to assign the sentence
		this.str = str;
	}
	void reverseWords() {					//reversewords method where we will reverse the words
		String[] str1 = str.split(" ");			// converting string in array where it will seperate words if it fine " " in the sentence using split()
		for(String s:str1) {					//taking each words one by one and storing in 's'
			char[] c = s.toCharArray();				//converting  s word into c array
			for(int i=c.length-1;i>=0;i--) {		//taking each character one by one and storing in 'i' in reverse order
				strNew += c[i];						//adding each character one by one 
			}
			strNew += " ";					//adding space again after the word i completed
		}
		strNew = strNew.trim();				//removing extra spaces before and after the line . we have added space it will also add at end to remove it we used trim() 
		System.out.println(strNew);			//displaying reversed string strNew
	}
}

public class ReverseEveryWord {

	public static void main(String[] args) {
		Sentence s = new Sentence("java is simple");			//created an object and assigning value using constructor
		s.reverseWords();									//using object calling method reverseWords()
		
		

	}

}
