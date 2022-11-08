package br.com.gabriel.projectss.addingstudents;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name="STUDENTS")
public class Student {

    @Id
    @Column(name="ID")
    private long id;

    @Column(name="NAME")
    private String name;
    @Column(name="CPF")
    private String cpf;
    @Column(name="YEAR")
    private String year;
    @Column(name="BIRTH_YEAR")
    private Date birthYear;


}
