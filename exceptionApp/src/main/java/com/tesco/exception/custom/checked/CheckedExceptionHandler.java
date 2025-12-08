package com.tesco.exception.custom.checked;

public class CheckedExceptionHandler {
    public static void main(String[] args) throws InvalidAgeException {
        VotingService votingService = new VotingService();
        try {
            //risky code, the code may throw any error in future..
            votingService.checkEligibility(12);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally is called");
        }
//        votingService.checkEligibility(10);
    }
}
