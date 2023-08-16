package com.irctc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.dto.TrainDTO;
import com.irctc.service.TrainServiceImplementation;

@RestController
public class TrainAPIImplementation implements TrainAPIContracts {

	@Autowired
	private TrainServiceImplementation service;

	@PostMapping("/api/v1/train/")
	public ResponseEntity<String> createTrain(@RequestBody TrainDTO trainDTO) {
		service.createTrain(trainDTO);
		return new ResponseEntity<>("Train details created", HttpStatus.CREATED);
	}

	@GetMapping("/api/v1/train/{trainId}")
	public ResponseEntity<TrainDTO> getTrain(@PathVariable Long trainId) {
		TrainDTO getTrain = service.getTrain(trainId);
		return new ResponseEntity<>(getTrain, HttpStatus.OK);

	}

	@PutMapping("/api/v1/train/{trainId}")
	public ResponseEntity<TrainDTO> updateTrain(@PathVariable Long trainId, @RequestBody TrainDTO trainDTO) {
		TrainDTO updateTrain = service.updateTrain(trainId, trainDTO);
		return new ResponseEntity<>(updateTrain, HttpStatus.OK);

	}

	@DeleteMapping("/api/v1/train/{trainId}")
	public ResponseEntity<String> cancelTrain(@PathVariable Long trainId) {
		service.deleteTrain(trainId);
		return new ResponseEntity<String>("Train deleted", HttpStatus.OK);

	}

}
