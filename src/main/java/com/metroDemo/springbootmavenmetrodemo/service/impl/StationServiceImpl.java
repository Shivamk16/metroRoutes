package com.metroDemo.springbootmavenmetrodemo.service.impl;

import com.metroDemo.springbootmavenmetrodemo.entity.Stations;
import com.metroDemo.springbootmavenmetrodemo.repository.StationRepository;
import com.metroDemo.springbootmavenmetrodemo.service.StationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationServiceImpl implements StationService {

    private StationRepository stationRepository;

    public StationServiceImpl(StationRepository stationRepository){
        super();
        this.stationRepository = stationRepository;
    }

    @Override
    public List<Stations> getAllStations() {
        return stationRepository.findAll();
    }
}
