package com.cts.traineemanager.exception;

public class InvalidTraineeOperationException extends RuntimeException{
	public InvalidTraineeOperationException() {
		
	}
	public InvalidTraineeOperationException(String message)
	{
		super(message);
	}
}
