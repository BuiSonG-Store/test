package com.example.example.Entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "street")
public class Street extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    @Enumerated(EnumType.ORDINAL)
    private StreetStatus status;
    private Integer districtId;
    @ManyToOne
    @JoinColumn(name = "districtId", insertable = false, updatable = false)
    private District district;
}