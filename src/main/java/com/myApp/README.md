# Калькулятор заработка ООП
##### Считает отработанные часы и количество сделанной продукции
> На данный момент калькулятор статичен. 
> Чтобы вести подсчет нужно ввести данные в код непосредственно.
### Как пользоваться:
1. Создадим обьек класа `Salary` и вызовом метод `mySalaryInfo()`:
```java
Salary salary = new Salary();
salary.mySalaryInfo();
```
2. В классе `Salary` заполним массивы:
```java
private final double[] workingHours = {};
private final double[] manufacturedTon = {};
```
> `workingHours` - количество часов.
> `manufacturedTon` - количество тоннажа.
3. Ввести оплату:
```java
private final double priceHours = 62.5;
private final double priceTon = 75;
```
> `priceHours` - оплата за час.
> `priceTon` - оплата за тонну.
4. Если был получен аванс, то нужно присвоить значение переменной:
```java
private final double prepayment;
```
