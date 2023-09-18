package com.matt.templateQ.TemplateSpringBoot2.service;

import com.matt.templateQ.TemplateSpringBoot2.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.matt.templateQ.TemplateSpringBoot2.model.Users;
import org.springframework.context.annotation.Lazy;
 
@Lazy
@Service("usersService")
public class UsersService
{

    private UsersRepository usersRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UsersService(UsersRepository usersRepository,BCryptPasswordEncoder bCryptPasswordEncoder)
    {
        this.usersRepository = usersRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }



    public Users findUserName(String name)
    {
        return usersRepository.findByName(name);
    }

    public Users saveUser(Users user)
    {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        user.setRole("admin");
        return usersRepository.save(user);
    }

}
