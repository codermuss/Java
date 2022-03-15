package hrmsSystem.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "experiences")
public class Experiences {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_id")
    private int experinceId;

    @Column(name = "workplace")
    private String workplace;

    @Column(name = "position")
    private String position;

    @Column(name = "start_year")
    private int startYear;

    @Column(name = "quit_year")
    private int quitYear;

    @Column(name = "experience_year")
    private int experinceYear;

    @Column(name = "is_continues")
    private boolean isContinues;

    @ManyToOne()
    @JoinColumn(name = "resume_id")
    private Resume resume;

}
