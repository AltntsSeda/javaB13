package day19_String;

public class String_concat {

	public static void main(String[] args) {
	
		String word="java";
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat(" in eclipse" ));
		
		System.out.println(word);
		
		word=word.concat("+Eclipse");
		System.out.println(word);
	
		word=word.concat(" Automation");
		System.out.println(word);
	
		// word=word.concat(123); this will not work
		word= word+123;
		System.out.println(word);
		
		word=word+true;
		System.out.println(word);
	
	    String word2= "Hi";
	    word2=word2.concat("-hey").concat("-How are you").concat("-good");
	    System.out.println(word2);
	
	
	    String b="rumble";
	    b+=b.concat("4").substring(3, b.length()-1);
	    System.out.println(b);
	   
	
	}

}

//java+selenium
//java in eclipse
//java
//java+Eclipse
//java+Eclipse Automation
//java+Eclipse Automation123
//java+Eclipse Automation123true
//Hi-hey-How are you-good

