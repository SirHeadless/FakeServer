import org.springframework.hateoas.Resources;

public class FirstFakeControllerImpl implements FirstFakeController {


    @Override
    public Resources<FirstFakeResource> loadAllFirstFakes() {
        return null;
    }
}
