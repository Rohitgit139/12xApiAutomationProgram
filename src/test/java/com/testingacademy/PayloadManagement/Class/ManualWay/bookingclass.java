package com.testingacademy.PayloadManagement.Class.ManualWay;

public class bookingclass {
  //  {
  //      "firstname" : "Jim",
    //        "lastname" : "Brown",
      //      "totalprice" : 111,
        //    "depositpaid" : true,
          //  "bookingdates" : {
       // "checkin" : "2018-01-01",
         //       "checkout" : "2019-01-01"
   // },
     //   "additionalneeds" : "Breakfast


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public Boolean getDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(Boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public Booking_dates getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(Booking_dates bookingdates) {
        this.bookingdates = bookingdates;
    }

    private String firstname;
    private String lastname;
    private Integer totalprice;
    private Boolean depositpaid;
    private Booking_dates bookingdates;

    }

