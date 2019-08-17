package oap.cdn.service;

public interface CdnResource<Resource> {
    Resource getPath();
    byte[] getContent();
}
