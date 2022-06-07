package co.com.cmc.msusermanagement.application;

import co.com.cmc.msusermanagement.dto.ResponseDto;
import co.com.cmc.msusermanagement.service.IUserManagementService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserManagementApplication implements IUserManagementApplication{

    @Autowired
    private IUserManagementService service;

    @Override
    public ResponseDto getUsers() {
        ResponseDto response = new ResponseDto();
        var userList = service.getUsers();
        if (userList.size() > 3) {
            response.setResponseCode(HttpStatus.CONFLICT.value());
            response.setMessage("Error, la longitud de la lista de usuarios es mayor a 3");
            response.setUserList(null);
            log.error("Error en la longitud de userList");
            return response;
        }
        response.setResponseCode(HttpStatus.OK.value());
        response.setMessage("OK");
        response.setUserList(userList);
        return response;
    }
}
