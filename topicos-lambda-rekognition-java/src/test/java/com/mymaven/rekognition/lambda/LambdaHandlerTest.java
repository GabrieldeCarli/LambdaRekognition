package com.mymaven.rekognition.lambda;

import com.mymaven.rekognition.lambda.LambdaHandler;
import java.io.IOException;

import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.S3Event;

public class LambdaHandlerTest {


    private Context createContext() {
        TestContext ctx = new TestContext();
        return ctx;
    }

    @Test
    public void testS3AddItemEventHandler() throws IOException {
        
    	S3Event s3DeleteEvent = TestUtils.parse("/s3-event.put.json", S3Event.class);
    	LambdaHandler handler = new LambdaHandler();        
        handler.handleRequest(s3DeleteEvent, createContext());        
    }
    
    @Test
    public void testS3DeleteItemEventHandler() throws IOException {
        
    	S3Event s3DeleteEvent = TestUtils.parse("/s3-event.delete.json", S3Event.class);
    	LambdaHandler handler = new LambdaHandler();        
        handler.handleRequest(s3DeleteEvent, createContext());        
    }
}
