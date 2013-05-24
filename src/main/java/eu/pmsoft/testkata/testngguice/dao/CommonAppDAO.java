package eu.pmsoft.testkata.testngguice.dao;

import eu.pmsoft.testkata.testngguice.domain.Department;
import eu.pmsoft.testkata.testngguice.domain.Worker;

public interface CommonAppDAO {

    Department insertOrUpdate(Department department);

    Worker insertOrUpdate(Worker worker);

    Department getDepartment(String depName);

    Worker getWorker(Integer workerId);



}
