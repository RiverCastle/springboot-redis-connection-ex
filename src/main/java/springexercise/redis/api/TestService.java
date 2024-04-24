package springexercise.redis.api;

import springexercise.redis.api.dto.DataDto;
import springexercise.redis.api.dto.InputDto;

import java.util.List;

public interface TestService {

    void post(InputDto inputDto);

    List<DataDto> get();

    void delete();
}
