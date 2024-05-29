package ru.netology.javadata_4_hibernate.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor

public class PersonInfo implements Serializable {
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private int age;
    @Column
    private int phone_number;
    @Column
    private String city_of_living;
}
