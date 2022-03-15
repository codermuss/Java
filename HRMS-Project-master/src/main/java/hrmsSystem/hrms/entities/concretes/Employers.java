package hrmsSystem.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "employer_id",referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","JobAdvertisement"})
public class Employers extends Users{

//    @Id
//    @GeneratedValue
//    @Column(name = "employer_id")
//    private int employerId;


    @NotNull
    @Column(name = "company_name")
    private String companyName;

    @NotNull
    @Column(name = "web_site_address",unique = true)
    private String webSiteAddress;

    @NotNull
    @Column(name = "phone_number",unique = true)
    private String phoneNumber;

    @OneToMany(mappedBy = "employers")
    private List<JobAdvertisement> jobAdvertisements;


}
