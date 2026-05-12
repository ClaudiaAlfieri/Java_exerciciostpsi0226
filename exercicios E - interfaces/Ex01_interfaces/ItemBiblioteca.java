package Ex01_interfaces;

public abstract class ItemBiblioteca implements Emprestavel{

    private String titulo;
    private int anoPublicacao;
    private boolean emprestado;

    public ItemBiblioteca(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    @Override
    public boolean isEmprestado() {
        return emprestado;
    }

    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
        }
    }

    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
        }
    }

    @Override
    public String getInfoEmprestimo() {
        if (emprestado) {
            return "Emprestado";
        } else {
            return "Disponível";
        }
    }

    public abstract String getDescricao();

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
