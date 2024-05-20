public class Calculadora {

    int num1, num2, resultado;

    public Calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int somar(){
        return num1 + num2;
    }
    public int subtrair(){
         return num1 - num2;
    }
    public int multiplicar(){
        return num1 * num2;
    }
    public double dividir(){
        if(num1 != 0 && num2 != 0){
            return num1 / num2;
        }
        return 0;
    }


}
