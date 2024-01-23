public class SpringSecurity {

    /*

    1.Spring security:


step: add some depandecy for security stare-securty and stater-web

step2: enable in main class @enbleWebsecurity

step3: RestControler
@RestController
@RequestMapping("/rest/auth")
public class ApplicationController {

	@GetMapping("/getMsg")
	public String greeting() {
		return "spring security example";
	}
we mention the end point


if deault login dispaly user password we need give user password deatils in application.proties(we are enble Enblewebsecurity)-basic authatication

based on the roles we need to custmized
DPO-user only acess create request and view
DL-user view the request and review the request they have apprioved or reject sned the reson
Adim- check all the all operatrion


we need create java class
in that we need to added @Configuration annation


@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Java Techie").password("Password").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("Basant").password("Password2").roles("USER");
	}

	// security for all API

	 @Override
	 protected void configure(HttpSecurity http) throws Exception {

	   http.csrf().disable();
	 http.authorizeRequests().anyRequest().fullyAuthenticated().and().
	 httpBasic(); }


// security based on URL


	 @Override protected void configure(HttpSecurity http) throws Exception {
	 http.csrf().disable();
	 http.authorizeRequests().antMatchers("/rest/**").fullyAuthenticated().and
	  ().httpBasic(); }


    // security based on ROLE
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/rest/**").hasAnyRole("ADMIN").anyRequest().fullyAuthenticated().and()
                .httpBasic();
    }

    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }

     */
}
