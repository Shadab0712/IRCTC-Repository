package com.irctc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.irctc.dto.TrainDTO;

public interface TrainAPIContracts {
	
	@PostMapping("/api/v1/train/")
	public ResponseEntity<String> createTrain(@RequestBody TrainDTO trainDTO);
	
	@GetMapping("/api/v1/train/{trainId}")
	public ResponseEntity<TrainDTO> getTrain(@PathVariable Long trainId);
	
	@PutMapping("/api/v1/train/{trainId}")
	public ResponseEntity<TrainDTO> updateTrain(@PathVariable Long trainId , @RequestBody TrainDTO trainDTO );
	
	@DeleteMapping("/api/v1/train/{trainId}")
	public ResponseEntity<String> cancelTrain(@PathVariable Long trainId);

}
