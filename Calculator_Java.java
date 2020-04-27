import java.util.Scanner;

public class Calculator_Java {
	private static Scanner sc;

	public static void main(String[] args) {
		double sum = 0, num;
		String symbol;
		sc = new Scanner(System.in);
		while (true) {
			System.out.println("目前總和為: " + sum);
			System.out.println("請輸入欲執行之操作(+,-,*,/,exit):");
			symbol = sc.next();
			if (symbol.equals("exit")) {
				System.out.println("Bye!");
				break;
			}
			System.out.println("請輸入與總和進行操作之數值:");
			num = sc.nextInt();
			if (symbol.equals("+"))
				sum = sum + num;
			else if (symbol.equals("-"))
				sum = sum - num;
			else if (symbol.equals("*"))
				sum = sum * num;
			else if (symbol.equals("/")) {
				if (num == 0)
					continue;
				else
					sum = sum / num;
			}
		}
	}
}
