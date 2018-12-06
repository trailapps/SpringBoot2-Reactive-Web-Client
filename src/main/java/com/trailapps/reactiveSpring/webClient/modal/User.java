package com.trailapps.reactiveSpring.webClient.modal;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
@AllArgsConstructor@NoArgsConstructor
@ToString
public class User {

    @Id
    private String userId;
    private String name;
    private Date creationDate = new Date();

}