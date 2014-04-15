package akka.http.model.japi;

public interface HttpResponseBuilder {
    HttpResponse build();

    HttpResponseBuilder protocol(HttpProtocol protocol);
    HttpResponseBuilder status(StatusCode statusCode);
    HttpResponseBuilder status(int statusCode);
    HttpResponseBuilder entity(HttpEntity entity);
    HttpResponseBuilder addHeader(HttpHeader header);
    HttpResponseBuilder addHeaders(Iterable<HttpHeader> headers);
}
