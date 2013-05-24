package eu.pmsoft.testkata.testngguice.api;

import eu.pmsoft.testkata.testngguice.domain.Department;
import eu.pmsoft.testkata.testngguice.domain.Worker;

public interface OrganizationService {

    Department getOrCreate(String name);

    Worker createNewWorker();

    Department save(Department department);

    Worker save(Worker worker);

}
