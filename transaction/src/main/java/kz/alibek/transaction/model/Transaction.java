package kz.alibek.transaction.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import kz.alibek.core.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "transactions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Transaction extends BaseEntity {
    private String senderAccountNumber;
    private String receiverAccountNumber;
    private BigDecimal transactionSum;

}
