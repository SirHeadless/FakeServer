import common.rest.HeadlessResource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({FirstFake.class})
public class FirstFakeResource extends HeadlessResource<FirstFake> {

    public FirstFakeResource() {
        super(new FirstFake());
    }

}

