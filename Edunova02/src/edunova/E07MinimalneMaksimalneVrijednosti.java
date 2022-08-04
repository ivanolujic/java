package edunova;

public class E07MinimalneMaksimalneVrijednosti {

	public static void main(String[] args) {
		
		int i = Integer.MAX_VALUE;
		System.out.println(i);
		System.out.println(i+1);
		System.out.println(i+2);
		
		int j = Integer.MIN_VALUE;
		System.out.println(j);
		System.out.println(j-1);
		
		// vrijednosti u javi nisu "crtovni" niz
		// već su niz u kružnici
		// nakon maksimalnog broja, dolazi najveći minimalni
		// pa slijedeći manji, sve do nule

	}

}
