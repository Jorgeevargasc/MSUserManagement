package co.com.cmc.msusermanagement.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class AuthInformation {

    private String authDate;
    private String authHour;
    private int authAttempts;
}
