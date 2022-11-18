package com.ywj.api.utils;

import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * JsonWebToken登录认证
 */
@Component
public class JwtUtils {
    private long time = 1000 * 60 * 60;
    public final String signature = "admin";

    public String jwt() {
        JwtBuilder jwtBuilder = Jwts.builder();
        String jwtToken = jwtBuilder
                //添加header头部信息
                .setHeaderParam("typ", "JWT")
                .setHeaderParam("alg", "HS256")
                //payload(载荷)
                .claim("username", "tom")
                .claim("role", "admin")
                .setSubject("admin-test")
                .setExpiration(new Date(System.currentTimeMillis() + time))
                .setId(UUID.randomUUID().toString())
                //signature
                .signWith(SignatureAlgorithm.HS256, signature)
                .compact();
        return jwtToken;
    }
    public void parse(){
        String token = jwt();
        JwtParser jwtParser = Jwts.parser();
        Jws<Claims> headerClaimsJwt = jwtParser.setSigningKey(signature).parseClaimsJws(token);
        Claims body = headerClaimsJwt.getBody();
        System.out.println(body.get("username"));
        System.out.println(body.get("role"));
        System.out.println(body.getId());
        System.out.println(body.getSubject());
        System.out.println(body.getExpiration());
    }


    public static void main(String[] args){
        System.out.println("hello world");
    }
}
