package br.com.battista.myoffers.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Offer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Offer(String name) {
        this.name = name;
    }
}
