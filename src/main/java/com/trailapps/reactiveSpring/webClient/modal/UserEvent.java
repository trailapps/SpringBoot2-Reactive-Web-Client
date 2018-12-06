package com.trailapps.reactiveSpring.webClient.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEvent {
    private User user;

 //  privat//e static List<String>  eventIdList = Arrays.asList(UUID.randomUUID().toString(),
        //    UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString());

//    private String eventId;
    private Date  eventDate =  new Date();

  /*  public static String getEventId(){
        Random rand = new Random();
        return eventIdList.get(rand.nextInt(eventIdList.size()));
    }*/


}
