import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "informe o seu nome completo: ");

        Boolean controle = true;
        Conta conta = new Conta(nome);

        while(controle){
            Integer executarOp = Integer.valueOf(JOptionPane.showInputDialog(null, "Informe a operação desejada: \n" +
                    "1- Depositar \n 2- Sacar \n 3- Verificar saldo \n 4- Sair"));
            if(executarOp > 5) {
                JOptionPane.showMessageDialog(null,"Opção inválida!");
                break;
            }
            switch (executarOp){
                case 1:
                    Float deposito = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o valor do depósito? "));
                    if (conta.depositar(deposito)) {
                        String saldo = String.format("%.2f", conta.getSaldo());
                        saldo = saldo.replace(".", ",");
                        JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso! \n" +
                            "Saldo atual: R$" + saldo);
                    }
                    break;
                case 2:
                    try {
                        Float valorSacar = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o valor deseja sacar? "));
                        conta.sacar(valorSacar);
                        JOptionPane.showMessageDialog(null,"Saque realizado com sucesso! \n"
                                + "Seu novo saldo é de: R$ " + String.format("%.2f", conta.getSaldo()));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                case 3:
                    String verificarSaldo = conta.verificarSaldo();
                    JOptionPane.showMessageDialog(null, verificarSaldo);
                    break;
                case 4:
                    controle = false;
                    break;
            }
        }

    }
}
