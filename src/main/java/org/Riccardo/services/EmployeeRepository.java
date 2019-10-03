package org.Riccardo.services;

import org.Riccardo.models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    /*Employee findByCode(String code);
    List<Employee> findFullNameLike(String fullName);
    List<Employee> findBystartDateGreaterThan(Date startData);

     */


}
