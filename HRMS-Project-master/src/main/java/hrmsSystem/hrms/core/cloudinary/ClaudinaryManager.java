package hrmsSystem.hrms.core.cloudinary;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.SuccessDataResult;
import io.swagger.models.Model;
import io.swagger.models.Path;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;

@Service
public class ClaudinaryManager implements ClaudinaryService {

    private Cloudinary cloudinary;

//    @Autowired
//    public ClaudinaryManager(Cloudinary cloudinary){
//        this.cloudinary=cloudinary;
//    }


    @SuppressWarnings("rawtypes")
    @Override
    public DataResult upload(MultipartFile files) throws IOException {
        this.cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dzjvcejf4",
                "api_key", "844382981863255",
                "api_secret", "I_fgpCoAIIVrLx7mEsF-9gDHVc4",
                "secure", true));


        return new SuccessDataResult(cloudinary.uploader().upload(files.getBytes(), ObjectUtils.emptyMap()));

    }
}
