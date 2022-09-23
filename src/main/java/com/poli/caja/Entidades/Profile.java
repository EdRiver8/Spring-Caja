package com.poli.caja.Entidades;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
//@Getter @Setter
@Data //reemplaza getters and setters
@AllArgsConstructor @NoArgsConstructor @Builder //anotaciones de lombok
@Table(name = "profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String image;
    private String phone;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "update_at")
    private LocalDate updateAt;

    // tiene el join, asi sea uno a uno, porque el padre seria la clase 'Employee'
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

//    @OneToMany(mappedBy = "profile", fetch = FetchType.LAZY)
//    private List<Employee> employee;

}
