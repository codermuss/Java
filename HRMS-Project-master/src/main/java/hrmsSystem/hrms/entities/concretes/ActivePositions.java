package hrmsSystem.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "active_positions")
@AllArgsConstructor
@NoArgsConstructor
public class ActivePositions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "position_id",unique = true)
    private int positionId;

    @Column(name = "position_name",unique = true)
    private String positionName;


}
