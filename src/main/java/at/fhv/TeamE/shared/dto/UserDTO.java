package at.fhv.TeamE.shared.dto;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class UserDTO implements Serializable {
    private UUID userId;
    private String username;

    public UserDTO(UUID userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(userId, userDTO.userId) && Objects.equals(username, userDTO.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username);
    }
}
