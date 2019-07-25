package com.mego.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.mego.entity.BaseEntity;

@Repository
@NoRepositoryBean
public interface BaseRepository<T> extends JpaRepository<T, Integer> {

}
