# 设计模式

## 总览

Classification|Purpose
-------|--------
Creational|The process of object creation
Structural|The composition of classes or objects
Behavioral|The way in which classes or objects interact and distribute responsibility


![](https://raw.githubusercontent.com/gavinThinking/blogimages/master/images/designpattern/Design%20pattern.JPG)

## 指导思想
- 组合优先于继承
- 面向接口编程而不是具体实现
- 隔离变化的和不变
- 高内聚和低耦合
- SOLID原则

名称|含义
---|----    
单一职责原则|仅仅有一个原因去修改一个类
开放封闭原则|对扩展开放，对修改封闭。换句话说，扩展一个类的行为，而不是修改它
里氏代换原则|程序中的对象应该是可以在不改变程序正确性的前提下被它的子类所替换的
依赖倒置原则|依赖于抽象而不是依赖于具体
接口隔离原则|多个特定客户端接口要好于一个宽泛用途的接口

- KISS原则（Keep It Simple, Stupid），设计当中应该注重简单原则  
- DRY原则（Don't repeat yourself），杜绝重复
