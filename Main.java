import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int index = -157;     // хранит индекс числа до которого производится суммирование
        int evennumber = 3;   // хранит индекс четного числа
        BigInteger first = new BigInteger("0");     // первое число в последовательности
        BigInteger second = new BigInteger("1");    // второе число в последовательности
        BigInteger third;                               // хранит значение суммы двух предыдущих чисел
        BigInteger sumFib = new BigInteger("0");    // хранит значение суммы четных чисел до [index]
        if (index >= 0) {
            for (int i = 2; i <= index; i++) {
                third = first.add(second);
                first = second;
                second = third;
                if (i == evennumber) {
                    evennumber = evennumber + 3;
                    sumFib = third.add(sumFib);
                }
            }
            System.out.println(sumFib);
        } else {
            for (int i = 2; i <= Math.abs(index); i++) {
                third = first.subtract(second);
                first = second;
                second = third;
                if (i == evennumber) {
                    evennumber = evennumber + 3;
                    sumFib = third.add(sumFib);
                }
            }
            System.out.println(sumFib);
        }
    }
}