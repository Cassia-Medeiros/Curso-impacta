public class FuncionarioBk { // Tipo Customizado

    private long id;
    private String nome;
    private int idade;
    private String estadoCivil;

    public FuncionarioBk() { // construtor vazio
        this.id = -1L;
        this.nome = "";
        this.idade = -1;
        this.estadoCivil = ""; // inicializacao default
    }

    public FuncionarioBk(long id, String nome, int idade, String estadoCivil) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.estadoCivil = estadoCivil;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id; // this representa a classe onde eu estou
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
