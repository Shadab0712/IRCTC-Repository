package com.irctc.repository;

import org.springframework.data.repository.CrudRepository;

import com.irctc.model.Train;

public interface TrainManagementRepository extends CrudRepository<Train , Long> {

}
