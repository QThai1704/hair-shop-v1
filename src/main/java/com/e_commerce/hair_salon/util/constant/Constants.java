package com.e_commerce.hair_salon.util.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.jose.jws.MacAlgorithm;

public class Constants {
    public static final MacAlgorithm JWT_ALGORITHM = MacAlgorithm.HS512;
}
