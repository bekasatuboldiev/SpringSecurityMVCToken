package com.peaksoft.SpringSecurityMVCToken.repository;

import com.peaksoft.SpringSecurityMVCToken.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
}
