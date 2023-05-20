package at.fhv.TeamE.shared.dto;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class CustomerOverviewDTO implements Serializable {
    private UUID customerId;
    private String firstName;
    private String lastName;
    private String iban;
    private String birthDate;
    private String email;
    private String address;
    private String city;
    private String country;

    public CustomerOverviewDTO(){

    }

    public CustomerOverviewDTO(UUID customerId, String firstName, String lastName, String iban, String birthDate, String email, String address, String city, String country) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.iban = iban;
        this.birthDate = birthDate;
        this.email = email;
        this.address = address;
        this.city = city;
        this.country = country;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIban() {
        return iban;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerOverviewDTO that = (CustomerOverviewDTO) o;
        return customerId.equals(that.customerId) && firstName.equals(that.firstName) && lastName.equals(that.lastName) && iban.equals(that.iban) && birthDate.equals(that.birthDate) && email.equals(that.email) && address.equals(that.address) && city.equals(that.city) && country.equals(that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, firstName, lastName, iban, birthDate, email, address, city, country);
    }
}