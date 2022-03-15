package hrmsSystem.hrms.core.cloudinary;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.SuccessDataResult;
import io.swagger.models.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

public interface ClaudinaryService {

    DataResult<?> upload(MultipartFile files) throws IOException;
}
