import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        float primeiroValor = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o primeiro valor: "));
        float segundoValor = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o segundo valor: "));
        int operador = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o qual o operador desejado: \n" +
                "1- Somar " + primeiroValor + " com " + segundoValor + ".\n" +
                "2- subtrair " + primeiroValor + " com " + segundoValor + ".\n" +
                "3- Multiplicar " + primeiroValor + " com " + segundoValor + ".\n" +
                "4- Dividir " + primeiroValor + " com " + segundoValor + ".\n"));

        Calculadora calculadora = new Calculadora(primeiroValor, segundoValor, operador);
        try {
            JOptionPane.showMessageDialog(null, calculadora.calcular());
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao calcular : " + e);
        }
    }
}