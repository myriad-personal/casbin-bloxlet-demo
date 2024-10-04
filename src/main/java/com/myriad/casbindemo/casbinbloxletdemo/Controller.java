package com.myriad.casbindemo.casbinbloxletdemo;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/data")
    @RolesAllowed("user")
    public String getData() {
        return "get data";
    }
    @DeleteMapping("/data")
    @RolesAllowed("admin")
    public String deleteData() {
        return "delete data";
    }

    // TODO: fix me in the library! No one will have access to this role until I fix the expansion for this assignment in the granted authorities converter.
    @GetMapping("/special")
    @RolesAllowed("special-hat")
    public String getSpecialHatData() {
        return "special-hat data";
    }
}
