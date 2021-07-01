package com.cts.traineemanager.repo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cts.traineemanager.model.Trainee;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class TraineeRepoImpl implements TraineeRepo{
	
	@Override
	public void add(Trainee trainee) {
		log.info("Adding trainee to  Repo");
		traineeRepo.add(trainee);
	}

	@Override
	public void remove(Trainee trainee) {
		traineeRepo.remove(trainee);
		
	}
	public List<Trainee> getAllTrainees() {
		
		return traineeRepo;
	}

}
