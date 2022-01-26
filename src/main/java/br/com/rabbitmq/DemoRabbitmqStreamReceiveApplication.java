package br.com.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import br.com.rabbitmq.model.Pessoa;

@EnableBinding(Sink.class)
@SpringBootApplication
public class DemoRabbitmqStreamReceiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRabbitmqStreamReceiveApplication.class, args);
	}
	
	@StreamListener(Sink.INPUT)
	public void handle(Pessoa obj){
		System.out.println(obj.toString());
	}

}
