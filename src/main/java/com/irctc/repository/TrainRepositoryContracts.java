package com.irctc.repository;

import com.irctc.model.Train;

public interface TrainRepositoryContracts {

	public boolean createIntoTrainTable(Train train);

	public Train getFromTrainTable(Long trainId);

	public Train updateIntoTraintable(Long trainId , Train train);

	public boolean deleteFromTrainTable(Long trainId);

}
