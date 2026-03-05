public class Main {

    public static void main(String[] args) {

        ListaNaoOrdenada<Integer> lista = new ListaNaoOrdenada<>();

        System.out.println("Inserindo 10, 20, 30...");
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);

        System.out.println("Buscar 20: " + lista.buscar(20));
        System.out.println("Buscar 99: " + lista.buscar(99));

        System.out.println("Excluir 20: " + lista.excluir(20));
        System.out.println("Buscar 20 após exclusão: " + lista.buscar(20));

        System.out.println("Excluir 10: " + lista.excluir(10));
        System.out.println("Excluir 30: " + lista.excluir(30));

        System.out.println("Excluir 50 (não existe): " + lista.excluir(50));

        System.out.println("Quantidade final: " + lista.qtd);
    }
}
