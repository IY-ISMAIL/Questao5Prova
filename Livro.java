package br.com.prova.questaojpa.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
class Livro<Autor> {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String isbn;
    @ManyToMany
    private List<Autor> autores = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAuthors(List<Autor> authors) {
        this.autores = autores;
    }
}