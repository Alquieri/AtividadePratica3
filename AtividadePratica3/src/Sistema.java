public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nCADASTRO DE FUNCIONÁRIOS - MENU");
        System.out.println("1) Cadastrar Gerente");
        System.out.println("2) Cadastrar Programador");
        System.out.println("3) Cadastrar Estagiario");
        System.out.println("4) Listar todos os funcionários");
        System.out.println("5) Remover funcionário");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção:");

    }

    private static void verificarOpcao(int op){
        String nome;
        int matricula;

        switch (op) {
            case 1:
            System.out.println("\nCADASTRO DE GERENTE:");
           
            System.out.print("Nome: ");
            nome = Console.lerString();
            System.out.print("Matícula: ");
            matricula = Console.lerInt();
            System.out.print("Equipe: ");
            String equipe = Console.lerString();
            System.out.print("bonus : ");
            int bonus = Console.lerInt();

   
            Gerente gerente = new Gerente(nome, matricula, equipe, bonus);

       
            CadastroFuncionarios.cadastrar(gerente);


            System.out.println("\nGerente cadastrado com sucesso!");

                
                break;
            case 2:

                System.out.println("\nCADASTRO DE DESENVOLVEDOR:");
         
                System.out.print("Nome: ");
                nome = Console.lerString();
                System.out.print("Matícula: ");
                matricula = Console.lerInt();
                System.out.print("Tecnologia: ");
                String tecnologia = Console.lerString();
             
          
                Desenvolvedor Desenvolvedor = new Desenvolvedor (nome, matricula, tecnologia);

           
                CadastroFuncionarios.cadastrar(Desenvolvedor);

              
                System.out.println("\nProgramador cadastrado com sucesso!");

                break;
            case 3: 
            System.out.println("\nCADASTRO DE Estagiario:");
            // leitura dos dados
            System.out.print("Nome: ");
            nome = Console.lerString();
            System.out.print("Matícula: ");
            matricula = Console.lerInt();
            System.out.print("Tecnologia: ");
            String supervisor = Console.lerString();
            System.out.print("Matícula: ");
            int horas = Console.lerInt();
         
      
            Estagiario Estagiario = new Estagiario (nome, matricula, supervisor, horas);

       
            CadastroFuncionarios.cadastrar(Estagiario);

          
            System.out.println("\nProgramador cadastrado com sucesso!");


            break;
            case 4:

            if (CadastroFuncionarios.getListaFuncionarios().size() == 0) {
                System.out.println("Não há funcionários cadastrados...");
                break;
            }
        
            System.out.println("\nFUNCIONÁRIOS CADASTRADOS:");
            for (Funcionario tempFuncionario : CadastroFuncionarios.getListaFuncionarios()) {
                System.out.println(tempFuncionario);
            }

            break;
            case 5:
            System.out.println("\nREMOVER FUNCIONÁRIO");
            System.out.print("Informe a matícula do funcionário: ");
            matricula = Console.lerInt();

            if (CadastroFuncionarios.excluir(matricula)){
                System.out.println("\nFuncionário foi remeovido com sucesso!");
            } else {
                System.out.println("\nFuncionário " + matricula + " não localizado no cadastro");
            }
            break;
            case 6:
            System.out.println("\nCalcular salario gerente");
            System.out.println("\nDigite as horas trabalhadas:");
            int horasTrabalho = Console.lerInt();

            Gerente.CalcularSalario(horasTrabalho);





            case 0:

            System.out.println("\nO Sistema foi finalizado...");
            break;


            default:
            System.out.println("erro");
                break;
        }
        

    }


    public static void executar() {

        int op;

        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }
    
    
}
