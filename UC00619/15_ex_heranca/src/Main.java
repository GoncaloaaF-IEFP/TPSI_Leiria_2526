

public class Main {
    public static void main(String[] args) {

        // Crie uma class Pessoa (com 2 ou 3 param) - > done
        // Crie uma class funcionario que herda de pessoa - > done
        // Crie uma class Cliente  que herda de pessoa - > done


        // Adicione um metodo a Pessoa  - > done
        // Adicione um metodo ao funcionario - > done
        // Adicione um metodo ao Cliente - > done

        // no Main crie uma instância para cada class - > done

        Pessoa p = new Pessoa("carlos", 20, "carlos@mail.com");

        Funcionario f = new Funcionario("ana", 20, "ana@mail.com", "informatica");

        Cliente c = new Cliente("Luis", 10, "Luis@mail.com");

        // use todos os metodos possíveis( Criados por si)

        System.out.println("Pessoa: ");

        p.metodoPessoa();

        System.out.println("Funcionario: ");

        f.metodoPessoa();
        f.metodoFuncionario();

        System.out.println("Cliente: ");

        c.metodoPessoa();
        c.metodoCliente();


        System.out.println("---------------------");
        p.getInfos();
        System.out.println("--");
        f.getInfos();
        System.out.println("--");
        c.getInfos();


    }
}