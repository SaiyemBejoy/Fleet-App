package com.saiyembejoy.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saiyembejoy.fleetapp.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
