# Алгоритмы сортировки
##### 1. `QuickSort.java` - Быстрая сортировка

1. Импортируем клас сортировки:
```java
import com.example.algorithms.sorting.QuickSort;
```

2. Создадим экземпляр класа QuickSort:
```java
QuickSort quickSort = new QuickSort();
```
3. Создаём массив `item`, применяем сортировку `sortItem` и выводим на экран:
```java
int[] items = { 4, 1, 5, 3, 2 };

int[] sortItems = quickSort.sort(items);
// sortItems is {1, 2, 3, 4, 5}
System.out.println(Arrays.toString(sortItems));

```
