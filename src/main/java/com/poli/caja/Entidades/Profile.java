package com.poli.caja.Entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
//@Getter @Setter
@Data //reemplaza getters and setters
@AllArgsConstructor @NoArgsConstructor @Builder //anotaciones de lombok
@Table(name = "profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String image;

    @NotNull(message = "Ingrese el numero de celular")
    private String phone;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "update_at")
    private Date updateAt;

    // tiene el join, asi sea uno a uno, porque el padre seria la clase 'Employee'
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = true, updatable = true)
    private Employee employee;

//    @OneToMany(mappedBy = "profile", fetch = FetchType.LAZY)
//    private List<Employee> employee;

}
