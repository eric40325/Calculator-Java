import java.util.Scanner;

public class Calculator_Java {
	private static Scanner sc;

	public static void main(String[] args) {
		double sum = 0, num;
		String symbol;
		sc = new Scanner(System.in);
		while (true) {
			System.out.println("�ثe�`�M��: " + sum);
			System.out.println("�п�J�����椧�ާ@(+,-,*,/,exit):");
			symbol = sc.next();
			if (symbol.equals("exit")) {
				System.out.println("Bye!");
				break;
			}
			System.out.println("�п�J�P�`�M�i��ާ@���ƭ�:");
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
