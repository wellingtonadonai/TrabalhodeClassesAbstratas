package ClassAbstrata;

public class Progama {
    public static void main(String[] args) {

        PessoaFisca pessoa = new PessoaFisca();
        pessoa.setNome("Wellington Henrique");
        pessoa.setEndereco("santa fe do sul");
        pessoa.setCPF(422456);
        imprimirTodos(pessoa);

        PessoaJuridica pessoa2 = new PessoaJuridica();
        pessoa2.setNome("Acai e sorveteria");
        pessoa2.setEndereco("Rubineia/São Pulo");
        pessoa2.setCNPJ(232456435);
        imprimirTodos(pessoa2);





    }
    public static void imprimirTodos(Pessoa pessoa){
        System.out.println("Nome:" + pessoa.getNome() + " seu enderço: " + pessoa.getEndereco());
    }
}