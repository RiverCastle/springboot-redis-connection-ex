package springexercise.redis.api.dto;

import lombok.Data;

@Data
public class ResponseDto {
    private String response;


    public ResponseDto(String response) {
        this.response = response;
    }
}
