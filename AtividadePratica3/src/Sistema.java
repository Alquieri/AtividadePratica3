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

        switch (op) {
            case 1:

            
                
                break;
        
            default:
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
