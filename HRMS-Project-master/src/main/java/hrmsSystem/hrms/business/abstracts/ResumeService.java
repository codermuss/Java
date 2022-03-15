package hrmsSystem.hrms.business.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.core.utilities.results.SuccessDataResult;
import hrmsSystem.hrms.entities.concretes.Resume;
import hrmsSystem.hrms.entities.dtos.ResumeWithAllInformationsDto;

import java.util.List;

public interface ResumeService {
    DataResult<List<Resume>> getAll();
    Result add(Resume resume);
    DataResult<List<Resume>> getResumeByJobSeekerId(int jobSeekerId);
    DataResult<List<ResumeWithAllInformationsDto>> getResumeWithAllInformations(int jobSeekerId);
}
