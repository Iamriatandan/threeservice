package com.reservation.reservationservice.dto.clientinfodto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GuestInfoDto {
    private Long guestId;
    private String name;
    private String email;
    private String phoneNumber;
}
