package com.example.firstproject.Todo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="todotable")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String taskContent;
    private String taskDesc;
    private Boolean completionStatus;


}

