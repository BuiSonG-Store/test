package com.example.example.Entity;

import com.example.example.Status.StreetStatus;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "street")
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String name;
    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;
    private String description;
    private StreetStatus status;
}