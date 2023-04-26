
package com.porfolio.backEnd.security.jwt;


import com.porfolio.backEnd.security.entity.MainUser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

/**
 *
 * @author JAMES
 */
//Esta clase generara el token junto con metodos para validar el mismo.
@Component
public class JwtProvider {
    
    private final static Logger logger = LoggerFactory.getLogger(JwtProvider.class);
    
    @Value ("${jwt.secret}")
    private String secret;
    
    @Value ("${jwt.expiration}")
    private int expiration;
    
    public String generateToken(Authentication authentication){
        MainUser mainuser = (MainUser) authentication.getPrincipal();
        return Jwts.builder().setSubject(mainuser.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + expiration * 1000))
                .signWith(SignatureAlgorithm.ES512, secret)
                .compact();
        
    }
}
