package springexercise.redis.api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springexercise.redis.api.dto.DataDto;
import springexercise.redis.api.dto.InputDto;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final TestRepository testRepository;
    @Override
    public void post(InputDto inputDto) {
        testRepository.save(InputEntity.fromDto(inputDto));
    }

    @Override
    public List<DataDto> get() {
        List<DataDto> result = new ArrayList<>();
        Iterable<InputEntity> allEntities = testRepository.findAll();
        for (InputEntity entity : allEntities) result.add(DataDto.fromEntity(entity));
        return result;
    }

    @Override
    public void delete() {
        testRepository.deleteAll();
    }
}
