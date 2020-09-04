package net.kmdm1980.aboutkmdm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.kmdm1980.aboutkmdm.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
