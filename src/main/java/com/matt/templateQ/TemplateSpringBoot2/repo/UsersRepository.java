package com.matt.templateQ.TemplateSpringBoot2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.matt.templateQ.TemplateSpringBoot2.model.Users;
@Repository("usersRepository")
public interface UsersRepository extends JpaRepository<Users, Long>
{
    Users findByEmail(String email);
    Users findByName(String name);


    String Q="select link from users where name=? ";
    @Query(value = Q,nativeQuery = true)
    Users findByLiQ(String name);


}