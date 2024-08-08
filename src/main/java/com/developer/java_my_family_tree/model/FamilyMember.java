package com.developer.java_my_family_tree.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FamilyMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FAMILY_MEMBER_ID")
    int id;
    private String name;
    private String lastname;
    private String surname;
    private LocalDate birthday;
    private String PlaceOfBirth;
}
