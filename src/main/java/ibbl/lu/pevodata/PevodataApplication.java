package ibbl.lu.pevodata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PevodataApplication {

    public static void main(String[] args) {
        SpringApplication.run(PevodataApplication.class, args);
    }

}
