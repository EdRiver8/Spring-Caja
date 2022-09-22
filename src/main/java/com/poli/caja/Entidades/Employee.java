package com.poli.caja.Entidades;

import lombok.*;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Employees")
@Data
@NoArgsConstructor @Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty(message = "Es necesario el correo para registrar el empleado.")
    @Column(length = 40, unique = true, nullable = false)
    private String email;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_profile") //quien recibe el muchos, tiene una columna de union o FK
    private Profile profile;

    @NotEmpty(message = "El Rol solo puede ser Admin u Operario")
    @Column(name = "role")
    private Enum_RoleName role;

    @Column(name = "date_update_at")
    private Date dateUpdateAt;

    @Column(name = "created_at")
    private Date createdAt;

    public Employee(long id, String email, Profile profile, Enum_RoleName role, Date dateUpdateAt, Date createdAt) {
        this.id = id;
        this.email = email;
        this.profile = profile;
        this.role = role;
        this.dateUpdateAt = dateUpdateAt;
        this.createdAt = createdAt;
    }

}
