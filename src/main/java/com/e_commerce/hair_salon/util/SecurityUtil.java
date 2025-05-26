package com.e_commerce.hair_salon.util;

import com.e_commerce.hair_salon.component.JwtProperties;
import com.e_commerce.hair_salon.util.constant.Constants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.jwt.JwsHeader;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

@Service
public class SecurityUtil {

    @Value("${jwt.access-token-validity-in-seconds}")
    public int accessTokenExpiration;

    @Value("${jwt.refresh-token-validity-in-seconds}")
    public int refreshTokenExpiration;

    private final JwsHeader jwsHeader = JwsHeader.with(Constants.JWT_ALGORITHM).build();
    private final JwtEncoder jwtEncoder;

    public SecurityUtil(JwtEncoder jwtEncoder, JwtProperties jwtProperties) {
        this.jwtEncoder = jwtEncoder;
    }

    //    Create access token
    public String createAccessToken(String email) {
        Instant now = Instant.now();
        Instant validity = now.plus(accessTokenExpiration, ChronoUnit.SECONDS);

        JwtClaimsSet claims = JwtClaimsSet.builder()
                .issuedAt(now)
                .expiresAt(validity)
                .subject(email)
                .build();

        return this.jwtEncoder.encode(JwtEncoderParameters.from(jwsHeader, claims)).getTokenValue();
    }

    //    Create refresh token
    public String createRefreshToken(String email) {
        Instant now = Instant.now();
        Instant validity = now.plus(refreshTokenExpiration, ChronoUnit.SECONDS);

        JwtClaimsSet claims = JwtClaimsSet.builder()
                .issuedAt(now)
                .expiresAt(validity)
                .subject(email)
                .build();

        return this.jwtEncoder.encode(JwtEncoderParameters.from(jwsHeader, claims)).getTokenValue();
    }


}
