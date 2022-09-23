package com.poli.caja.Repositorios;

import com.poli.caja.Entidades.Employee;
import com.poli.caja.Entidades.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    public Employee findByEmployeeId(Long id);
}
