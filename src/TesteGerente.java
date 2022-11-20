public class TesteGerente {
    public static void main(String[] args) {
        Autenticavel ref1 = new Administrador();
        ref1.setSenha(22222);
        Autenticavel ref2 = new Cliente();
        ref2.setSenha(2222);
        Autenticavel ref3 = new Gerente();
        ref3.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(ref1);
        si.autentica(ref2);
        si.autentica(ref3);


        Gerente g1 = new Gerente();
        g1.setNome("Thiago");
        g1.setSenha(1234);
        g1.setSalario(5000);

        System.out.println(g1.autentica(123));
        System.out.println(g1.autentica(1234));

        System.out.println(g1.getBonificacao());
    }
}
