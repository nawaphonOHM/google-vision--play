package nawaphon.googlecloud.googlevisionocrplay;


import nawaphon.googlecloud.googlevisionocrplay.dtos.MainResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class MainController {


    public MainController(){

    }



    @GetMapping("/get")
    public MainResponse firstGet() {

        return MainResponse.builder().build();
    }
}
