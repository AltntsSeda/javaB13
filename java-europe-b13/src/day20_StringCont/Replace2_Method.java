package day20_StringCont;

public class Replace2_Method {

	public static void main(String[] args) {
	
		String sentence="Coding is fun, it is my hobby!!";
		
		String withNoSpace=sentence.replace(" ", "");
				
		System.out.println(withNoSpace);
		System.out.println(sentence);
		
		// replace, with !!!
		
		String replaced=sentence.replace(",", "!!!");

		System.out.println(replaced);
		
		String mixed="€6{$j$a<v|a[&%";
		mixed=mixed.replace("€6{", "");
		System.out.println(mixed);
		mixed=mixed.replace("&%", "");
		System.out.println(mixed);
		//mixed=mixed.replace("$","").replace
	}

}
