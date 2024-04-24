package springexercise.redis.api;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import springexercise.redis.api.dto.InputDto;

import java.time.LocalDateTime;

@RedisHash
@Data
public class InputEntity {
    @Id
    private Long id;
    private String content;
    private LocalDateTime createdAt;

    public static InputEntity fromDto(InputDto inputDto) {
        InputEntity entity = new InputEntity();
        entity.setContent(inputDto.getContent());
        entity.setCreatedAt(LocalDateTime.now());
        return entity;
    }
}
