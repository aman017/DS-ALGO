package string;

public class MinDistanceBtwWord2 {

	public static void main(String args[]) {

		String str = "the quick the brown quick brown the frog ";
		String a = "quick";
		String b = "frog";
		String[] star = str.split(" ");
		int min = Integer.MAX_VALUE;
		int i = 0, prev = 0;
		for (i = 0; i < star.length; i++) {
			if (star[i].equalsIgnoreCase(a) || star[i].equalsIgnoreCase(b)) {
				prev = i;
				break;
			}
		}

		for (i = 0; i < star.length; i++) {
			if (star[i].equalsIgnoreCase(a) || star[i].equalsIgnoreCase(b)) {
				if (!star[prev].equalsIgnoreCase(star[i]) && min > prev - i) {
					min = i-prev;
				}
				prev = i;
			}

		}
		if (min == Integer.MAX_VALUE)
			System.out.println("Words not Present");
		else
			System.out.println(min);

	}

}
