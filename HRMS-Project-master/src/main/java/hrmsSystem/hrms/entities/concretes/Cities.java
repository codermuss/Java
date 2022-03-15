package hrmsSystem.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "city")
public class Cities {
    @Id
    @Column(name = "city_id")
    private int cityId;

    @Column(name = "city_name")
    private String cityName;

}
