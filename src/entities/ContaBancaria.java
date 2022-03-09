package entities;

public class ContaBancaria {
    private Integer agencia;
    private Integer numConta;
    private Cliente cliente;
    private Double saldo;
    private static final Double SALDO_PADRAO = 0.0;
    private static final Integer AGENCIA_PADRAO = 117;
    
    public ContaBancaria() {
	this.saldo = SALDO_PADRAO;
	this.agencia = AGENCIA_PADRAO;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
	this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
	saldo += valor;
    }
    
    public void sacar(double valor) {
	saldo -= valor;
    }

    @Override
    public String toString() {
	return "ContaBancaria [agencia=" + agencia + ", numConta=" + numConta + ", cliente=" + cliente + ", saldo="
		+ saldo + "]";
    }
    
}
