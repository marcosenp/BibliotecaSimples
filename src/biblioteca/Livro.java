package biblioteca;

public class Livro {

    private String isbn;
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | Autor: " + autor;
    }
}
