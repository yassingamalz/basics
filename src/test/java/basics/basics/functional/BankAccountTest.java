package basics.basics.functional;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void applyInterest() {
        List<BankAccount.Account> accounts = new ArrayList<>(List.of(
                new BankAccount.Account(1000, 0.01, LocalDateTime.of(2022, 1, 1, 0, 0)),
                new BankAccount.Account(2000, 0.02, LocalDateTime.of(2023, 1, 1, 0, 0)),
                new BankAccount.Account(3000, 0.03, LocalDateTime.of(2024, 1, 1, 0, 0))
        ));
        List<BankAccount.Account> withInterest = BankAccount.applyInterest(accounts);
        assertEquals(3, withInterest.size());
        assertEquals(3090, withInterest.get(0).getAmount());
        assertEquals(2040, withInterest.get(1).getAmount());
        assertEquals(1010, withInterest.get(2).getAmount());
    }
}