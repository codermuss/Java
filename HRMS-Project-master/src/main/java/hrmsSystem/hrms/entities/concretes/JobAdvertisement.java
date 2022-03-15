package hrmsSystem.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_advertisement")
public class JobAdvertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ad_id")
    private int adId;

//    @NotNull
//    @Column(name = "employer_id")
//    private int employerId;

    @NotNull
    @Column(name = "city")
    private String city;

    @NotNull
    @Column(name = "title")
    private String title;

    @NotNull
    @Column(name = "description")
    private String description;

    @NotNull
    @Column(name = "position_num")
    private int positionNum;

    @NotNull
    @JsonFormat(pattern = "dd-MM-yyy")
    @Column(name = "deadline")
    private String deadline;

    @NotNull
    @Column(name = "is_active")
    private Boolean isActive;

    @ManyToOne()
    @JoinColumn(name = "employer_id")
    private Employers employers;


}
