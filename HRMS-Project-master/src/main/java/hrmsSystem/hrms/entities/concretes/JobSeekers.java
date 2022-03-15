package hrmsSystem.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "job_seekers")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "seeker_id",referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resumes"})
public class JobSeekers extends Users{

//    @Id
//    @GeneratedValue
//    @Column(name = "seeker_id")
//    private int seekerId;

    @NotNull
    @Column(name="first_name")
    private String firstName;

    @NotNull
    @Column(name = "last_name")
    private String lastName;

    @NotNull
    @Column(name = "national_id",unique = true)
    private String nationalIdd;

    @NotNull
    @Column(name = "birth_date")
    private String birthDate;


    @OneToMany(mappedBy = "jobSeekers")
    private List<Resume> resumes;

}
