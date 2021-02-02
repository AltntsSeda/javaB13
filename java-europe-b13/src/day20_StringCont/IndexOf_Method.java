package day20_StringCont;

public class IndexOf_Method {

	public static void main(String[] args) {
		
		String word1="github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));
		
		System.out.println(word1.indexOf("java"));
		
		String url= "www.okta.com";
		int i =url.indexOf(".");
		System.out.println("Pos of . "+ i);
		System.out.println(url.charAt(i+1));
        
		String title="Java - Google Search";
        
        int dash=title.indexOf('-');
        System.out.println(title.charAt(dash-1));
        System.out.println(title.charAt(dash+1));
        System.out.println("Apple");
        
        String country="United States of America";
        int states=country.indexOf("States");
        System.out.println("Position of States:" + states);
        
        String word2="Java, c++, phyton, tomcat, eclipse"; 
        System.out.println(word2.indexOf(""));
        
        //1)contains
        if (word2.contains("c++")) {
        	System.out.println("c++ is there");
        	
        }else {
        	System.out.println("c++ is not here");
        }
        //2)indexOf()
        if (word2.indexOf("c")>-1) { //eger indexof da aradigimiz veri yoksa sonuc -1 cikar!!
        	System.out.println("c++ is there");
        	
        }else {
        	System.out.println("c++ is not here");
        }
        
	}

}
