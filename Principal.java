public class Principal {
    
    public static void main(String [] args) {
        Pessoa pessoa = new Pessoa ();
        pessoa.setNome("Yara");
        System.out.println(pessoa.getNome());
        pessoa.setIdade(16);
        System.out.println(pessoa.getIdade());
        pessoa.setCelular("(18)99212-7896");
        System.out.println(pessoa.getCelular());
        pessoa.setCpf("614.547.789-89");
        System.out.println(pessoa.getCpf());
    }
}
