public class ADLMain {

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n Associação Desportiva Lusitana (ADL)");
            System.out.println("-------- Menu Principal --------");
            System.out.println("1. Gerenciar Associados");
            System.out.println("2. Gerenciar Atividades");
            System.out.println("3. Gerenciar Espaços");
            System.out.println("4. Gerenciar Sócios Dirigentes");
            System.out.println("5. Gerenciar Quotas");
            System.out.println("6. Gerenciar Campeonatos");
            System.out.println("7. Gerar Relatórios");
            System.out.println("8. Sair");
            System.out.print("Digite a opção desejada: ");

            opcao = ScannerUtil.getInt();

            switch (opcao) {
                case 1:
                    // Chamar métodos para gerenciar associados (ex.: cadastrar, consultar)
                    break;
                case 2:
                    // Chamar métodos para gerenciar atividades (ex.: cadastrar, consultar)
                    break;
                case 3:
                    // Chamar métodos para gerenciar espaços (ex.: cadastrar, consultar)
                    break;
                case 4:
                    //. Chamar métodos para gerenciar sócios dirigentes (ex.: cadastrar, consultar)
                    break;
                case 5:
                    // Chamar métodos para gerenciar quotas (ex.: cadastrar, consultar)
                    break;
                case 6:
                    // Chamar métodos para gerenciar campeonatos (ex.: cadastrar, consultar)
                    break;
                case 7:
                    // Chamar métodos para gerar relatórios
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 8);
    }
}

class ScannerUtil {
    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}