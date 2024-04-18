import javax.swing.*;

public class Calculadora {
    private Float num1;
    private Float num2;
    private Integer operador;

    public Calculadora(Float num1, Float num2, Integer operador) {
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;
    }

    private Float soma() {
        return num1 + num2;
    }

    private Float subtracao() {
        return num1 - num2;
    }

    private Float multiplicacao() {
        return num1 * num2;
    }

    private Float divisao() throws Exception {
        if (num2.equals(0.0f)) {
            throw new Exception("Não é possível fazer a divisão por 0!");
        }
        return num1 / num2;
    }

    Float calcular () throws Exception{
        if (operador > 4)
            throw new Exception("Operador inválido!");

        switch(operador) {
            case 1:
                return soma();
            case 2:
                return subtracao();
            case 3:
               return multiplicacao();
            case 4:
                return divisao();
            default:
                throw new Exception("operação inválida!");
        }
    }
}
