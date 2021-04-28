package CTExercicio2;

public class ContaPoupanca extends Conta implements Investimento {

  ContaPoupanca(String nome_titular, String cpf_titular) {
    super(nome_titular, cpf_titular);
  }

  ContaPoupanca(int numero, String nome_titular, String cpf_titular) {
    super(numero, nome_titular, cpf_titular);
  }

  // Implementação dos métodos abstratos da superclasse
  @Override
  public boolean sacar(double valor) {
    if (this.getSaldo() >= valor) {
      this.saldo -= valor;
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void exibirDados() {
    System.out.println("Nome do titular: " + this.getNome());
    System.out.println("Saldo: " + this.getSaldo());
    System.out.println("Numero da conta: " + this.getNumero());
  }

  public void reajustar(double percentual) {
    double saldoAtual = this.getSaldo();
    double reajuste = saldoAtual + (saldoAtual * (percentual / 100));
    this.depositar(reajuste);
  }
}