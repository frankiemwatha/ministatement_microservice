package mwatha.mfsdemo.customerkyc.ministatement_microservice.Model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "customerloans", schema = "public")
public class Customer {
    @ApiModelProperty(notes = "identification document")
    @Id
    public int id_number;

    @ApiModelProperty(notes = "loan id")
    private String loan_id;

    @ApiModelProperty(notes = "loan status either active or not active")
    private String  status;

    @ApiModelProperty(notes = "loan amount")
    private int amount;

    @ApiModelProperty(notes = "loan amount")
    private int fees_paid;

    @ApiModelProperty(notes = "Date loan disbursed")
    private Timestamp date_disbursed;

    public int getAmount() {
        return amount;
    }

    public int getFees_paid() {
        return fees_paid;
    }

    public int getId_number() {
        return id_number;
    }

    public String getLoan_id() {
        return loan_id;
    }

    public String getStatus() {
        return status;
    }

    public Timestamp getDate_disbursed() {
        return date_disbursed;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDate_disbursed(Timestamp date_disbursed) {
        this.date_disbursed = date_disbursed;
    }

    public void setFees_paid(int fees_paid) {
        this.fees_paid = fees_paid;
    }

    public void setId_number(int id_number) {
        this.id_number = id_number;
    }

    public void setLoan_id(String loan_id) {
        this.loan_id = loan_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer ()
    {

    }
}

