package eu.pmsoft.testkata.testngguice.impl.controller;

import eu.pmsoft.testkata.testngguice.api.OrganizationService;
import eu.pmsoft.testkata.testngguice.api.SecurityService;
import eu.pmsoft.testkata.testngguice.api.UserControlEndpoint;
import eu.pmsoft.testkata.testngguice.domain.User;

import javax.inject.Inject;

public class UserController implements UserControlEndpoint {

    private final OrganizationService organizationService;

    private final SecurityService securityService;

    @Inject
    public UserController(OrganizationService organizationService, SecurityService securityService) {
        this.organizationService = organizationService;
        this.securityService = securityService;
    }


    @Override
    public User loginUser(User data, String token) {
        return null;
    }

    @Override
    public User addUser(User data) {
        return null;
    }
}
