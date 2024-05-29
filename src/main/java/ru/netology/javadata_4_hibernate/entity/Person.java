package ru.netology.javadata_4_hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persons")
@Entity
public class Person  {

        @Column(nullable = false, name = "phone_number", unique = true)
        private String phoneNumber;
        @Column(nullable = false, name = "city_of_living")
        private String cityOfLiving;
}
