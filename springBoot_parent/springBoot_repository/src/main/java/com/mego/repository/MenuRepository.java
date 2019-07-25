package com.mego.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mego.entity.Menu;

@Repository
public interface MenuRepository extends BaseRepository<Menu> {
	
	@Modifying
	@Query(value="from Menu t order by t.id asc")
	public List<Menu> QueryAll();
	
	
}
