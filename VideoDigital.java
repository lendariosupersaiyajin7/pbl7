public class VideoDigital extends ItensBibliotecaDigital implements Visualizavel {
    private int duracao;
    
    public VideoDigital(String titulo, String autor, double preco, int duracao) {
        super(titulo, autor, preco);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }
    
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void descricao() {
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Duração: " + this.getDuracao());
        System.out.println("Preço: " + this.getPreco());
    }

    @Override
    public void visualizar() {
        throw new UnsupportedOperationException("🤣");
    }


    
}
