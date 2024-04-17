public class Ebook extends ItensBibliotecaDigital implements Baixavel {

    public Ebook(String titulo, String autor, double preco) {
        super(titulo, autor, preco);
    }

    public void descricao() {
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Preço: " + this.getPreco());
    }

    @Override
    public void baixar(double valor) {
        throw new UnsupportedOperationException("🤣");
    }
    
}
