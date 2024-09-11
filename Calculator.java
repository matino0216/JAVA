package Calculator02;

public class Calculator {
    private int num1;
    private int num2;
    private char op;

    public Calculator() {
    }

    public Calculator(int num1, String op, int num2) {
        this.num1 = num1;
        this.op = ' ';
        this.num2 = num2;
    }

    public int getNum1 () {
        return num1;
    }

    public void setNum1 ( int num1){
        this.num1 = num1;
    }

    public int getNum2 () {
        return num2;
    }

    public void setNum2 ( int num2){
        this.num2 = num2;
    }

    public char getOperator () {
        return op;
    }

    public void setOperator ( char op){
        this.op = op;
    }

    public double Calculator () {
        double result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로는 나눌 수 없습니다.");
                } else {
                    result = num1 / num2;
                    break;
                }
            default:
                System.out.println("+, -, *, / 중 선택하여 입력하세요.");
                break;
        }
        return result;
    }
}
