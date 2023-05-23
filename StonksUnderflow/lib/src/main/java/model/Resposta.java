package model;

import javax.persistence.*;

@Entity()
@Table(name = "resposta")
public class Resposta {

    @Id
    @GeneratedValue
    private int id;

    private String descricao;

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



}
