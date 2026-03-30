# 🏥 Gestion Cabinet Médical

Application web de gestion d'un cabinet médical développée avec **Spring Boot** et **Thymeleaf**.

## 📋 Fonctionnalités

- ✅ Ajouter / Supprimer des patients
- ✅ Ajouter / Supprimer des consultations
- ✅ Lier une consultation à un patient
- ✅ Interface web avec Bootstrap 5

## 🛠 Technologies utilisées

| Technologie | Version |
|-------------|---------|
| Java | 17 |
| Spring Boot | 3.4.4 |
| Spring Data JPA | 3.4.4 |
| Thymeleaf | 3.1.3 |
| MySQL | 8.x |
| Bootstrap | 5.0.2 |
| Lombok | 1.18.36 |
| Maven | 3.x |

## 📁 Structure du projet
```
src/
├── main/
│   ├── java/ma/enset/gestion_cabinet/
│   │   ├── controller/
│   │   │   ├── PatientController.java
│   │   │   └── ConsultationController.java
│   │   ├── entity/
│   │   │   ├── Patient.java
│   │   │   └── Consultation.java
│   │   ├── repository/
│   │   │   ├── PatientRepository.java
│   │   │   └── ConsultationRepository.java
│   │   ├── service/
│   │   │   ├── IPatientService.java
│   │   │   ├── PatientService.java
│   │   │   ├── IConsultationService.java
│   │   │   └── ConsultationService.java
│   │   └── GestionCabinetApplication.java
│   └── resources/
│       ├── templates/
│       │   ├── patients/
│       │   │   ├── list.html
│       │   │   └── form.html
│       │   └── consultations/
│       │       ├── list.html
│       │       └── form.html
│       └── application.properties
```

## ⚙️ Configuration

Dans `src/main/resources/application.properties` :
```properties
spring.datasource.url=jdbc:mysql://localhost:3307/gestion_cabinet
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
server.port=8080
```

## 🚀 Installation et lancement

### Prérequis
- Java 17
- MySQL (XAMPP)
- Maven
- IntelliJ IDEA

### Étapes

1. **Cloner le projet**
```bash
git clone https://github.com/faizaERRIHANI/gestion_cabinet.git
cd gestion_cabinet
```

2. **Créer la base de données**
```sql
CREATE DATABASE gestion_cabinet;
```

3. **Lancer l'application**
```bash
mvn spring-boot:run
```

4. **Ouvrir dans le navigateur**
```
http://localhost:8080/patients
```

## 📸 Pages disponibles

| Page | URL |
|------|-----|
| Liste patients | http://localhost:8080/patients |
| Ajouter patient | http://localhost:8080/patients/new |
| Liste consultations | http://localhost:8080/consultations |
| Ajouter consultation | http://localhost:8080/consultations/new |

## 👩‍💻 Auteure

**Faiza Errihani**
- GitHub : [@faizaERRIHANI](https://github.com/faizaERRIHANI)
- Email : fa_errihani@etu.enset-media.ac.ma
- École : ENSET 
