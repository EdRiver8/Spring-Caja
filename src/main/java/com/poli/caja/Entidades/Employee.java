package com.poli.caja.Entidades;

import lombok.*;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "employees")
@Data @NoArgsConstructor @AllArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Es necesario el correo para registrar el empleado.")
    @Column(length = 40, unique = true, nullable = false)
    private String email;

    @NotNull(message = "El Rol solo puede ser Admin u Operario")
    @Column(name = "role")
    private Enum_RoleName role;

    @Column(name = "date_update_at")
    private Date dateUpdateAt;

    @Column(name = "created_at")
    private Date createdAt;

    @OneToOne(fetch = FetchType.LAZY)
    private Profile profile;

    //quien recibe el muchos, tiene una columna de union o FK
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Transaction> transactions;

}
