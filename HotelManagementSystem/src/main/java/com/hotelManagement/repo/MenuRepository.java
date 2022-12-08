package com.hotelManagement.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelManagement.model.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, String> {
	// public Menu saveMenu(Menu menu);
	public Menu findByMenuName(String id);

	//public List<Menu> findAllMenu();

	

}
