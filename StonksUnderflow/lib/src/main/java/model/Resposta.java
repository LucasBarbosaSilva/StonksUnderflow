package model;

import javax.persistence.*;

@Entity
@Table(name = "resposta")
public class Resposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private int ordem;

    @ManyToOne
    @JoinColumn(name = "id_usuarioFK", referencedColumnName = "id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_discussaoFK", referencedColumnName = "id")
    private Discussao discussao;

    @OneToOne
    @JoinColumn(name = "id_moderadorFK", referencedColumnName = "id")
    private Moderador moderador;

    public Resposta(){

    }

    public Resposta(String descricao, int ordem, Usuario usuario, Discussao discussao, Moderador moderador){
        this.descricao = descricao;
        this.ordem = ordem;
        this.usuario = usuario;
        this.discussao = discussao;
        this.moderador = moderador;
    }
    
    

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Discussao getDiscussao() {
		return discussao;
	}

	public void setDiscussao(Discussao discussao) {
		this.discussao = discussao;
	}

	public Moderador getModerador() {
		return moderador;
	}

	public void setModerador(Moderador moderador) {
		this.moderador = moderador;
	}

	@Override
    public String toString() {
    	String resposta = "Usuário "+usuario.getNome()+" respondeu:";
    	resposta += "\n"+this.descricao;
    	return resposta;
    }

}
