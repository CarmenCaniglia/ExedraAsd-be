package carmencaniglia.exedraAsd.entities;

import carmencaniglia.exedraAsd.enums.Categoria;
import jakarta.persistence.*;

@Entity
@Table(name = "prodotti")

public class Prodotto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int disponibilità;
    private String image;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

}
