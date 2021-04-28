package CTExercicio2;

public abstract class Conta {
  public String nome_titular;
  public String cpf_titular;
  public double saldo;
  public int numero;

  public Conta (String nome_titular, String cpf_titular){
    this.nome_titular = nome_titular;
    this.cpf_titular = cpf_titular; 
    this.saldo = 0.0;
    this.numero = 0;
  }

  public Conta (int numero, String nome_titular, String cpf_titular) {
    this.nome_titular = nome_titular;
    this.cpf_titular = cpf_titular;
    this.saldo = 0;
    this.numero = numero;
  }

  // Métodos abstratos
  public void depositar(double valor){
    this.saldo += valor;
  }

  public abstract boolean sacar(double valor);
  
  public abstract void exibirDados();

  public int imprimirTipoConta() {
    if(this.getClass() == ContaPoupanca.class){
        System.out.println("\nConta Poupanca\n");
        return 2;
    }
    return 0;
  };

  // Setters e Getters

  public void setTitular(String nome_titular) {
    this.nome_titular = nome_titular;
  }

  public void setCpfTitular(String cpf_titular) {
    this.cpf_titular = cpf_titular;
  }

  public void setNum(int numero) {
    this.numero = numero;
  }

  public String getNome() {
    return this.nome_titular;
  }

  public String getCpfNome() {
    return this.cpf_titular;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getNumero() {
    return this.numero;
  }
}