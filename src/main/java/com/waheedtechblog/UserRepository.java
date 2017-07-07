/**
 * 
 */
package com.waheedtechblog;

import org.springframework.data.repository.CrudRepository;

/**
 * @author abdulwaheed18@gmail.com
 *
 */
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}
