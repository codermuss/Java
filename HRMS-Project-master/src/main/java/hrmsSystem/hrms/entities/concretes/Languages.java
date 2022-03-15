package hrmsSystem.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "languages")
public class Languages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private int languageId;

    @Column(name = "language")
    private String language;

    @Column(name = "language_level")
    private int languageLevel;

    @ManyToOne()
    @JoinColumn(name = "resume_id" )
    private Resume resume;

}
