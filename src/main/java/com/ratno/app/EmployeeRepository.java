/**
 * 
 */
package com.ratno.app;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author eratnch
 *
 */
public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
