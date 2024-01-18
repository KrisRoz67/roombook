package com.krisroz.demo.repository;

import com.krisroz.demo.entity.Blocklist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocklistRepository extends JpaRepository<Blocklist,Long> {
}
