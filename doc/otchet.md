# Лабораторная работа №2: Наследование и ООП на примере покемонов

---

## Задание

На основе базового класса `Pokemon` написать свои классы для заданных видов покемонов. Каждый вид покемона должен иметь один или два типа и стандартные базовые характеристики:

- очки здоровья (HP)
- атака (attack)
- защита (defense)
- специальная атака (special attack)
- специальная защита (special defense)
- скорость (speed)

Классы покемонов должны наследоваться в соответствии с цепочкой эволюции покемонов. На основе базовых классов `PhysicalMove`, `SpecialMove` и `StatusMove` реализовать свои классы для заданных видов атак. Все разработанные классы, не имеющие наследников, должны быть реализованы таким образом, чтобы от них нельзя было наследоваться.

Атака должна иметь стандартные тип, силу (power) и точность (accuracy). Должны быть реализованы стандартные эффекты атаки. Назначить каждому виду покемонов атаки в соответствии с вариантом. Уровень покемона выбирается минимально необходимым для всех реализованных атак.

Используя класс симуляции боя `Battle`, создать 2 команды покемонов (каждый покемон должен иметь имя) и запустить бой.

Базовые классы и симулятор сражения находятся в jar-архиве (обновлен 9.10.2018, исправлен баг с добавлением атак и кодировкой). Документация в формате javadoc - здесь.

Информацию о покемонах, цепочках эволюции и атаках можно найти на сайтах http://poke-universe.ru, http://pokemondb.net, http://veekun.com/dex/pokemon

### Ход работы

1. Ознакомиться с документацией, обращая особое внимание на классы `Pokemon` и `Move`. При дальнейшем выполнении лабораторной работы читать документацию еще несколько раз.
2. Скачать файл `Pokemon.jar`. Его необходимо будет использовать как для компиляции, так и для запуска программы. Распаковывать его не надо! Нужно научиться подключать внешние jar-файлы к своей программе.
3. Написать минимально работающую программу и посмотреть как она работает.
   ```
   Battle b = new Battle();
   Pokemon p1 = new Pokemon("Чужой", 1);
   Pokemon p2 = new Pokemon("Хищник", 1);
   b.addAlly(p1);
   b.addFoe(p2);
   b.go();
   ```
4. Создать один из классов покемонов для своего варианта. Класс должен наследоваться от базового класса `Pokemon`. В конструкторе нужно будет задать типы покемона и его базовые характеристики. После этого попробуйте добавить покемона в сражение.
5. Создать один из классов атак для своего варианта (лучше всего начать с физической или специальной атаки). Класс должен наследоваться от класса `PhysicalMove` или `SpecialMove`. В конструкторе нужно будет задать тип атаки, ее силу и точность. После этого добавить атаку покемону и проверить ее действие в сражении. Не забудьте переопределить метод `describe`, чтобы выводилось нужное сообщение.
6. Если действие атаки отличается от стандартного, например, покемон не промахивается, либо атакующий покемон также получает повреждение, то в классе атаки нужно дополнительно переопределить соответствующие методы (см. документацию). При реализации атак, которые меняют статус покемона (наследники `StatusMove`), скорее всего придется разобраться с классом `Effect`. Он позволяет на один или несколько ходов изменить состояние покемона или модификатор его базовых характеристик.
7. Доделать все необходимые атаки и всех покемонов, распределить покемонов по командам, запустить сражение.

---

## Вариант покемонов и атак

| Покемон   | Атаки                                                                         |
|-----------|-------------------------------------------------------------------------------|
| Dhelmise  | Fire Blast, Calm Mind, Focus Blast, Bulldoze                                  |
| Clauncher | Water Pulse, Double Team, Venoshock                                           |
| Clawitzer | Water Pulse, Double Team, Venoshock, Dragon Pulse                             |
| Happiny   | Pound, Fire Blast                                                             |
| Chansey   | Pound, Fire Blast, Seismic Toss                                               |
| Blissey   | Pound, Fire Blast, Seismic Toss, Ice Beam                                     |

---

## Результат работы программы

```cmd
Blissey Чужой from the team Blue enters the battle!
Clauncher Хищник from the team White enters the battle!
Blissey Чужой использует Ice Beam!. 
Clauncher Хищник loses 3 hit points.

Clauncher Хищник misses

Blissey Чужой использует Ice Beam!. 
Clauncher Хищник loses 2 hit points.

Clauncher Хищник использует Water Pulse!. 
Blissey Чужой loses 4 hit points.

Blissey Чужой использует Seismic Toss!. 
Clauncher Хищник loses 4 hit points.

Clauncher Хищник misses

Blissey Чужой использует Ice Beam!. 
Clauncher Хищник loses 2 hit points.

Clauncher Хищник использует Water Pulse!. 
Blissey Чужой loses 5 hit points.

Blissey Чужой использует fire blast!. 
Clauncher Хищник loses 3 hit points.
Clauncher Хищник faints.
Clawitzer Димас from the team White enters the battle!
Clawitzer Димас использует Veno Shock!. 
Blissey Чужой loses 4 hit points.

Blissey Чужой использует fire blast!. 
Clawitzer Димас loses 3 hit points.

Clawitzer Димас misses

Blissey Чужой использует Seismic Toss!. 
Clawitzer Димас loses 5 hit points.

Clawitzer Димас использует Veno Shock!. 
Blissey Чужой loses 5 hit points.
Blissey Чужой faints.
Chansey Арсений from the team Blue enters the battle!
Clawitzer Димас использует Dragon Pulse!. 
Chansey Арсений loses 5 hit points.

Chansey Арсений использует fire blast!. 
Clawitzer Димас loses 3 hit points.

Clawitzer Димас использует Water Pulse!. 
Chansey Арсений loses 6 hit points.

Chansey Арсений использует Pound!. 
Clawitzer Димас loses 6 hit points.
Clawitzer Димас faints.
Happiny Владос from the team White enters the battle!
Chansey Арсений hits himself in confusion. 
Chansey Арсений loses 4 hit points.

Happiny Владос использует fire blast!. 
Chansey Арсений loses 5 hit points.
Chansey Арсений faints.
Dhelmise Антон from the team Blue enters the battle!
Dhelmise Антон использует Bulldoze!. 
Happiny Владос loses 5 hit points.
Happiny Владос decreases speed.

Happiny Владос использует Pound!. 
Dhelmise Антон loses 1 hit points.
Dhelmise Антон isn't affected by NORMAL

Happiny Владос использует Pound!. 
Dhelmise Антон loses 1 hit points.
Dhelmise Антон isn't affected by NORMAL

Dhelmise Антон использует Bulldoze!. 
Happiny Владос loses 6 hit points.
Happiny Владос decreases speed.

Happiny Владос использует fire blast!. 
Critical hit!
Dhelmise Антон loses 20 hit points.
Dhelmise Антон is burned
Dhelmise Антон faints.
Team Blue loses its last Pokemon.
The team White wins the battle!
```



---

## Выводы

В ходе выполнения лабораторной работы был получен практический опыт:

- Использования наследования классов
- Переопределения методов базовых классов для реализации специфичного поведения.
- Применения модификаторов `final` и `static` для управления наследованием и общими данными.
- Работы с пакетами и подключения внешних зависимостей с помощью оператора `import`.

---

## Исходный код

Исходный код лабораторной работы доступен в репозитории:  
[https://github.com/ledxdd/cse-labwork2](https://github.com/ledxdd/cse-labwork2)