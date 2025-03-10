package com.api.humanresource.repository;

import com.api.humanresource.Entity.HumanResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanResourceRepository extends JpaRepository<HumanResource, Long> {
    HumanResource getHumanResourceByEmail(String email);
}
