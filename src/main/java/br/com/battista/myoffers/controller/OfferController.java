package br.com.battista.myoffers.controller;

import br.com.battista.myoffers.constants.RestControllerConstant;
import br.com.battista.myoffers.model.Offer;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.SaveException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("api/v1/offer/")
public class OfferController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OfferController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET,
            produces = RestControllerConstant.PRODUCES)
    @ResponseBody
    public ResponseEntity<List<Offer>> getAll() {

        LOGGER.info("Retrieve all offers!");
        List<Offer> offers = ObjectifyService.ofy()
                .load()
                .type(Offer.class)
                .order("-updatedAt")
                .limit(10)
                .list();

        if (offers == null || offers.isEmpty()) {
            LOGGER.debug("No offers founds!");
            return buildResponseErro(HttpStatus.NO_CONTENT);
        } else {
            LOGGER.debug("Found {} offers!", offers.size());
            return buildResponseSuccess(offers, HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.POST,
            produces = RestControllerConstant.PRODUCES, consumes = RestControllerConstant.CONSUMES)
    @ResponseBody
    public ResponseEntity save(@RequestBody Offer offer) {

        LOGGER.info("Save to offer[{}]!", offer);
        try {
            offer.initEntity();

            ObjectifyService.ofy().save().entity(offer).now();
            LOGGER.debug("Save offer and generate to id: {}!", offer.getId());
            return buildResponseSuccess(HttpStatus.OK);
        } catch (SaveException ex) {
            LOGGER.debug("Erro to save offer, cause:{}!", ex.getLocalizedMessage());
            return buildResponseErro(ex.getLocalizedMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
