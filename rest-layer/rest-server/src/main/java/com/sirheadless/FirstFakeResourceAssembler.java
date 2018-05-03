public class FirstFakeResourceAssembler extends JaxRsResourceAssemblerSupport<models.FirstFake, FirstFakeResource> {

    public FirstFakeResourceAssembler(Class<?> controllerClass, Class<FirstFakeResource> resourceType) {
        super(controllerClass, resourceType);
    }

    @Override
    public FirstFakeResource toResource(models.FirstFake entity) {
        final FirstFakeResource firstFakeResource = createResourceWithId(entity.getName(), entity);
//        model.FirstFake firstFakeObject = firstFakeResource.getContent();
        return null;
    }
}
