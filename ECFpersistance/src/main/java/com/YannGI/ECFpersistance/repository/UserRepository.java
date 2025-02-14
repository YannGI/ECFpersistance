package com.YannGI.ECFpersistance.repository;

import com.YannGI.ECFpersistance.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
    List<User> findUserByGender(String gender);
}
