package edu.badpals.stockx.item;

import java.util.List;

public interface Item {
     int getBid();
     int getAsk();
     int getSale();
     void addOffer();
     List<Offer> offers();
     void setBid();
     void setAsk();
     void setSale();

}
