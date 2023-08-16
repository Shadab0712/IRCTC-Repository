package com.irctc.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.dto.TrainDTO;
import com.irctc.model.Train;
import com.irctc.repository.TrainRepositoryImplementation;

@Service
public class TrainServiceImplementation implements TrainServiceContracts {

	@Autowired
	private TrainRepositoryImplementation repository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public boolean createTrain(TrainDTO trainDTO) {
		Train createTrain = modelMapper.map(trainDTO, Train.class);
		repository.createIntoTrainTable(createTrain);
		return true;

	}

	@Override
	public TrainDTO getTrain(Long trainId) {
		Train getTrain = repository.getFromTrainTable(trainId);
		TrainDTO trainDTO = modelMapper.map(getTrain, TrainDTO.class);
		return trainDTO;
	}

	@Override
	public TrainDTO updateTrain(Long trainId, TrainDTO TrainDTO) {
		Train recordFromTrainTable = repository.getFromTrainTable(trainId);
		
		recordFromTrainTable.setFromCity(recordFromTrainTable.getFromCity());
		recordFromTrainTable.setToCity(recordFromTrainTable.getToCity());

		Train updatedValues = repository.updateIntoTraintable(trainId, recordFromTrainTable);
		TrainDTO newTrainDTO = modelMapper.map(updatedValues , TrainDTO.class);
		return newTrainDTO;
	}

	@Override
	public boolean deleteTrain(Long trainId) {
		repository.deleteFromTrainTable(trainId);
		return true;

	}

}
