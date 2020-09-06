package net.kmdm1980.aboutkmdm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.kmdm1980.aboutkmdm.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

	@Query("FROM Item WHERE title.id = ?1")
	public List<Item> findAllByTitleId(Long id);
}
