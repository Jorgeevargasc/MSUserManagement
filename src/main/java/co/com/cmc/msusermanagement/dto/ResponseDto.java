package co.com.cmc.msusermanagement.dto;

import lombok.Data;

import java.util.List;

@Data
public class ResponseDto {

    private int responseCode;
    private String message;
    private List<User> userList;
}
