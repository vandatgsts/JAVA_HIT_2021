package bai4;

public class Main4 {
    public static void main(String[] args) {
        Sum<Integer> integerSum = new Sum<>(4,5);
        System.out.println("SUM INTEGER = " + (integerSum.getA() + integerSum.getB()));
        Sum<Long> longSum = new Sum<>(1L,5L);
        System.out.println("SUM LONG = " + (longSum.getA() + longSum.getB()));
        Sum<Float> floatSum = new Sum<>(4.8f,4f);
        System.out.println("SUM FLOAT = " + (floatSum.getA() + floatSum.getB()));
        Sum<Double> doubleSum = new Sum<>(100.423D,6.23432D);
        System.out.println("SUM DOUBLE = " + (doubleSum.getA() + doubleSum.getB()));
    }
}
