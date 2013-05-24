package eu.pmsoft.testkata.testngguice.api;

import eu.pmsoft.testkata.testngguice.domain.User;

public interface UserControlEndpoint {

    public User loginUser( User data , String token);

    public User addUser( User data);
}
