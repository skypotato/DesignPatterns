# DesignPatterns

'Head First Design Patterns' 책을 통한 공부.<br>
참고 : [예제 파일 URL](https://www.wickedlysmart.com/headfirstdesignpatterns)

## 목차
- [히스토리](## 히스토리)
- [디자인 원칙](## 디자인원칙)
- [Strategy Pattern](## StrategyPattern)
- [Observer Pattern](## ObserverPattern)
- [Decorator Pattern](## DecoratorPattern)
- [Facotory Method Pattern](## FacotoryMethodPattern)
- [Abstract Facotory Pattern](## AbstractFacotoryPattern)
## 히스토리
- 2019.12.30 : 첫 커밋.
- 2019.01.05 : 디자인 패턴 정리 1 ~ 4장

<div align="right"><b><a href="#">↥ back to top</a></b></div>

## 디자인원칙
- OCP(Open-Closed Principle) : 클래스는 확장에 대해서는 열려 있어야 하지만 코드 변경에 대해서는 닫혀 있어야 한다.(124p)
- 의존성 뒤집기 원칙(Dependency Inversion Principle) : 추상된 것에 의존하도록 만들고, 클래스에는 의존하지 않도록 만든다.(177p)

<div align="right"><b><a href="#">↥ back to top</a></b></div>

## StrategyPattern
가장 기본적인 디자인 패턴으로 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 한다.<br>
특징으로는 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.<br>

<div align="right"><b><a href="#">↥ back to top</a></b></div>

## ObserverPattern
한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고 자동으로 내용이 갱신되는 방식으로<br>
일대다(one-to-many) 의존성을 정의한다.<br>

<div align="right"><b><a href="#">↥ back to top</a></b></div>

## DecoratorPattern
객체에 추가적인 요건을 동적으로 첨가할 수 있는 패턴이다.<br>
데코레이터는 서브클래스를 만드는 것을 통해서 기능을 유연하게 확장할 수 있는 방법을 제공한다.<br>

<div align="right"><b><a href="#">↥ back to top</a></b></div>

## FacotoryMethodPattern
객체를 생성하기 위한 인터페이스를 정의하는데, 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정하게 만든다.<br>
즉, 팩토리 메소드 패턴을 사용하면, 클래스의 인스턴스 만드는 일은 서브클래스가 하게된다.

<div align="right"><b><a href="#">↥ back to top</a></b></div>

## AbstractFacotoryPattern
인터페이스를 이용하여 서로 연관된, 또는 의존하는 객체를 구상 클래스를 지정하지 않고도 생성할 수 있게한다.

<div align="right"><b><a href="#">↥ back to top</a></b></div>
