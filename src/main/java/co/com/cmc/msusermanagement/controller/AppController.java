package co.com.cmc.msusermanagement.controller;

import co.com.cmc.msusermanagement.application.IUserManagementApplication;
import co.com.cmc.msusermanagement.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UserManagement/rest")
public class AppController {

    @Autowired
    private IUserManagementApplication application;

    @GetMapping("/users")
    public ResponseEntity<ResponseDto> getInformation() {
        ResponseDto response = application.getUsers();
        return new ResponseEntity<>(response, HttpStatus.valueOf(response.getResponseCode()));
    }
}
