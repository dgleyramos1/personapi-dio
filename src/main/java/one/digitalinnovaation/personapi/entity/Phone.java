package one.digitalinnovaation.personapi.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovaation.personapi.enuns.PhoneType;

import javax.persistence.*;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false)
    private String number;

}
