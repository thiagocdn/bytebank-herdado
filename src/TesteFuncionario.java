public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario thiago = new Gerente();
        thiago.setNome("Thiago");
        thiago.setCPF("000.000.000-00");
        thiago.setSalario(4000);

        System.out.println(thiago.getNome());
        System.out.println(thiago.getBonificacao());

    }
}
