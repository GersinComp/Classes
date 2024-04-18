public class Conta {
    private String nome;
    private Float saldo;

    public Conta(String nome) {
        this.nome = nome;
        this.saldo = 0.0f;
    }

    public Boolean depositar(Float valorDepositar) {
        saldo += valorDepositar;
        return true;
    }

    Float sacar(Float valorSacar) throws Exception {
        if (saldo < valorSacar)
            throw new Exception("Saldo insuficiente!");
        else
            saldo -= valorSacar;
        return null;
    }

    public String verificarSaldo() {
        String mensagem = String.format("O seu saldo atual é de: R$ " + "%.2f", saldo);
        mensagem = mensagem.replace(".", ",");
        return mensagem;
    }

    public Float getSaldo() {
        return saldo;
    }
}
