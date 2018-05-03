import models.FirstFake;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;

import java.util.Arrays;
import java.util.List;

public class FirstFakeControllerImpl implements FirstFakeController {


    @Override
    public Resources<FirstFakeResource> loadAllFirstFakes() {
        final List<FirstFake> allFirstFakes = Arrays.asList(new FirstFake(1L, "FirstFake1"), new FirstFake(2L, "FirstFake2"));

        return null;
    }

    private Resource<FirstFakeResource> convertToResources(final List<FirstFake> entities) {
        return null;
    }
}
