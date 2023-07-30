## Projeto Exemplo SpringBoot
Este projeto foi criado utilizando o Guia no site https://spring.io/guides/gs/spring-boot/, e voltado para aprendizado do Spring Boot e criação de um projeto Web Simples

## Anotações utilizadas
- @SpringBootApplication -> declaração na classe principal Spring Boot
- @Bean -> Recupera oque e colocado no metodo CommandLineRunner e o imprime
- @SpringBootTest -> Fazer teste unitario
- @AutoConfigureMockMvc -> Usada para simular uma requisição HTTP, retorna um JSON com algum status
- @Test -> Fazer teste unitario
-  Modulo actuator module -> Gerenciar aplicação em tempo de execução, Este modulo contem alguns Endpoints: ex: /actuator/health

- Teste do actuator module
- Endpint: http://localhost:8080/actuator/health
- Metodo GET
- Esse metodo me retorna o status da aplicação no caso abaixo 'UP'

![image](https://github.com/victorvaz001/ProjetoExemploSpringBoot/assets/42657636/db41bdd9-b3b4-4676-95c8-3364d269af1e)

- Teste da aplicação
- Endpint: - http://localhost:8080/
- Metodo GET
- Esse metodo me retorna oque está na classe principal, no caso 'Greetings from Spring Boot!'

![image](https://github.com/victorvaz001/ProjetoExemploSpringBoot/assets/42657636/d5e527f5-0ad7-4ddb-96ec-19a004e05a76)
  
  

  
