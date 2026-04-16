# Cinema Center Management System

This project is a JavaFX-based automation system developed to manage all operational processes of a cinema, such as ticket sales, movie management, stock tracking, and staff organization.

## Technical Requirements

To run the application smoothly, the following components must be installed on your system:

1. **Java Development Kit (JDK):** Minimum JDK 17 (JDK 23 or 26 recommended).
2. **MySQL Server:** Version 8.0 or higher for database operations.
3. **Maven:** For dependency management (Maven Wrapper -mvnw- is available in the project directory).
4. **iText 7 Library:** Required for PDF ticket and receipt generation (automatically installed by Maven).

## User Roles and Permissions

The system offers three different authorization levels in accordance with the Role-Based Access Control (RBAC) structure:

### 1. Cashier
* **Sales Transactions:** Selection of movies in theaters and session tracking.
* **Seat Management:** Interactive seat selection and instant occupancy control for Hall A and Hall B.
* **Buffet Sales:** Inclusion of popcorn, beverages, and other side products in the ticket transaction.
* **Document Generation:** Automatic PDF ticket and payment receipt creation upon completion of sales.

### 2. Manager
* **Inventory Control:** Monitoring and updating stock quantities of buffet products.
* **Staff Management:** Defining new employees, deleting existing staff, or editing authorization information.
* **Financial Reporting:** Reporting total revenue, taxes paid, and net profit ratios.

### 3. Admin (System Administrator)
* **Movie Portfolio Management:** Adding new movies, updating or deleting posters, prices, and genre information.
* **Schedule Planning:** Assigning dates, times, and halls for movies.
* **Transaction Cancellation:** Canceling completed transactions. Cancellation automatically reverts product stocks and general revenue data.

## Installation and Configuration

### 1. Database Setup
* Create a database schema named `cinema_center` on MySQL.
* Import the content of the `src/main/resources/com/Database/Group15.sql` file into this schema.

### 2. Database Connection Settings
Open the `src/main/java/com/group15/Facade.java` file and update the following variables with your own MySQL information:
* `DB_USER`: Your database username.
* `DB_PASSWORD`: Your database password.

### 3. Starting the Application
Go to the main directory of the project via terminal or command line and run the following command:
```powershell
./mvnw clean javafx:run
```

## Default Login Credentials

| Role | Username | Password |
| :--- | :--- | :--- |
| **Admin** | admin1 | admin1 |
| **Manager** | manager1 | manager1 |
| **Cashier** | cashier1 | cashier1 |

---

## Application Screenshots

### Login Screen
(Place Login Screen photo here)

---

### Admin Menu
(Place Admin Menu photo here)

---

### Movie Management Screen
(Place Movie Management Screen photo here)

---

### Monthly Schedule Screen
(Place Monthly Schedule Screen photo here)

---

### Cashier Menu
(Place Cashier Menu photo here)

---

### Employee Management Screen
(Place Employee Management Screen photo here)

---

### Ticket Pricing Menu
(Place Ticket Pricing Menu photo here)

---

### Revenue Report Menu
(Place Revenue Report Menu photo here)

---

<br>
<br>

# Sinema Merkezi Yönetim Sistemi (TR)

---

Bu proje, bir sinema salonunun bilet satışı, film yönetimi, stok takibi ve personel organizasyonu gibi tüm operasyonel süreçlerini yönetmek için geliştirilmiş JavaFX tabanlı bir otomasyon sistemidir.

## Teknik Gereksinimler

Uygulamanın sorunsuz çalışabilmesi için sisteminizde aşağıdaki bileşenlerin kurulu olması gerekmektedir:

1. **Java Development Kit (JDK):** En az JDK 17 sürümü (JDK 23 veya 26 önerilir).
2. **MySQL Server:** Veritabanı işlemleri için sürüm 8.0 veya üzeri.
3. **Maven:** Bağımlılık yönetimi için (Proje dizininde Maven Wrapper -mvnw- mevcuttur).
4. **iText 7 Kütüphanesi:** PDF bilet ve makbuz üretimi için gereklidir (Maven tarafından otomatik yüklenir).

## Kullanıcı Rolleri ve Yetki Tanımları

Sistem, görev bazlı erişim kontrolü (RBAC) yapısına uygun olarak üç farklı yetki seviyesi sunar:

### 1. Kasiyer (Cashier)
* **Satış İşlemleri:** Vizyondaki filmlerin seçimi ve seans takibi.
* **Koltuk Yönetimi:** Salon A ve Salon B için interaktif koltuk seçimi ve anlık doluluk kontrolü.
* **Büfe Satışı:** Mısır, içecek ve diğer yan ürünlerin satışının bilet işlemine dahil edilmesi.
* **Belge Üretimi:** Satış tamamlandığında otomatik PDF bilet ve ödeme makbuzu oluşturma.

### 2. Müdür (Manager)
* **Envanter Kontrolü:** Büfe ürünlerinin stok miktarlarının izlenmesi ve güncellenmesi.
* **Personel Yönetimi:** Sisteme yeni çalışan tanımlama, mevcut personeli silme veya yetki bilgilerini düzenleme.
* **Finansal Raporlama:** Toplam hasılat, ödenen vergiler ve net kar oranlarının raporlanması.

### 3. Admin (Sistem Yöneticisi)
* **Film Portföy Yönetimi:** Yeni filmlerin sisteme eklenmesi, afiş, fiyat ve tür bilgilerinin güncellenmesi veya silinmesi.
* **Seans Planlama:** Filmlerin tarih, saat ve salon atamalarının yapılması.
* **İşlem İptali:** Satışı tamamlanmış işlemlerin iptal edilmesi. İptal işlemi, ilgili ürünlerin stoklarını ve genel hasılat verilerini otomatik olarak eski haline getirir.

## Kurulum ve Yapılandırma

### 1. Veritabanı Kurulumu
* MySQL üzerinde `cinema_center` adında bir veritabanı şeması oluşturun.
* `src/main/resources/com/Database/Group15.sql` dosyasını oluşturduğunuz bu şemaya içeri aktarın (Import).

### 2. Veritabanı Bağlantı Ayarları
`src/main/java/com/group15/Facade.java` dosyasını açarak aşağıdaki değişkenleri kendi MySQL bilgilerinizle güncelleyin:
* `DB_USER`: Veritabanı kullanıcı adınız.
* `DB_PASSWORD`: Veritabanı şifreniz.

### 3. Uygulamayı Başlatma
Terminal veya komut satırı üzerinden projenin ana dizinine giderek aşağıdaki komutu çalıştırın:
```powershell
./mvnw clean javafx:run
```

## Varsayılan Giriş Bilgileri

| Rol | Kullanıcı Adı | Şifre |
| :--- | :--- | :--- |
| **Admin** | admin1 | admin1 |
| **Müdür** | manager1 | manager1 |
| **Kasiyer** | cashier1 | cashier1 |

---

## Uygulama Görselleri

### Giriş Ekranı
### Login Screen
<img width="1918" height="1016" alt="Login_screen_cinema_center" src="https://github.com/user-attachments/assets/dda55b6c-e29d-4030-aaca-37bea7488ade" />


---

### Admin Menüsü
### Admin Menu
<img width="1918" height="1018" alt="Admin_menu_main_screen" src="https://github.com/user-attachments/assets/2410dc03-7358-40b9-bdbe-1c1136412aaf" />


---

### Film Yönetim Ekranı
### Movie Managemnt Screen
<img width="1918" height="1013" alt="Movie_management_screen" src="https://github.com/user-attachments/assets/b524e0fa-6703-43f1-a790-faf986a980c7" />


---

### Aylık Seans Planlama Ekranı
### Monthly Schedule Screen
<img width="1582" height="985" alt="Monthly_schedule_screen" src="https://github.com/user-attachments/assets/8ba70151-120a-41c7-9078-67d2a1399f5c" />


---

### Kasiyer Menüsü
### Cashier Menu
<img width="1800" height="992" alt="Cashier_menu_1" src="https://github.com/user-attachments/assets/436c4e0f-a3e3-4238-8a50-b90c76e11e92" />


---

### Çalışan Yönetim Ekranı
### Employee Screen<img width="1898" height="1002" alt="Employee_screen" src="https://github.com/user-attachments/assets/e986f3fa-1eef-4b1f-baae-fd4c80fe3673" />


---

### Bilet Fiyatlandırma Menüsü
### Ticket Pricing Menu
<img width="1897" height="1010" alt="Ticket_price_menu" src="https://github.com/user-attachments/assets/edd56ce6-761a-4b95-9ec0-bd6ee43241f1" />

---

### Hasılat Raporu Menüsü
### Revenue Menu
<img width="1892" height="1011" alt="Revenue_Report_Menu" src="https://github.com/user-attachments/assets/ff84878c-ce05-49a9-b814-086ba0c05a38" />


---

© 2025 Group 15 Cinema Center Management System
