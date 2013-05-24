package eu.pmsoft.testkata.testngguice.impl.controller;

import com.google.inject.Inject;
import eu.pmsoft.testkata.testngguice.api.OrganizationControlEndpoint;
import eu.pmsoft.testkata.testngguice.api.OrganizationService;
import eu.pmsoft.testkata.testngguice.api.SecurityService;
import eu.pmsoft.testkata.testngguice.domain.Department;
import eu.pmsoft.testkata.testngguice.domain.Worker;

public class OrganizationController implements OrganizationControlEndpoint {

    private final OrganizationService organizationService;

    private final SecurityService securityService;

    @Inject
    public OrganizationController(OrganizationService organizationService, SecurityService securityService) {
        this.organizationService = organizationService;
        this.securityService = securityService;
    }


    @Override
    public Department addWorker(Department target, Worker toTransfer) {
        return null;
    }

    @Override
    public Department updateData(Department reference) {
        return null;
    }
}
