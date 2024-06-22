package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-13T13:51:03.717955700+02:00[Europe/Warsaw]")
@Controller
@RequestMapping("${openapi.bookShop.base-path:}")
public class PrintApiController implements PrintApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PrintApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
