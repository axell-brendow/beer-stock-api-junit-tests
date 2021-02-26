package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NegativeBeerStockException extends Exception {

    public NegativeBeerStockException(Long id, int quantityToIncrement) {
        super(String.format("Trying to decrement the stock of the beer with id %s by %s gives a negative number", id, quantityToIncrement));
    }
}
