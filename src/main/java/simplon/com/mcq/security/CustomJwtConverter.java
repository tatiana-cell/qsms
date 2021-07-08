package simplon.com.mcq.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;

// Example of non-anonymous class
// See SecurityConfig.jwtConverter()
public class CustomJwtConverter implements Converter<Jwt, JwtAuthenticationToken>

{
    @Override
    public JwtAuthenticationToken convert(Jwt jwt) {
	Collection<GrantedAuthority> authorities = extractAuthorities(jwt);
	String name = jwt.getClaim("sub"); // username
	return new JwtAuthenticationToken(jwt, authorities, name);
    }

    private Collection<GrantedAuthority> extractAuthorities(Jwt jwt) {
	Collection<GrantedAuthority> authorities = new HashSet<>();
	List<String> codes = jwt.getClaimAsStringList("authorities");
	// codes = ROLE_BASIC, ROLE_ADMIN
	if (null != codes && !codes.isEmpty()) {
	    for (String code : codes) {
		authorities.add(new SimpleGrantedAuthority(code));
	    }
	}
	return authorities;
    }
}
