package com.poli.caja.Entidades;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
//@Getter @Setter
@Data //reemplaza getters and setters
@AllArgsConstructor @NoArgsConstructor @Builder //anotaciones de lombok
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String image;
    private String phone;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "update_at")
    private LocalDate updateAt;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    private Employee employee;

//    @OneToMany(mappedBy = "profile", fetch = FetchType.LAZY)
//    private List<Employee> employee;

}
