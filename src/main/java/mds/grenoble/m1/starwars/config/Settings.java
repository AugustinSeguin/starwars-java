package mds.grenoble.m1.starwars.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.annotation.JsonGetter;

@Configuration
@ConfigurationProperties("starwars.settings")
public class Settings {

	public enum Source {
		database, swapi
	}

	private Source source;

	@JsonGetter
	public Source getSource() {
		return source;
	}

	@JsonGetter
	public void setSource(Source source) {
		this.source = source;
	}
}
