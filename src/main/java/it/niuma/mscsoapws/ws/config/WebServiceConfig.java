package it.niuma.mscsoapws.ws.config;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.server.SmartEndpointInterceptor;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
//import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;
//import org.springframework.ws.soap.security.wss4j2.callback.SimplePasswordValidationCallbackHandler;
//import org.springframework.ws.soap.security.xwss.XwsSecurityInterceptor;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadRootSmartSoapEndpointInterceptor;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import it.niuma.mscsoapws.ws.endpoint.ServiceEndpoint;
import it.niuma.mscsoapws.ws.interceptor.CustomEndpointInterceptor;

//import it.niuma.SoapMsc.ws.interceptor.CustomEndpointInterceptor;
//import it.niuma.SoapMsc.ws.interceptor.CustomSmartEndpointInterceptor;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ws/*");
	}

	@Bean(name = "wsdl")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("MscWsPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("it.niuma.mscsoapws.ws");
		wsdl11Definition.setSchema(schema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema schema() {
		return new SimpleXsdSchema(new ClassPathResource("/schema/schema.xsd"));
	}


	@Bean
	public EndpointInterceptor endPointInterceptor() {
		CustomEndpointInterceptor interceptor = new CustomEndpointInterceptor();
		return interceptor;
	}


	@Bean
	public SmartEndpointInterceptor addSmartEndpointInterceptor(){

		PayloadRootSmartSoapEndpointInterceptor smartInterceptor = 
				new PayloadRootSmartSoapEndpointInterceptor(endPointInterceptor(), ServiceEndpoint.NAMESPACE, "getPOrderRequest");

		return smartInterceptor;
	}    

}
