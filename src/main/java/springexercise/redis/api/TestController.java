package springexercise.redis.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import springexercise.redis.api.dto.DataDto;
import springexercise.redis.api.dto.InputDto;
import springexercise.redis.api.dto.ResponseDto;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/test")
public class TestController {
    private final TestService testService;

    @PostMapping
    public ResponseDto postTest(@RequestBody InputDto inputDto) {
        testService.post(inputDto);
        return new ResponseDto("잘 저장되었습니다.");
    }

    @GetMapping
    public List<DataDto> getTest() {
        return testService.get();
    }

    @DeleteMapping
    public ResponseDto deleteTest() {
        testService.delete();
        return new ResponseDto("잘 삭제되었습니다.");
    }
}
