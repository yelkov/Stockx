package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;
import edu.badpals.stockx.item.Sale;

import java.util.List;
import java.util.Optional;

public class LastSale implements Criteria{

    public LastSale(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        Criteria sales = new Sales();
        List<Offer> salesList = sales.checkCriteria(item);

        return !salesList.isEmpty()? List.of(salesList.getLast()):List.of();

    }
}
