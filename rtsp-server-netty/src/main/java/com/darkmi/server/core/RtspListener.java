package com.darkmi.server.core;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.jboss.netty.handler.codec.http.HttpResponse;

/**
 * 
 * @author darkmi
 *
 */
public interface RtspListener {
	public void onRtspRequest(HttpRequest request, Channel chanel);
	public void onRtspResponse(HttpResponse response);
}
