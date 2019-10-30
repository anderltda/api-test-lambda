package com.aws.codestar.projecttemplates.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.HashMap;
import java.util.Map;

import com.aws.codestar.projecttemplates.GatewayResponse;

/**
 * Handler for requests to Lambda function.
 */
public class HelloWorldHandler implements RequestHandler<Object, Object> {

    public Object handleRequest(final Object input, final Context context) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("X-Custom-Header", "application/json");
        System.err.println("This is a test log message 1");
        System.err.println("This is a test log message 2");

        StringBuilder builder = new StringBuilder();
        
        builder.append("{ ");
        
        builder.append("\"name\"");
        builder.append(" : ");
        builder.append("\"Anderson\"");
        
        builder.append(",");
        
        builder.append("\"nickname\"");
        builder.append(" : ");
        builder.append("\"anderltda\"");
        
        builder.append(",");
        
        builder.append("\"lastname\"");
        builder.append(" : ");
        builder.append("\"Nascimento\"");
        
        builder.append(",");
        
        builder.append("\"age\"");
        builder.append(" : ");
        builder.append("\"35\"");
        
        
        builder.append(" }");
        
        
        return new GatewayResponse(builder.toString(), headers, 200);
    }
}
