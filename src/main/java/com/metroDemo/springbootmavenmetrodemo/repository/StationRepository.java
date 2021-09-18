package com.metroDemo.springbootmavenmetrodemo.repository;

import com.metroDemo.springbootmavenmetrodemo.entity.Stations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Stations,Long> {

}
