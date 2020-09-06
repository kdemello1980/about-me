package net.kmdm1980.aboutkmdm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.kmdm1980.aboutkmdm.model.Employer;
import net.kmdm1980.aboutkmdm.model.Title;

public interface EmployerRepository extends JpaRepository<Employer, Long> {
	
}
