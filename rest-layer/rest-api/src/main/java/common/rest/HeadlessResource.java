package common.rest;


import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.util.Assert;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class HeadlessResource<T> extends ResourceSupport {

    @JsonUnwrapped
    @XmlAnyElement(lax = true)
    private T content;

    public HeadlessResource() {super();}

    public HeadlessResource(T content, Link... links){
        this(content, Arrays.asList(links));
    }

    public HeadlessResource(T content, Iterable<Link> links) {
        Assert.notNull("Content must not be null");
        this.content = content;
        this.add(links);
    }
}
