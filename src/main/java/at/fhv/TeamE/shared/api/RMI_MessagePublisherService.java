package at.fhv.TeamE.shared.api;

import javax.ejb.Remote;
import java.sql.Timestamp;

@Remote
public interface RMI_MessagePublisherService{
    void publish(String topic, String title, String message, Timestamp timestamp, String username);
}
