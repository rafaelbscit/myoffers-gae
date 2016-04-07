package br.com.battista.myoffers.controller;

import br.com.battista.myoffers.model.Offer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("api/v1/offer/")
public class OfferController extends BaseController {


    @RequestMapping(value = "/", method = RequestMethod.GET,
            produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<Offer>> getAll() {
        List<Offer> offers = new ArrayList<Offer>();

        offers.add(new Offer("A"));
        offers.add(new Offer("B"));
        offers.add(new Offer("C"));

        return buildResponseSuccess(offers, HttpStatus.OK);
    }

}
