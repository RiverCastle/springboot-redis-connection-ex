package springexercise.redis.api.dto;

import lombok.Data;
import springexercise.redis.api.InputEntity;

import java.time.LocalDateTime;

@Data
public class DataDto {
    private Long id;
    private String content;
    private LocalDateTime createdAt;

    public static DataDto fromEntity(InputEntity entity) {
        DataDto dto = new DataDto();
        dto.setId(entity.getId());
        dto.setCreatedAt(entity.getCreatedAt());
        dto.setContent(entity.getContent());
        return dto;
    }
}
