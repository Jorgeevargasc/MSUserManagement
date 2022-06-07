package co.com.cmc.msusermanagement.service;

import co.com.cmc.msusermanagement.dto.AuthInformation;
import co.com.cmc.msusermanagement.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class UserManagementService implements IUserManagementService{

    @Override
    public List<User> getUsers() {
        List<User> userList = new ArrayList<User>();
        try {
            //Envía petición a http://IOAuthenticationSystem/UserManagement/rest/UserService/users
            AuthInformation authInformation = AuthInformation.builder().authDate(new SimpleDateFormat("dd-MM-yyyy").format(new Date())).authHour("8:00 AM").authAttempts(2).build();
            User user1 = User.builder().name("Jorge Vargas").telephoneNumer("1234567").email("jorge@emial.com").code("123").authInformation(authInformation).build();
            User user2 = User.builder().name("Asd Asd").telephoneNumer("981274381").email("asd@emial.com").code("321").authInformation(authInformation).build();
            userList.add(user1);
            userList.add(user2);
        } catch (Exception ex) {
            userList = null;
            log.error("Error enviando petición al legado");
        }
        return userList;
    }
}
