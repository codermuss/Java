package hrmsSystem.hrms.entities.concretes;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "email_verification")
public class EmailVerification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "verification_id")
    private int verificationId;

    @NotNull
    @Column(name = "user_email",unique = true)
    private String userEmail;

    @NotNull
    @Column(name = "vatidation_code")
    private String validationCode;

    @NotNull
    @Column(name = "the_result")
    private boolean the_result;
}
