package nawaphon.googlecloud.googlevisionocrplay.services;

import nawaphon.googlecloud.googlevisionocrplay.dtos.MainResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gcp.vision.CloudVisionTemplate;
import org.springframework.stereotype.Service;

@Service
public class GoogleVisionManagerService {


    private final CloudVisionTemplate cloudVisionTemplate;

    @Autowired
    public GoogleVisionManagerService(final CloudVisionTemplate cloudVisionTemplate) {
        this.cloudVisionTemplate = cloudVisionTemplate;
    }


    public MainResponse create() {
        return null;
    }
}
