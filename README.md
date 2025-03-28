# ✈️ SkyVoyage - Flight Booking System

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.1.5-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![Security](https://img.shields.io/badge/Security-BCrypt-green)

A modern flight booking platform with secure role-based access, real-time reservations, and comprehensive admin controls.

## 🌟 Highlights

### 🔒 Security Features
- JWT Authentication
- Role-based authorization (ADMIN/USER)
- Password encryption with BCrypt
- CSRF protection

### 🛫 Flight Management
- Real-time seat availability
- Dynamic pricing engine
- Multi-city search
- Booking history

### 👨‍💻 Admin Features
- Flight CRUD operations
- User management
- Booking analytics dashboard
- Revenue reports

## 🛠 Tech Stack

**Backend:**
- Spring Boot 3.1
- Spring Data JPA
- Hibernate ORM
- Spring Security

**Frontend:**
- Thymeleaf templates
- Bootstrap 5
- Chart.js (for analytics)

**Database:**
- MySQL 8.0
- Redis (for caching)

## 🚀 Quick Start

1. **Prerequisites:**
   - Java 17+
   - MySQL 8.0+
   - Maven 3.8+

2. **Configuration:**
   ```properties
   # application.properties
   spring.datasource.url=jdbc:mysql://localhost:3306/skyvoyage
   spring.datasource.username=dbuser
   spring.datasource.password=securepass123
   spring.jpa.hibernate.ddl-auto=update"# SkyVoyage" 
