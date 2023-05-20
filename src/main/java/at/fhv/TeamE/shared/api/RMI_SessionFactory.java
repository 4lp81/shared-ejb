package at.fhv.TeamE.shared.api;


import javax.ejb.Remote;

@Remote
public interface RMI_SessionFactory {
    RMI_Session authenticate(String username, String password);
}