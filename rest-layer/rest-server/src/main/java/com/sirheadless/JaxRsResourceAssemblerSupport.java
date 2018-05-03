import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.jaxrs.JaxRsLinkBuilder;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

public abstract class JaxRsResourceAssemblerSupport<T, D extends ResourceSupport> extends ResourceAssemblerSupport<T, D > {

    private final Class<?> controllerClass;


    public JaxRsResourceAssemblerSupport(Class<?> controllerClass, Class<D> resourceType) {
        super(controllerClass, resourceType);
        this.controllerClass = controllerClass;
    }

    protected D createResourceWithId(Object id, T entity, Object... paramters) {
        D instance = instantiateResource(entity);

        instance.add(JaxRsLinkBuilder.linkTo(controllerClass, paramters).slash(id)
                .withSelfRel());
        return instance;
    }
}
