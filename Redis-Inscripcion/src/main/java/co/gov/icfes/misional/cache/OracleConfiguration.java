package co.gov.icfes.misional.cache;


	import oracle.jdbc.pool.OracleDataSource;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	import javax.sql.DataSource;
	import javax.validation.constraints.NotNull;
	import java.sql.SQLException;
	
	
	@Configuration	
	public class OracleConfiguration {
	    @NotNull
	    private String username;
	    @NotNull
	    private String password;
	    @NotNull
	    private String url;
	    public void setUsername(String username) {
	        this.username = username;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    public void setUrl(String url) {
	        this.url = url;
	    }
	    @Bean
	    DataSource dataSource() throws SQLException {
	        OracleDataSource dataSource = new OracleDataSource();
	        dataSource.setUser("MISIONAL_P");
	        dataSource.setPassword("misional_pn");
	        dataSource.setURL("jdbc:oracle:thin:@//192.168.147.240:1521/MISIONALDYP");
	        dataSource.setImplicitCachingEnabled(true);
	        dataSource.setFastConnectionFailoverEnabled(true);
	        return dataSource;
	    }
	}