package com.krisroz.demo.repository;

import com.krisroz.demo.entity.Customer;
import com.krisroz.demo.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepostory  extends JpaRepository<Room,Long> {

}
