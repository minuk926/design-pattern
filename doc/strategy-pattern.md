## **Strategy Pattern**
https://blogshine.tistory.com/5

전략 패턴은 **실행(런타임) 중에 알고리즘 전략을 선택하여 객체 동작을 실시간으로 바뀌도록** 할 수 있게 하는 **행위 디자인 패턴** 이다.

여기서 '전략'이란 일종의 알고리즘이 될 수 도 있으며, 기능이나 동작이 될 수도 있는 특정한 목표를 수행하기 위한 행동 계획을 말한다.

즉, 어떤 일을 수행하는 알고리즘이 여러가지 일때, 동작들을 미리 전략으로 정의함으로써 손쉽게 전략을 교체할 수 있는, **알고리즘 변형이 빈번하게 필요한 경우**에 적합한 패턴이다.

### **전략 패턴 구조**

[![Strategy-Pattern](https://blog.kakaocdn.net/dn/HxN2x/btrRNon41OS/C8Sthz6zrh4EeruIoSRLcK/img.png)](https://blog.kakaocdn.net/dn/HxN2x/btrRNon41OS/C8Sthz6zrh4EeruIoSRLcK/img.png)

- **전략 알고리즘 객체들** : 알고리즘, 행위, 동작을 객체로 정의한 구현체
- **전략 인터페이스** : 모든 전략 구현제에 대한 공용 인터페이스 
- **컨텍스트(Context)** : 알고리즘을 실행해야 할 때마다 해당 알고리즘과 연결된 전략 객체의 메소드를 호출.
- **클라이언트** : 특정 전략 객체를 컨텍스트에 전달 함으로써 전략을 등록하거나 변경하여 전략 알고리즘을 실행한 결과를 누린다.




>
>
> Info
>
>
>
> 프로그래밍에서의 ​컨텍스트(Context) 란 콘텐츠(Contetns)를 담는 그 무엇인가를 뜻한며, 어떤 객체를 핸들링 하기 위한 접근 수단이다.  
> 즉, 물컵에 물이 담겨있으면 물은 콘텐츠가 되고, 물컵은 컨텍스트가 되며, 물을 핸들링 하기 위한 접근 수단이 된다.
>
>

#### **전략 패턴은 OOP의 집합체**

**GoF의 디자인 패턴 책**에서는 전략 패턴을 다음과 같이 정의한다.

1. 동일 계열의 알고리즘군을 정의하고 
2. 각각의 알고리즘을 캡슐화하여 
3. 이들을 상호 교환이 가능하도록 만든다.
4. 알고리즘을 사용하는 클라이언트와 상관없이 독립적으로
5. 알고리즘을 다양하게 변경할 수 있게 한다. 

무슨 논문글 같이 설명되어 있어 되게 심오하고 난도가 높은 패턴인줄은 알겠지만, 사실 전략 패턴은 우리가 지금까지 자바 언어를 공부하면서 배운 여러 객체 지향 문법 기법들인, SOLID 원칙의 [OCP 원칙Visit Website](https://inpa.tistory.com/entry/OOP-%F0%9F%92%A0-%EC%95%84%EC%A3%BC-%EC%89%BD%EA%B2%8C-%EC%9D%B4%ED%95%B4%ED%95%98%EB%8A%94-OCP-%EA%B0%9C%EB%B0%A9-%ED%8F%90%EC%87%84-%EC%9B%90%EC%B9%99), [DIP 원칙Visit Website](https://inpa.tistory.com/entry/OOP-%F0%9F%92%A0-%EC%95%84%EC%A3%BC-%EC%89%BD%EA%B2%8C-%EC%9D%B4%ED%95%B4%ED%95%98%EB%8A%94-DIP-%EC%9D%98%EC%A1%B4-%EC%97%AD%EC%A0%84-%EC%9B%90%EC%B9%99)과 [합성(compositoin)Visit Website](https://inpa.tistory.com/entry/OOP-%F0%9F%92%A0-%EA%B0%9D%EC%B2%B4-%EC%A7%80%ED%96%A5%EC%9D%98-%EC%83%81%EC%86%8D-%EB%AC%B8%EC%A0%9C%EC%A0%90%EA%B3%BC-%ED%95%A9%EC%84%B1Composition-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0), [다형성(polymorphism)Visit Website](https://inpa.tistory.com/entry/OOP-JAVA%EC%9D%98-%EB%8B%A4%ED%98%95%EC%84%B1Polymorphism-%EC%99%84%EB%B2%BD-%EC%9D%B4%ED%95%B4), [캡슐화(encapsulation)Visit Website](https://inpa.tistory.com/entry/OOP-%EC%BA%A1%EC%8A%90%ED%99%94Encapsulation-%EC%A0%95%EB%B3%B4-%EC%9D%80%EB%8B%89%EC%9D%98-%EC%99%84%EB%B2%BD-%EC%9D%B4%ED%95%B4) 등 OOP 기술들의 총 집합 버전이라고 보면 된다.

[![Strategy-Design-Pattern](https://blog.kakaocdn.net/dn/Ijn2V/btrRJOV1d8t/wMcerAMWkzP111NiF5WPN1/img.png)](https://blog.kakaocdn.net/dn/Ijn2V/btrRJOV1d8t/wMcerAMWkzP111NiF5WPN1/img.png)

따라서 위의 전략 패턴의 정의를 다음과 같이 빗대어 설명하면 이해하기 쉬울 것이다.

1. 동일 계열의 알고리즘군을 정의하고 → 전략 구현체로 정의
2. 각각의 알고리즘을 캡슐화하여 → 인터페이스로 추상화
3. 이들을 상호 교환이 가능하도록 만든다. → 합성(composition)으로 구성
4. 알고리즘을 사용하는 클라이언트와 상관없이 독립적으로 → 컨텍스트 객체 수정 없이
5. 알고리즘을 다양하게 변경할 수 있게 한다. → 메소드를 통해 전략 객체를 실시간으로 변경함으로써 전략을 변경

---

### **전략 패턴 흐름**

#### **클래스 구성**

[![Strategy-Design-Pattern](https://blog.kakaocdn.net/dn/bgL1Tk/btrSarkDAYW/gNW27vTzkK9YaFIbqTSTrk/img.png)](https://blog.kakaocdn.net/dn/bgL1Tk/btrSarkDAYW/gNW27vTzkK9YaFIbqTSTrk/img.png)

java

```
// 전략(추상화된 알고리즘)
interface IStrategy {
    void doSomething();
}

// 전략 알고리즘 A
class ConcreteStrateyA implements IStrategy {
    public void doSomething() {}
}

// 전략 알고리즘 B
class ConcreteStrateyB implements IStrategy {
    public void doSomething() {}
}
```

java

```
// 컨텍스트(전략 등록/실행)
class Context {
    IStrategy Strategy; // 전략 인터페이스를 합성(composition)
	
    // 전략 교체 메소드
    void setStrategy(IStrategy Strategy) {
        this.Strategy = Strategy;
    }
	
    // 전략 실행 메소드
    void doSomething() {
        this.Strategy.doSomething();
    }
}
```

#### **클래스 흐름**

[![Strategy-Design-Pattern](https://blog.kakaocdn.net/dn/bgNiwd/btrSarLJEed/mXpvkQqeCHxENHlzN24G40/img.png)](https://blog.kakaocdn.net/dn/bgNiwd/btrSarLJEed/mXpvkQqeCHxENHlzN24G40/img.png)

java

```
// 클라이언트(전략 교체/전략 실행한 결과를 얻음)
class Client {
    public static void main(String[] args) {
        // 1. 컨텍스트 생성
        Context c = new Context();

        // 2. 전략 설정
        c.setStrategy(new ConcreteStrateyA());

        // 3. 전략 실행
        c.doSomething();

        // 4. 다른 전략 설정
        c.setStrategy(new ConcreteStrateyB());

        // 5. 다른 전략 시행
        c.doSomething();
    }
}
```

---

### **전략 패턴 특징**

#### **전략 패턴 사용 시기**

- 전략 알고리즘의 여러 버전 또는 변형이 필요할 때 클래스화를 통해 관리
- 알고리즘 코드가 노출되어서는 안 되는 데이터에 액세스 하거나 데이터를 활용할 때 (캡슐화)
- 알고리즘의 동작이 런타임에 실시간으로 교체 되어야 할때

#### **전략 패턴 주의점**

1. 알고리즘이 많아질수록 관리해야할 객체의 수가 늘어난다는 단점이 있다.
2. 만일 어플리케이션 특성이 알고리즘이 많지 않고 자주 변경되지 않는다면, 새로운 클래스와 인터페이스를 만들어 프로그램을 복잡하게 만들 이유가 없다.
3. 개발자는 적절한 전략을 선택하기 위해 전략 간의 차이점을 파악하고 있어야 한다. (복잡도 ↑)

실무에서 찾아보는 Strategy 패턴
 
Java

Collections의 sort() 메서드에 의해 구현되는 compare() 메서드에 이용
javax.servlet.http.HttpServlet에서 service() 메서드와 모든 doXXX() 메서드에 이용
javax.servlet.Filter의 doFilter() 메서드에 이용

Comparator 
사실 자바에서 익명 클래스로 구현체를 그때그때 정의하고 안의 동작 메소드의 로직을 그때그때 만들어 할당하는 방식도 일종의 전략을 실시간으로 변경하여 지정하는 패턴과 많이 유사하다고 볼 수 있다.
javaclass StrategyInJava {
public static void main(String[] args) {
List<Integer> numbers = new ArrayList<>();
numbers.add(2);
numbers.add(1);
numbers.add(3);
numbers.add(5);
numbers.add(4);

        // sort 메서드의 매개변수로 익명 클래스로 Comparator 객체를 인스턴스화하여
        // 그 안의 compare 메서드 동작 로직(ConcreteStrategy)를 직접 구현하여 할당하는 것을 볼 수 있다.
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(numbers);
    }
}Copy




Spring Framework
javapublic class StrategyInSpring {
public static void main(String[] args) {
// 각각의 설정에 따라 나눠진 ApplicationContext 들
ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
ApplicationContext applicationContext1 = new FileSystemXmlApplicationContext();
ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext();

        BeanDefinitionParser parser;
        
        PlatformTransactionManager platformTransactionManager; // 다양한 트랜잭션 메니저를 제공한다

        CacheManager cacheManager; // 다양한 캐시 전략을 제공 
    }
}Copy

Node.js
이부분은 노드를 다루는 자바스크립트 개발자들을 위한 예시이다. 디자인 패턴은 꼭 자바(java) 프로그래밍 언어에만 적용되는 사례가 아님을 보여주기 위해 넣어보았다.
 
Passport 라이브러리
passport.jsVisit Website 라이브러리는 네이버, 카카오, 페이스북 로그인과 같은 OAuth 로그인을 구현할때 사용되는 아주 유명한 자바스크립트 라이브러리 이다. 그리고 이 passport.js가 바로 전략 패턴으로 구성 되어 있다.
아래 코드를 보면 알수 있듯이, passport.use(new SNSStrategy(), ...) 처럼 passport.use()라는 메서드에 입력값으로 전략 객체를 만들어 로직을 수행하는 것을 볼 수 있다.
아직 전략 패턴을 배우기전에 왜 변수명을 Strategy 라고 명명하는지 몰랐었는데, 이제 패턴을 배우고 나니 상당히 구조적으로 짜여있다는 것을 느낄 수 있을 것이다.
javascriptconst passport = require('passport'); // passport.js의 객체 가져오기
const KakaoStrategy = require('passport-kakao').Strategy;
const NaverStrategy = require('passport-naver-v2').Strategy;
const GoogleStrategy = require('passport-google-oauth20').Strategy;

// 카카오 로그인 전략 등록
passport.use(new KakaoStrategy({ clientID, callbackURL }, async (accessToken, refreshToken, profile, done) => {
// ...
});

// 네이버 로그인 전략 등록
passport.use(new NaverStrategy({ clientID, clientSecret, callbackURL }, async (accessToken, refreshToken, profile, done) => {
// ...
});

// 구글 로그인 전략 등록
passport.use(new GoogleStrategy({ clientID, clientSecret, callbackURL }, async (accessToken, refreshToken, profile, done) => {
// ...
});Copy

비슷한 디자인 패턴 비교
 
Strategy vs Temaplate Method
 
패턴 유사점

전략 패턴과 템플릿 메서드 패턴은 알고리즘을 때에 따라 적용한다는 컨셉으로써, 둘이 공통점을 가지고 있다.
전략 및 템플릿 메서드 패턴은 개방형 폐쇄 원칙Visit Website을 충족하고 코드를 변경하지 않고 소프트웨어 모듈을 쉽게 확장할 수 있도록 하는 데 사용할 수 있다. 

 
패턴 차이점

전략 패턴은 합성(composition)을 통해 해결책을 강구하며, 템플릿 메서드 패턴은 상속(inheritance)을 통해 해결책을 제시한다.
그래서 전략 패턴은 클라이언트와 객체 간의 결합이 느슨한 반면, 템플릿 메서드 패턴에서는 두 모듈이 더 밀접하게 결합된다. (결합도가 높으면 안좋음)
전략 패턴에서는 대부분 인터페이스를 사용하지만, 템플릿 메서드 패턴서는 주로 추상 클래스나 구체적인 클래스를 사용한다.
전략 패턴에서는 전체 전략 알고리즘을 변경할 수 있지만, 템플릿 메서드 패턴에서는 알고리즘의 일부만 변경되고 나머지는 변경되지 않은 상태로 유지된다. (템플릿에 종속)
따라서 단일 상속만이 가능한 자바에서 상속 제한이 있는 템플릿 메서드 패턴보다는, 다양하게 많은 전략을 implements 할 수 있는 전략 패턴이 협업에서 많이 사용되는 편이다.
출처: https://inpa.tistory.com/entry/GOF-💠-전략Strategy-패턴-제대로-배워보자 [Inpa Dev 👨‍💻:티스토리]


출처: [https://inpa.tistory.com/entry/GOF-💠-전략Strategy-패턴-제대로-배워보자](https://inpa.tistory.com/entry/GOF-%F0%9F%92%A0-%EC%A0%84%EB%9E%B5Strategy-%ED%8C%A8%ED%84%B4-%EC%A0%9C%EB%8C%80%EB%A1%9C-%EB%B0%B0%EC%9B%8C%EB%B3%B4%EC%9E%90) [Inpa Dev 👨‍💻:티스토리]