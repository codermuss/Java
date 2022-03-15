package hrmsSystem.hrms.entities.concretes;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employer_approval_process")
public class EmployerApproval {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "process_id")
    private int processID;

    @NotNull
    @Column(name = "company_name")
    private String companyName;

    @NotNull
    @Column(name = "personnel_name")
    private String personnelName;

    @NotNull
    @Column(name = "date")
    private String date;

    @NotNull
    @Column(name = "result")
    private boolean processResult;
}
