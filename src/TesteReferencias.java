public class TesteReferencias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Thiago");
        g1.setSalario(5000);

        EditorVideo e1 = new EditorVideo();
        e1.setSalario(2000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(e1);

        System.out.println(controle.getSoma());

    }
}
