package c02;

public class Zarada {

	public static void main(String[] args) {
		
		double investicija = 1000, stopa = 0.027; 
		double zarada = investicija * stopa;
		investicija += zarada;
		
		System.out.printf(
				"Za godinu dana zaradjeno je %.2f dinara, "
				+ "a ukupna investicija je %.2f dinara. \n", zarada, investicija);
	}
}
