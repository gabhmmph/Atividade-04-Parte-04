public class Principal {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Virtus";
        meuCarro.ano = 2018;
        meuCarro.cor = "Cinza Escuro";

        meuCarro.exibeFichaTecnica();

        System.out.println("Idade do carro: " + meuCarro.calculaIdade());
    }
}
