package entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, unique = true)
    private String name;

    @Column(name = "paginas", nullable = false)
    private Integer pages;

    @Column(name = "capitulos", nullable = false)
    private Integer chapters;

    @Column(nullable = false)
    private String isbn;

    @Column(name = "nome_do_autor",nullable = false, unique = true)
    private String publisherName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})// estudar
    @JoinColumn(name = "author_id")
    private Author author;

}
