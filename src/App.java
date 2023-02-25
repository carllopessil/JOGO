public class App {
    public static void main(String[] args) throws Exception {
        Jogador jogador = new Jogador("João");
        jogador.receberDano(10);
        System.out.println(jogador.getNome());
        System.out.println(jogador.getHp());
    }
}
