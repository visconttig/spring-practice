# 🧠 BusinessCalculationService – Spring Into Calculations!

Welcome to **BusinessCalculationService**, the app where Java meets Spring, and business logic meets... numerical supremacy. This micro-but-mighty project is all about flexing those Spring Framework muscles – constructor injection, component scanning, and bean wrangling – all wrapped up in a clean, professional Java 17 package. And yes, it finds the biggest number in a list. That's its entire job. But it does it *so well*.

---

## 💼 Your Challenge (a.k.a. The Brief)

Your mission, should you choose to accept it (which I clearly did), was to:

1. 🧱 Create appropriate interfaces and classes to encapsulate data access logic.
2. 🚀 Use **constructor injection** to inject dependencies the Spring way.
3. 👑 Make `MongoDbDataService` the **primary bean** (because clearly, it brings the big numbers).
4. 🌱 Spin up a **Spring Application Context** – annotation-based only (no XML time machines here).
5. 🧮 Retrieve a `BusinessCalculationService` bean and invoke the almighty `findMax()` method.

---

## ✅ The Result

Behold! The program fires up a Spring Boot application and prints the maximum number retrieved from the primary `DataService` bean. The logic is streamlined, elegant, and accurate. Here's what it does under the hood:

```java
Max number: 55.
```

Boom. Max found. Business calculated.

---

## 🛠️ Skills Practiced

This project demonstrates the following Spring Framework best practices and Java craftsmanship:

### ✅ **Spring Stereotype Annotations**

* Used `@Component` to register beans like a boss.
* No XML. No fuss. Just annotations and vibes.

### ✅ **Constructor Injection**

* Ensured immutability and testability by injecting dependencies through constructors.
* Clean, readable, and modern – just like your future codebase.

### ✅ **@Primary Bean Configuration**

* Clearly marked `MongoDbDataService` as the VIP of data services with `@Primary`.
* Guarantees consistent behavior without surprises from ambiguous beans.

### ✅ **Spring Application Context Bootstrapping**

* Leveraged `AnnotationConfigApplicationContext` for explicitly managing context.
* Combined with `@SpringBootApplication` for that startup smoothness.

### ✅ **Java 17 Features**

* Used Java 17, the LTS champion, to write future-proof, efficient, and clean code.

---

## 👨‍💻 Tech Stack

| Tool                 | Version              |
| -------------------- | -------------------- |
| Java                 | 17                   |
| Spring Boot          | Yes, please          |
| Annotations          | All day              |
| XML Config           | Not today, Satan     |
| Dependency Injection | Constructor style 💪 |

---

## 💎 Why This Project Rocks (a.k.a. Dear Recruiter)

* It showcases **clean architecture**: separation of concerns between business logic and data retrieval.
* It’s **idiomatic Spring**: no hacky workarounds, just pure DI and component scanning goodness.
* It’s **focused**: delivers a single responsibility clearly and effectively.
* It uses **modern Java** (17!), demonstrating up-to-date skillsets.
* It’s **extensible**: Want to switch to a PostgreSQL service later? Just add another bean and annotate away.

---

## 📦 How to Run

Clone it, build it, run it:

```bash
./mvnw spring-boot:run
```

Or simply:

```bash
java -jar business-calculation-service.jar
```

Watch it go. Marvel at that maximum.

---

## 🎉 Final Thoughts

This project might be small, but it packs a punch – combining clean design, Spring best practices, and just a dash of humor (because programming should be fun, too).

Now go ahead, give it a star ⭐, and remember: if you ever need to find the biggest number from a set, you know who to call.
