package com.example.game_register.users.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users_contact_data")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsersContactData {
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userId", nullable = false)
    private UsersPersonalData usersPersonalData;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userContactId", nullable = false)
    private Long userContactId;

    @Column(name = "phoneNumber", nullable = false, unique = true)
    private String phoneNumber;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "zipCode", nullable = false)
    private String zipCode;
}
