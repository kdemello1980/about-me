package net.kmdm1980.aboutkmdm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.kmdm1980.aboutkmdm.model.Title;

public interface TitleRepository extends JpaRepository<Title, Long>{

	@Query("FROM Title WHERE employer.id = ?1")
	List<Title> findTitlesByEmployerId(Long id);
}
