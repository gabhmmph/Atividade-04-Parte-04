public class Carro {

    String modelo;
    String cor;
    int ano;

    void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calculaIdade() {
        return 2026 - ano;
    }
}
