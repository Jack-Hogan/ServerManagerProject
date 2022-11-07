package com.springexample.servermanager.repo;

import com.springexample.servermanager.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

//extends jpa repo with class you want to store plus type of data that primary key holds
public interface ServerRepo extends JpaRepository<Server, Long> {
    //custom method for server class
    Server findByIpAddress(String ipAddress);
}
