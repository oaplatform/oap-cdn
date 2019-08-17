package oap.cdn.service;

public class DefaultCdnResource implements CdnResource {
    private final String path;
    private final byte[] content;

    public DefaultCdnResource(String path, byte[] content) {
        this.path = path;
        this.content = content;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public byte[] getContent() {
        return content;
    }
}
