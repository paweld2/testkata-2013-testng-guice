package eu.pmsoft.testkata.testngguice.api;

import eu.pmsoft.testkata.testngguice.domain.Department;
import eu.pmsoft.testkata.testngguice.domain.Worker;

public interface OrganizationControlEndpoint {

    Department addWorker(Department target, Worker toTransfer);

    Department updateData( Department reference);
}
