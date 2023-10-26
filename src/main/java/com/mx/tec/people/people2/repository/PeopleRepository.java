package com.mx.tec.people.people2.repository;

import com.mx.tec.people.people2.entity.PeopleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<PeopleEntity, Integer> {
}
