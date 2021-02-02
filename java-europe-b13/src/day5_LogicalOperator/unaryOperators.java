package day5_LogicalOperator;

public class unaryOperators {

	public static void main(String[] args) {
		int i1=+10;
		int i2= -100;
		int i3= -(i1+i2);
		
		System.out.println("i1 =" + i1);
		System.out.println("i2 =" + i2);
		System.out.println("i3 =" + i3);
		
		boolean flag= true;
		System.out.println(!flag);
		System.out.println(!!flag);
		
		int i =10, j=5;
		i++;
		--j;
		
		System.out.println("i =" + i); // i=14
		System.out.println("j=" + j); // j=4
		
	// yani println de sag da yada solda olmasi hicbir seyi degistirmiyor.
		
		int res= i++ + --j;
		
		System.out.println("res =" + res);
		
		//eger println den once isleme tabi olursa ++ yada -- degerin saginda olursa islemi mevcut degeriyle yapar.
		// ++ yada -- degerin solunda olursa islem esnasinda islem esnasinda yeni deger baza alinir.
		// yani ornekte oldugu gibi i sagda oldugu icin 11 olarak kalir.
		// j'nin minuse ise solda oldugu icin 4 den 3 e indirilerek hesaplanir.
		// boylece sonuc 14 olur
		
		

	}

}
