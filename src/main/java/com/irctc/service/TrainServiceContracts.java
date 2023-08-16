package com.irctc.service;

import com.irctc.dto.TrainDTO;

public interface TrainServiceContracts {

	public boolean createTrain(TrainDTO trainDTO);

	public TrainDTO getTrain(Long trainId);

	public TrainDTO updateTrain(Long trainId, TrainDTO TrainDTO);

	public boolean deleteTrain(Long trainId);
}
