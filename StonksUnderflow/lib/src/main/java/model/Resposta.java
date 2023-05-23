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

}
