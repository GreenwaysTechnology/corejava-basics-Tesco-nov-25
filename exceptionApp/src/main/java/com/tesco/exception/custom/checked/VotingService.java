package com.tesco.exception.custom.checked;

public class VotingService {
    //enable checked exception or use checked exception
    public void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            //rise exception
            throw new InvalidAgeException("Age Must be 18 or above to vote");
        }
        System.out.println("You are eligible to Vote");
    }
}
