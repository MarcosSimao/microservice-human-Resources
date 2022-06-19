package ms.api.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/works/**")
                        .uri("http://localhost:8001/")

                       )

                .route(r -> r.path("/payments/**")
                        .uri("http://localhost:8002/")
                        )
                .build();
    }
}
