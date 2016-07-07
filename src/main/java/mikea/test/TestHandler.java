package mikea.test;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class TestHandler implements RequestHandler<Object, String> {
    @Override
    public String handleRequest(Object input, Context context) {
      return "***" + String.valueOf(input) + "***";
    }
}
