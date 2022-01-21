# spring-pet-clinic
1. SOLID: S Single Responsibility: Tính đơn nhiệm

2. Dependency Injection vs Dependency Inversion
   Khác nhau

3. Các loại di
   1. Property
   2. Setter
   3. Construtor(Best). Nhớ field được @Autowired thì đánh là private final

4. Có thể DI với private property được không?
   1. Có, vì nó sử dụng reflection để inject(Ko chỉ DI và get value từ file nó cũng làm được). Tuy nhiên đây là cách ko nên làm
      (Bad Practice)
5. Best practice là sử dụng DI với 1 concrete class?
   1. Không, sử dụng interface là tốt nhất, nó giúp linh động hơn trong việc chọn Implement

6. Annotation nào được sử dụng để chỉ ra mình muốn 1 dependency được injected
   @Autowired

7. If you have two beans of the same type, how do you specify a preference for one over the other?
   @Primary. Bean được đánh annotation này sẽ được chọn là Implement mặc định nếu ko được chỉ rõ ra bằng @Qualifier

8. 2 callback intefaces nào được sử dụng để có thể hook into bean lifecycle(Tức là phạm vi chỉ bean nào implement thôi)
   InitilizingBean and DisposableBean(destroy)

9. 2 Anotation nào có thể được sử dụng để access Spring Bean lifecycle(phạm vi Bean)
   @PostConstruct, @PreDestroy

10. Chỉ ra bean name mà mình muốn được injected
    @Qualifier