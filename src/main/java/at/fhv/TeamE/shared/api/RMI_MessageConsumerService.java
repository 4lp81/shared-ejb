package at.fhv.TeamE.shared.api;

import at.fhv.TeamE.shared.dto.MessageDTO;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface RMI_MessageConsumerService {

    //ToDo: acknowledge message...
    List<MessageDTO> getMessagesFromSubscribedTopics(String userName);

    //Für notification und so
    void notifyUser(String userName, String message);

    void acknowledgeMessage(String userName, MessageDTO message);

}
