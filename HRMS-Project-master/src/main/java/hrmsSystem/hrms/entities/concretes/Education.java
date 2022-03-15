package hrmsSystem.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "education")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "education_id")
    private int educationId;

    @Column(name = "school_name")
    private String schoolName;

    @Column(name = "department")
    private String department;

    @Column(name = "start_year")
    private int startYear;

    @Column(name = "graduate_year")
    private int graduateYear;

    @Column(name = "is_continues")
    private boolean isContinues;

    @ManyToOne()
    @JoinColumn(name = "resume_id")
    private Resume resume;

}
