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
in that we need to added @Configuration annation extends WebSecurityConfigurerAdapter




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

    JWT

Json web Token.

we are not share  hardcoded username and password to the client for mulitiple application. we share to JWT .

first time client enter the user name and password then server side generate the JWT token for access to all application url

in server side we need validate the username and password and then generate the JWT token.

In my project i have fallow the some steps add spring security with JWT.

1.we need to some depandecy like starer .securty, staert web,stater jpa add pom.xml

2.enble spring security in main class.

3.and then i create one enity for userdeatils

4.and then i have create Repositry and extends JPA reposirty

5. and then in main class i have inject the Repositry class and then  for getting userdeatis using @postConstoucor  and create on method
Config class
6.create congiration class using @configration and then extends to the WebSecurityConfigurerAdapter
7. ovride the configure(AuthenticationManagerBuilder auth)  method
8. @Override
    public AuthenticationManager authenticationManagerBean()
9.void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests().antMatchers("/authenticate")
                .permitAll().anyRequest().authenticated()
                .and().exceptionHandling().and().sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)


10.RestControler

inject jwt util
inject AuthenticationManager
endpoint url
create a method for genterate the JWT  using username and password

Filter Class
inject jwtutile
 @Override
    protected void doFilterInternal method


Service Class
public class CustomUserDetailsService

get the user datails



     */
}
