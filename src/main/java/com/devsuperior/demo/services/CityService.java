package com.devsuperior.demo.services;

import com.devsuperior.demo.dto.CityDTO;
import com.devsuperior.demo.entities.City;
import com.devsuperior.demo.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository repository;

    public List<CityDTO> findAll() {
        return repository.findAll(Sort.by("name")).stream().map(CityDTO::new).toList();
    }

    public CityDTO insert(CityDTO dto) {
        City entity = new City(null, dto.getName());
        entity = repository.save(entity);
        return new CityDTO(entity);
    }
}
