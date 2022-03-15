package hrmsSystem.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="skill_id")
    private int skillId;

    @Column(name = "skill_name")
    private String skillName;

    @Column(name = "skill_level")
    private String skillLevel;

    @ManyToOne
    @JoinColumn(name = "resume_id")
    private Resume resume;

}
