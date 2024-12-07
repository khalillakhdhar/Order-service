package com.elitech.dto.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.elitech.dto.UserDto;

@FeignClient(name = "user-service", url = "http://localhost:8080/api/users")
public interface UserClient {

    @GetMapping("/{id}")
    UserDto getUserById(@PathVariable Long id);
}