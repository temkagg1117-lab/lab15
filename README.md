# Lab 15 — Git Workflow + GitHub Actions CI/CD

Энэхүү төсөл нь F.CSM311 Программ хангамжийн бүтээлт хичээлийн Lab 15 даалгаварт зориулан Maven ашиглан боловсруулагдсан Java төсөл юм.

## Хэрэгжүүлсэн боломжууд

- GitHub Actions CI pipeline
- Java 17 болон Java 21 matrix build
- JaCoCo coverage report
- Branch protection workflow
- Pull Request дээр суурилсан хөгжүүлэлт

## Хийгдсэн функцууд

### StringUtils.reverse(String)

String-ийг урвуу дарааллаар буцаадаг utility функц нэмсэн.

Жишээ:

```java
StringUtils.reverse("hello");

Үр дүн:

olleh
Локал орчинд ажиллуулах
mvn clean verify
CI/CD

GitHub Actions автоматаар:
Төслийг build хийх
Unit test ажиллуулах
JaCoCo coverage шалгах
Java 17 болон Java 21 дээр тест хийх
```
![alt text](<Screenshot 2026-05-17 210907.png>)

![alt text](<Screenshot 2026-05-17 210932.png>)