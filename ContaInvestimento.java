public class ContaInvestimento {
    private String numeroConta;
    private String nome;
    private float saldo;
    private float taxaJuros;

    /*
     * Construtor
     */
    public ContaInvestimento(String numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = 1000;
        this.taxaJuros = 0.03f;
    }

    public String getNumeroConta(){
        return this.numeroConta;
    }

    public String getNome(){
        return this.nome;
    }

    public float getSaldo(){
        return this.saldo;
    }
    public float getTaxaJuros(){
        return this.taxaJuros;
    }

    public void setTaxaJuros(float tx){
        this.taxaJuros = tx;
    }

    public void setNome(String nm){
        this.nome = nm;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public void setSaldo(float sd){
        this.saldo = sd;
    }

    public void investir(float inv){
        this.saldo+= inv;
    }

    public void adicioneJuros(){
        this.saldo = (saldo * getTaxaJuros()) + saldo;
    }

    public String toString(){
        
        return "===========================\n"+
                " EXTRATO BANCÁRIO\n" +
                " CLIENTE: " + getNome()+"\n"+
                " NUMERO DA CONTA: "+ getNumeroConta()+"\n"+
                " SALDO ATUAL: " + getSaldo()+"\n"+
                "===========================\n";
    }
    
}


