package eu.pmsoft.testkata.testngguice.api;

public interface SecurityService {

    boolean validate(String userID, String token);

}
