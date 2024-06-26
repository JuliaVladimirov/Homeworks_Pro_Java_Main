package org.example.homework_2024_02_15.bank;

public class Ticket implements Comparable<Ticket> {

private int ticketNumber;
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private OperationType operationType;

    public Ticket(int ticketNumber, String firstName, String lastName, int yearOfBirth, OperationType operationType) {
        this.ticketNumber = ticketNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.operationType = operationType;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public OperationType getOperationType() {
        return operationType;
    }

     @Override
    public int compareTo(Ticket other) {
        if (this.ticketNumber == other.ticketNumber) {
            return 0;
        } else if (this.ticketNumber < other.ticketNumber) {
            return -1;
        } else {
            return 1;
        }
    }

    // второй вариант переопределить метод compareTo().
    // @Override
    // public int compareTo(Ticket other) {
    //        return this.ticketNumber - other.ticketNumber;
    //    }

    @Override
    public String toString() {
        return "\nTicket{" +
                "ticketNumber=" + ticketNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", operationType=" + operationType +
                "}";
    }
}

