package hrmsSystem.hrms.entities.concretes;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name="system_personnel")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "personnel_id",referencedColumnName = "id")
public class SystemPersonnel extends Users{

//    @Id
//    @GeneratedValue
//    @Column(name = "personnel_id")
//    private int personnelId;

    @NotNull
    @Column(name = "first_name")
    private String firstName;

    @NotNull
    @Column(name = "last_name")
    private String lastName;


}
