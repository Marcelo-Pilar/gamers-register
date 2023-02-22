package com.example.game_register.users.entity;





import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "users_personal_data")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Builder
//@JsonDeserialize(builder = UsersPersonalData.UsersPersonalDataBuilder.class)
public class UsersPersonalData implements Serializable {

    private static final long serialVersionUID = 1L;
//    @OneToMany(mappedBy = "users_personal_data")
//    private Set<UsersContactData> usersContactDataSet;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "userId", nullable = false)
    private Long userId;

    @Column(name = "userName", nullable = false)
    private String userName;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "gender", nullable = false)
    private String gender;

//    @Temporal(TemporalType.DATE)
//    @Column(name = "birthDate", nullable = false)
//    private Date birthDate;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "registerDate", nullable = false)
//    private Date registerDate;

}
