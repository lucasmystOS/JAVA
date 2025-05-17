public class testetipos {
    

    public static void main(String[] args) {
        
    /*int idade = 30;
    String valor = Connector.Integer.toString(idade);
    System.out.println(valor);*/

    String valor = "30.5";
    float idade = Float.parseFloat(valor);
    System.out.printf("%.3f", idade);

    }
}
