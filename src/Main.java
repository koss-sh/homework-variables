public class Main {
    public static void main(String[] args) {
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var differenceWeight1 = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Первый способ: Разница в весе 2 боксеров равна  " + differenceWeight1 + " кг.");
        var differenceWeight2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Второй способ: Разница в весе 2 боксеров равна  " + differenceWeight2 + " кг.");
    }
}