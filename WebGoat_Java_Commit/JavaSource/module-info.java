module WebGoat_Java_Commit {
	exports org.owasp.webgoat.lessons.RoleBasedAccessControl;
	exports org.owasp.webgoat.lessons.SQLInjection;
	exports org.owasp.webgoat.servlets;
	exports org.owasp.webgoat.session;
	exports org.owasp.webgoat.lessons.CrossSiteScripting;
	exports org.owasp.webgoat.util;
	exports org.owasp.webgoat.lessons;
	exports org.owasp.webgoat.lessons.admin;
	exports org.owasp.webgoat;

	requires axis;
	requires catalina;
	requires ecs;
	requires j2ee;
	requires java.rmi;
	requires java.sql;
	requires java.xml;
	requires servlet.api;
}