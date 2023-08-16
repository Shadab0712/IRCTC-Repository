package com.irctc.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.irctc.model.Train;

@Repository
public class TrainRepositoryImplementation implements TrainRepositoryContracts {

	@Autowired
	private TrainManagementRepository repository;
	
	@Override
	public boolean createIntoTrainTable(Train train) {
		repository.save(train);
		return true;
	}

	@Override
	public Train getFromTrainTable(Long trainId) {
		Optional<Train> trainOptional = repository.findById(trainId);
		if(trainOptional.isPresent()) {
			Train getTrain = trainOptional.get();
			return getTrain;
		}
		return null;
	}

	@Override
	public Train updateIntoTraintable(Long trainId, Train train) {
		Train updateTrain = repository.save(train);
		return updateTrain;
	}

	@Override
	public boolean deleteFromTrainTable(Long trainId) {
		repository.deleteById(trainId);
		return true;
	}

}
