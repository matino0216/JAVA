package Calculator02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        String str;

        do {
            System.out.println("첫 번째 값을 입력해 주세요.");
            calc.setNum1(sc.nextInt());
            System.out.print("사칙연산 기호를 입력하세요: \n");
            calc.setOperator(sc.next().charAt(0));
            System.out.println("두 번째 값을 입력해 주세요.");
            calc.setNum2(sc.nextInt());

            System.out.println("답 : " + calc.Calculator());

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            str = sc.next();
        } while (!str.equals("exit"));
    }
}
