import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Main{
	public static Map<Character, Character> swap = new HashMap<Character, Character>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// add swap chart in map
		swap.put('2', '5');
		swap.put('5', '2');
		swap.put('6', '9');
		swap.put('9', '6');

		while(sc.hasNextLine()){
			Map<Character, String> list = new HashMap<Character, String>();
			String input = sc.nextLine();
			String output = "";
			int num = 1;

			for(int i = 0 ; i < input.length(); i++){
				if(!list.containsKey(input.charAt(i))){
					list.put(input.charAt(i), num + "");
					num++;
				}

				String temp = "";
				for(int s = 0; s < list.get(input.charAt(i)).length(); s++){
					if(swap.containsKey(list.get(input.charAt(i)).charAt(s))){
						temp += swap.get(list.get(input.charAt(i)).charAt(s));
					}else{
						temp += list.get(input.charAt(i)).charAt(s);
					}
				}

				output += temp;
			}

			System.out.println(output);
		}
	}
}