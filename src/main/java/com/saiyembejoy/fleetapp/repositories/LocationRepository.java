package com.saiyembejoy.fleetapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saiyembejoy.fleetapp.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
