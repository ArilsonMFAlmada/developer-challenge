package io.overledger.springboottemplateservice.rabbitmq;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface TemplateOutputChannel {

    String CHANNEL_NAME = "template-channel";

    // To use as an input channel together with the TemplateChannelHandler, use the @Input annotation instead of @Output.
    @Output(TemplateOutputChannel.CHANNEL_NAME)
    public MessageChannel templateChannel();
}
