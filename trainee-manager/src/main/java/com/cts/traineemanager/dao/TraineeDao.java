package com.cts.traineemanager.dao;

import java.util.ArrayList;
import java.util.List;

import com.cts.traineemanager.model.Trainee;

public interface TraineeDao {
	public void registerTrainee(Trainee trainee);
	public Trainee findTraineeByName(String name);
	public List<Trainee> findAllTrainees();
	void removeTrainee(Trainee trainee);
	
}
