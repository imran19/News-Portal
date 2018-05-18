package com.example.controller;

/*import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceInstanceRestController {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping("/service-instances/{applicationName}")
	public List<ServiceInstance> serviceInstanceByApplicationName(@PathVariable String applicationName){
		return this.discoveryClient.getInstances(applicationName);
	}
}
*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Novost;

@RestController
public class ServiceInstanceRestController {

	@RequestMapping(value = "/novost", method = RequestMethod.GET)
	public Novost firstPage() {

		Novost n = new Novost();
		n.setNaslov("n1");
		n.setTekst("nesto");
		/*n.setId("1");*/
		

		return n;
	}

}