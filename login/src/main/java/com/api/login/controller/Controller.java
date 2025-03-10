package com.api.login.controller;

import com.api.login.model.EmployeeDto;
import com.api.login.model.Response;
import com.api.login.model.UserDto;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/authentication")
public class Controller {
    private final String HR_URL = "http://localhost:8082/api/v1/hr";
    private final String EMPLOYEE_URL = "http://localhost:8081/api/v1/employee";
    private RestTemplate restTemplate = new RestTemplate();
    @PostMapping
    public Response Login(@RequestBody UserDto user){
        UserDto hr = restTemplate.getForObject(HR_URL + "/e:" + user.getEmail(), UserDto.class);
        if(!(hr == null)){
            if(hr.getPassword().equals(user.getPassword())){
                //query per ottenere la lista
                List<EmployeeDto> employees = restTemplate.getForObject(
                        EMPLOYEE_URL +"/humanResource/"+ hr.getId(), List.class ); //id humaresource
                //passare la lista
                return new Response(true,"logged", employees, hr.getId());
            }else{
                return new Response(false, "wrong password");
            }
        }else{
            return new Response(false, "user not found");
        }


    }


}
