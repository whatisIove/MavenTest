package ua.ithillel.homework20;

import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@ToString

public class  Client {
    private long id;
    private String clientName;
    private double balance;

    public Client(long id, String clientName, double balance) {
        this.id = id;
        this.clientName = clientName;
        this.balance = balance;
    }
}