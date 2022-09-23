package com.poli.caja.Entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
@Table(name = "enterprises")
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String document;
    private String phone;
    private String address;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "date_update_at")
    private Date updateAt;
    @OneToMany(mappedBy = "enterprise", fetch = FetchType.LAZY)
    private List<Employee> users;
    @OneToMany(mappedBy = "enterprise", fetch = FetchType.LAZY)
    private List<Transaction> transactions;
}
