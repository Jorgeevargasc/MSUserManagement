package co.com.cmc.msusermanagement.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private String name;
    private String telephoneNumer;
    private String email;
    private String code;
    private AuthInformation authInformation;
}
