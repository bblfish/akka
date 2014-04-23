package akka.http.model.japi;

import akka.actor.ActorRefFactory;
import akka.stream.FlowMaterializer;
import akka.util.ByteString;
import org.reactivestreams.api.Producer;

public interface HttpEntity {
    boolean isKnownEmpty();
    boolean isRegular();
    boolean isChunked();
    boolean isDefault();
    boolean isCloseDelimited();

    ContentType contentType();

    Producer<ByteString> getDataBytes(ActorRefFactory refFactory);

    public static final HttpEntity Empty = akka.http.model.HttpEntity.Empty;
}
