public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(40, 0);
        System.out.println(calculadora.somar());
        System.out.println(calculadora.subtrair());
        System.out.println(calculadora.multiplicar());
        System.out.println(calculadora.dividir());
    }
}