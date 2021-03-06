package br.com.battista.myoffers.utils;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

import br.com.battista.myoffers.model.Offer;

/**
 * Created by rabsouza on 12/04/16.
 */
public class MergeBeanTest {

    @Test
    public void shouldMergeBeanBToBeanA() throws Exception {
        Offer a = new Offer();
        a.setName("A");

        Offer b = new Offer();
        b.setName("B");
        b.setCategory("B");

        new MergeBean().merge(a, b);

        assertThat(a.getName(), equalTo(b.getName()));
        assertThat(a.getCategory(), equalTo(b.getCategory()));
    }

    @Test
    public void shouldMergeBeanAToBeanB() throws Exception {
        Offer a = new Offer();
        a.setName("A");

        Offer b = new Offer();
        b.setName("B");
        b.setCategory("B");

        new MergeBean().merge(b, a);

        assertThat(b.getName(), equalTo(a.getName()));
        assertThat(b.getCategory(), equalTo("B"));
    }
}
