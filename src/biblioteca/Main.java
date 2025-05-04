package biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro("978-85-01-02317-4", "1984", "George Orwell");
        biblioteca.adicionarLivro("978-85-01-02417-1", "Revolução dos Bichos", "George Orwell");
        biblioteca.adicionarLivro("978-85-01-02417-2", "Dom Casmurro", "Machado de Assis");

        System.out.println("? Lista de livros:");
        for (Livro livro : biblioteca.listarLivros()) {
            System.out.println("- " + livro.getTitulo() + " | " + livro.getAutor() + " | ISBN: " + livro.getIsbn());
        }

        System.out.println("\n? Livros de 'george orwell':");
        for (Livro livro : biblioteca.buscarPorAutor("george orwell")) {
            System.out.println("- " + livro.getTitulo());
        }

        System.out.println("\n? Testando busca por ISBN:");
        Livro resultado = biblioteca.buscarPorIsbn("978-85-01-02417-2");
        if (resultado != null) {
            System.out.println("- Encontrado: " + resultado.getTitulo() + " de " + resultado.getAutor());
        } else {
            System.out.println("- Livro não encontrado.");
        }
    }
}
