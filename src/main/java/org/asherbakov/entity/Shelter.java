package org.asherbakov.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "shelter")
public class Shelter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String schedule;
    @Column(name = "location_map")
    private String locationMap;
    @ManyToOne
    @JoinColumn(name = "pet_type_id")
    private PetType petType;
    @OneToMany(mappedBy = "shelter")
    private Set<Volunteer> volunteerSet = new HashSet<>();

}
