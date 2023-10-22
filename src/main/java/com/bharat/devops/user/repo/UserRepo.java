package com.bharat.devops.user.repo;

import com.bharat.devops.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Thursday, 18 January 2024
 */
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}
