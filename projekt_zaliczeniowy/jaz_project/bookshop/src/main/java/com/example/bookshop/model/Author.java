package com.example.bookshop.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @OneToMany(mappedBy = "author")
    private List<Book> books;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
