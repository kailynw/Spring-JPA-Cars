package com.williams.kailyn.learningjpa.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

@Entity()
@Table(name="cars")
public class Cars {

    @Id
    @SequenceGenerator(
            name="cars_sequence",
            sequenceName = "cars_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cars_sequence")
    @Column(name="id", updatable=false, nullable = false)
    private long id;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="imported_from", nullable = false)
    private String importedFrom;
    @Column(name="sale_price", nullable = false)
    private String salePrice;
    @Column(name="is_rare", nullable = false)
    private Boolean isRare;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name="sale_date")
    private LocalDate saleDate;
    @Column(name="seller_email")
    private String sellerEmail;
    @Column(name="seller_phone_number")
    private String sellerPhoneNumber;

    public Cars(){}
    public Cars(String name, String importedFrom, String salePrice, Boolean isRare, LocalDate saleDate, String sellerEmail, String sellerPhoneNumber) {
        this.name = name;
        this.importedFrom = importedFrom;
        this.salePrice = salePrice;
        this.isRare = isRare;
        this.saleDate = saleDate;
        this.sellerEmail = sellerEmail;
        this.sellerPhoneNumber = sellerPhoneNumber;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImportedFrom() {
        return importedFrom;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public Boolean getRare() {
        return isRare;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public String getSellerPhoneNumber() {
        return sellerPhoneNumber;
    }
}
