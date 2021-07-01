package com.cts.traineemanager.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.traineemanager.exception.InvalidTraineeDataException;
import com.cts.traineemanager.exception.InvalidTraineeOperationException;
import com.cts.traineemanager.model.Trainee;
import com.cts.traineemanager.repo.TraineeRepo;

public class TraineeDaoImpl implements TraineeDao {
	@Autowired
	private TraineeRepo traineeRepo;
	
	@Override
	public void registerTrainee(Trainee trainee) {
		if(trainee.getCohortCode()!=null)
		{
			throw new InvalidTraineeOperationException("Cohort Code Already Present");
		}
		else if(trainee.getCohortCode().charAt(0)<'A' || trainee.getCohortCode().charAt(0)>'Z' || trainee.getCohortCode().length()!=9)
		{
			throw new InvalidTraineeDataException("Cohort is invalid");
		}
		traineeRepo.add(trainee);
	}

	@Override
	public void removeTrainee(Trainee trainee) {
		traineeRepo.remove(trainee);
	}

	@Override
	public Trainee findTraineeByName(String name) {
		List<Trainee> trainees = traineeRepo.getAllTrainees();
		for(Trainee trainee: trainees)
		{
			if(trainee.getName().equals(name)) {
				return trainee;
			}
		}
		return null;
	}

	@Override
	public List<Trainee> findAllTrainees() {
		return traineeRepo.getAllTrainees();
	}

}
