package hrmsSystem.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "resume")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","educations","experiences","languages","skills"})

public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resume_id")
    private int resumeId;

    @Column(name = "github_address")
    private String gitHubAddress;

    @Column(name = "linkedin_address")
    private String linkedinAddress;

    @Column(name = "cover_letter")
    private String coverLetter;


    @OneToMany(mappedBy = "resume")
    private List<Education> educations;


    @OneToMany(mappedBy = "resume")
    private List<Experiences> experiences;


    @OneToMany(mappedBy = "resume")
    private List<Languages> languages;

    @OneToMany(mappedBy = "resume")
    private List<Skills> skills;

    @ManyToOne
    @JoinColumn(name = "seeker_id")
    private JobSeekers jobSeekers;

}
