package com.example.hrms.converter;

import com.example.hrms.core.utilities.results.abstracts.DtoToDtoConverter;
import com.example.hrms.dto.CandidateDto;
import com.example.hrms.dto.EmployerDto;
import com.example.hrms.entity.Candidate;
import com.example.hrms.entity.Employer;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CandidateDtoToCandidate implements DtoToDtoConverter<CandidateDto, Candidate> {

    CandidateDto candidateDto;
    Candidate candidate;

    @Override
    public Candidate convertToEntity(CandidateDto candidateDto) {
        candidate =
                new Candidate(
                        candidateDto.getEmail(),
                        candidateDto.getPassword(),
                        candidateDto.getPasswordAgain(),
                        candidateDto.getFirstName(),
                        candidateDto.getLastName(),
                        candidateDto.getIdentityNumber(),
                        candidateDto.getBirthYear());
        return candidate;
    }

    @Override
    public CandidateDto convertToDestination(Candidate candidate) {
        return null;
    }

    @Override
    public Collection<CandidateDto> mapListSourceToDestination(Collection<Candidate> entityList) {
        List<CandidateDto> candidateDtos=entityList.stream().map(candidate-> new CandidateDto(candidate.getFirstName(),candidate.getLastName(),candidate.getIdentityNumber(),candidate.getBirthYear(),candidate.getEmail())).collect(Collectors.toList());

        return candidateDtos;
    }

    @Override
    public Collection<Candidate> mapListDestinationToEntity(Collection<CandidateDto> dtoList) {
        return null;
    }
}
