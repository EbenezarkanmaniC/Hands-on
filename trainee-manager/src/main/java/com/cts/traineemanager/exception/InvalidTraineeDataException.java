package com.cts.traineemanager.exception;

public class InvalidTraineeDataException extends RuntimeException{
	public InvalidTraineeDataException()
	{
		
	}
	public InvalidTraineeDataException(String message)
	{
		super(message);
	}
}
