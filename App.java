

/**
 * App
 */
public class App {

    public static void main(String[] args) {

        ContaInvestimento novaConta = new ContaInvestimento("12345678", "ROMARIO DA SILVA");
        System.err.println("Saldo Inicial: "+novaConta.getSaldo());
        novaConta.investir(1000);
        System.out.println(novaConta.getSaldo());
        System.err.println(novaConta.toString());
        novaConta.adicioneJuros();
        System.out.println(novaConta.getSaldo());
        System.err.println(novaConta.toString());
        novaConta.setTaxaJuros(0.10f);
        novaConta.adicioneJuros();
        System.out.println(novaConta.getSaldo());
        System.err.println(novaConta.toString());


        
    }


}

    
