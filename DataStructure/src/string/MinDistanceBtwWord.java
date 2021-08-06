package string;

public class MinDistanceBtwWord {

	public static void main(String args[]) {

		String str = "the quick the brown quick brown the frog";
		String a = "quick";
		String b = "frog";
		String[] star = str.split(" ");
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < star.length; i++) {
			if (star[i].equalsIgnoreCase(a)) {
				for (int j = 0; j < star.length; j++) {
					if (star[j].equalsIgnoreCase(b)) {
						int dis = Math.abs(i - j) - 1;
						if (min > dis) {
							min = dis;
						}

					}
				}
			}
		}
		if (min == Integer.MAX_VALUE)
			System.out.println("Words not Present");
		else
			System.out.println(min);

	}

}
